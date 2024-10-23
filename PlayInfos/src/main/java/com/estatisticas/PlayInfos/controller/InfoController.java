package com.estatisticas.PlayInfos.controller;

import com.estatisticas.PlayInfos.model.InfoModel;
import com.estatisticas.PlayInfos.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoRepository infoRepository;

    @GetMapping("/team/{teamName}")
    public List<InfoModel> getPlayersByTeam(@PathVariable String teamName) {
        return infoRepository.findByTeamName(teamName);
    }
}
