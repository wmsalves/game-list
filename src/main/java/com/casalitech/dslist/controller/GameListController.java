package com.casalitech.dslist.controller;

import com.casalitech.dslist.dto.GameListDTO;
import com.casalitech.dslist.dto.GameMinDTO;
import com.casalitech.dslist.services.GameListService;
import com.casalitech.dslist.services.GameService;
import com.casalitech.dslist.dto.ReplacementDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
@Tag(name = "Game Lista")
public class GameListController {
@Autowired
private GameListService gameListService;
    @Autowired
    private GameService gameService;
@GetMapping
@Operation(summary = "Listar Tipo de Game ", description = "Essa função é responsável por listar os tipos de games")

public List<GameListDTO> findAll(){
    List<GameListDTO>games=gameListService.findAll();
    return games;
}
    @GetMapping("/{listId}/games")
    @Operation(summary = "Listar os Games pelo tipo", description = "Essa função é responsável por listar os games pelo tipo")

    public List<GameMinDTO> findByList(@PathVariable  Long listId){
        List<GameMinDTO>games=gameService.findByList(listId);
        return games;
    }

    @PostMapping("/{listId}/replacement")
    @Operation(summary = "Mover a posição dos Games", description = "Essa função é responsável por listar os tipos de games")

    public void move(@PathVariable  Long listId, @RequestBody ReplacementDTO body){
gameListService.move(listId, body.getSourceIndex(),body.getDestinationIndex());
    }
}
