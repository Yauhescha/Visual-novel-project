package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class Window {
    private final GameEntityTypes type = GameEntityTypes.WINDOW;
    private boolean isShow;

    public Window() {
    }

}
