package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;
@Data
public class Jump {

	private final GameEntityTypes type=GameEntityTypes.JUMP;
    private String labelName;
    
    public Jump() {}
}
