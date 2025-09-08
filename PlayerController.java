package com.example.graphqlex.controller;

import com.example.graphqlex.model.Team;
import com.example.graphqlex.service.PlayerService;

import java.util.List;

@Controller

public class PlayerController {
    private final PlayerService playerService;
    public  PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @QueryMapping
    public List<com.example.graphql.model.Player> findAll(){
        return playerService.getPlayers();
    }

    @MutationMapping
    public Player create(@Arugment String name,@Argument Team team){
        return playerService.create(name,team);
    }

    @MutationMapping
    public Player update(@Arugment Integer id,@Arugment String name,@Argument Team team){
        return playerService.update(id,name,team);
    }

    @MutationMapping
    public Player delete(@Arugment Integer id){
        return playerService.delete(id);
    }

}

