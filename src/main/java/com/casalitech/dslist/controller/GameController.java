package com.casalitech.dslist.controller;

import com.casalitech.dslist.dto.GameMinDTO;

import com.casalitech.dslist.entities.Game;
import com.casalitech.dslist.services.GameService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
@Tag(name = "Games")
public class GameController {
@Autowired
private GameService gameService;
@GetMapping
@Operation(summary = "Lista de Games", description = "Listar todos os games")

public List<GameMinDTO> findAll(){
    List<GameMinDTO>games=gameService.findAll();
    return games;
}

    @GetMapping("/{id}")
    @Operation(summary = "Detalhe do Game", description = "Detalhar game")

    public Game findById(@PathVariable Long id) throws Exception {
  Game game=gameService.findById(id);
        return game;


    }

}
