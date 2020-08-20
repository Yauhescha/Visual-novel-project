package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class Hide {
    private final GameEntityTypes type = GameEntityTypes.HIDE;
    private String personNameToHide;
    
    public Hide() {
    }
    
    
 }
