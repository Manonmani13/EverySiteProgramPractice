package com.activation.mail_activation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    public User registerNewUserAccount(UserRegistrationDto userDto){

        User user=new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(userDto.getPassword()));
        user.setEnabled(false);
        userRepository.save(user);

         String token = UUID.randomUUID().toString();
        user.setVerificationToken(token);
        userRepository.save(user);

        String confirmationUrl = "http://localhost:8080/verify-email?token=" + token;
        emailService.sendEmail(user.getEmail(), "Email Verification", "Click the link to verify your email: " + confirmationUrl);

        return user;

    }

    public String validateVerificationToken(String token) {
        User user = userRepository.findByVerificationToken(token).orElse(null);
        if (user == null) {
            return "invalid";
        }

        user.setEnabled(true);
        userRepository.save(user);
        return "valid";
    }


}
