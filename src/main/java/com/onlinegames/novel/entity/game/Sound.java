package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;
import com.onlinegames.novel.types.SoundTypes;

import lombok.Data;

@Data
public class Sound {
	private final GameEntityTypes type = GameEntityTypes.SOUND;
	private SoundTypes soundType;
	private String soundName;
	private int fade;
	private boolean isPlay;
	private boolean isLoop;

	public Sound() {
	}

}
