package com.casalitech.dslist.services;

import com.casalitech.dslist.dto.GameMinDTO;
import com.casalitech.dslist.entities.Game;

import com.casalitech.dslist.projections.GameMinProjection;
import com.casalitech.dslist.repositores.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public Game findById(Long id) throws Exception {
        return this.gameRepository.findById(id)
                // se o id do game nao encontrado
                .orElseThrow(() -> new Exception("Id não encontrado"));
    };

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();

    }

    // busca o jogos por lista
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> gamelist = gameRepository.searchByList(listId);
        return gamelist.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
