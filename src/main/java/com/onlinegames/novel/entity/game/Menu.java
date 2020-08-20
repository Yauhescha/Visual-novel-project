package com.onlinegames.novel.entity.game;

import java.util.ArrayList;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class Menu {
    private final GameEntityTypes type = GameEntityTypes.MENU;

    private ArrayList<MenuItem> items = new ArrayList<>();

}
