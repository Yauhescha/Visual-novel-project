package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class IfCriterion {
	private final GameEntityTypes type = GameEntityTypes.IF_CRITERION;

	private String key;
	private boolean equals = true;
	private String value;

	public IfCriterion(String key, String value, boolean equals) {
		this.key = key;
		this.value = value;
		this.equals = equals;
	}

}
