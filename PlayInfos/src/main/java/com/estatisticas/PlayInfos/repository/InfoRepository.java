package com.estatisticas.PlayInfos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estatisticas.PlayInfos.model.InfoModel;

@Repository
public interface InfoRepository extends JpaRepository<InfoModel, String> {
    List<InfoModel> findByTeamName(String teamName);
}
