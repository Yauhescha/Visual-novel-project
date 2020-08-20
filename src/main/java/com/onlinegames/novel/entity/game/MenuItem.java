package com.onlinegames.novel.entity.game;

import java.util.ArrayList;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;


@Data
public class MenuItem {
    private final GameEntityTypes type = GameEntityTypes.MENU_ITEM;
    
    private String title;
    private ArrayList<Object> commands = new ArrayList<>();
}
