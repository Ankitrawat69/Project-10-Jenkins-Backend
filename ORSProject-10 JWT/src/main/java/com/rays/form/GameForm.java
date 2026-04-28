package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GameDTO;

public class GameForm extends BaseForm {
	
	@NotEmpty(message = "playerName is required")
    public String playerName;
	
	@NotEmpty(message = "score is required")
	public String score;
	
	@NotEmpty(message = "level is required")
	public String level;
	
	@NotEmpty(message = "Gamerank is required")
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
	public BaseDTO getDto() {
		
		GameDTO dto = initDTO(new GameDTO());
		        dto.setPlayerName(playerName);
		        dto.setGameRank(gameRank);
		        dto.setLevel(level);
		        dto.setScore(score);
		 return dto;
	}

}
