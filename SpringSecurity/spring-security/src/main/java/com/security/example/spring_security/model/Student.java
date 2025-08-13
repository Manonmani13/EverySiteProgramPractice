package com.security.example.spring_security.model;

public class Student {
    private int rno;
    private String name;
    private String address; 
    private String email;

    public int getRno() {
        return rno;
    }   
    public void setRno(int rno) {
        this.rno = rno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;      

    }
    public String getAddress() {
        return address;
    }       

    public void setAddress(String address){
       this.address = address;
    }
    public String getEmail() {
        return email;
    }   

    public void setEmail(String email){
        this.email=email;
    }
    public Student(int rno, String name, String address, String email) {
        this.rno = rno;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Student() {
        // Default constructor
    }
}
