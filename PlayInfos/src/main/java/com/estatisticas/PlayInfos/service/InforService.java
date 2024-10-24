package com.estatisticas.PlayInfos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estatisticas.PlayInfos.model.InfoModel;
import com.estatisticas.PlayInfos.repository.InfoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InforService {
    private final InfoRepository infoRepository;

    public List<InfoModel> getAllInfoModels(){
        return infoRepository.findAll();
    }

    public List<InfoModel> findByTeamName(String teamName){
        return infoRepository.findAll();
    }
 
}
