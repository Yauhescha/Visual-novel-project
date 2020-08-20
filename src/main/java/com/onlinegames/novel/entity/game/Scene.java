package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;
import com.onlinegames.novel.types.SceneTypes;

import lombok.Data;

@Data
public class Scene {
	private final GameEntityTypes type =GameEntityTypes.SOUND;
	private SceneTypes sceneType;
	private String imageName;

	public Scene() {
	}

}
