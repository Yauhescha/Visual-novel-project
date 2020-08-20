package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class Dialog {
	private final GameEntityTypes type = GameEntityTypes.DIALOG;

	private String speakersName = "";
	private String[] text;

	public Dialog() {
	}

}
