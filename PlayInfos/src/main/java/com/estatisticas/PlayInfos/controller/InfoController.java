package com.estatisticas.PlayInfos.controller;

import com.estatisticas.PlayInfos.model.InfoModel;
import com.estatisticas.PlayInfos.service.InforService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info")
@RequiredArgsConstructor
public class InfoController {
    private final InforService inforService;

    @GetMapping()
    public List<InfoModel> getAllInfo(){
        return inforService.getAllInfoModels();
    }

    @GetMapping("/team/{teamName}")
    public List<InfoModel> getPlayersByTeam(@PathVariable String teamName) {
        return inforService.findByTeamName(teamName);
    }

   
}
