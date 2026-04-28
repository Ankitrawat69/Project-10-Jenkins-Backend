package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_game")
public class GameDTO extends BaseDTO{
	
	@Column(name = "playerName", length = 50)
	public String playerName;
	
	@Column(name = "score", length = 50)
	public String score;
	
	@Column(name = "level", length = 50)
	public String level;
	
	@Column(name = "gameRank", length = 50)
	public String gameRank;


	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGameRank() {
		return gameRank;
	}

	public void setGameRank(String gameRank) {
		this.gameRank = gameRank;
	}

	@Override
	public String getValue() {
		return playerName;
	}

	@Override
	public String getUniqueKey() {
		return "playerName";
	}

	@Override
	public String getUniqueValue() {
		return playerName;
	}

	@Override
	public String getLabel() {
		return "Player Name";
	}

	@Override
	public String getTableName() {
		return "Game";
	}
}
