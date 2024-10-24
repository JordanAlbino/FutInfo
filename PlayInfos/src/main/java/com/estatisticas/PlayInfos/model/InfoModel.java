package com.estatisticas.PlayInfos.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "info")
@Data
public class InfoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id")
    private Integer infoId;

    @Column(name = "player_name", nullable = false, length = 50)
    private String playerName;

    @Column(name = "team_name", nullable = false, length = 20)
    private String teamName;

    @Column(name = "player_number", nullable = false)
    private Long playerNumber;

    @Column(name = "position", nullable = false, length = 20)
    private String  position;

    @Column(name = "goals_scored", nullable = false)
    private Long goalsScored;

    @Column(name = "assists", nullable = false)
    private Long assists;

    @Column(name = "yellow_cards", nullable = false)
    private Long yellowCards;

    @Column(name = "red_cards", nullable = false)
    private Long redCards;

    @Column(name = "matches_played", nullable = false)
    private Long matchesPlayed;

    @Column(name = "min_ball_possession", nullable = false)
    private Long minBallPossession;

    public InfoModel(Integer infoId, String playerName, String teamName, Long playerNumber, String position,
            Long goalsScored, Long assists, Long yellowCards, Long redCards, Long matchesPlayed,
            Long minBallPossession) {
        this.infoId = infoId;
        this.playerName = playerName;
        this.teamName = teamName;
        this.playerNumber = playerNumber;
        this.position = position;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.matchesPlayed = matchesPlayed;
        this.minBallPossession = minBallPossession;
    }

    public InfoModel() {
    }

}
