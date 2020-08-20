package com.onlinegames.novel.entity.game;

import com.onlinegames.novel.types.ActionWithVariable;
import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class Variables {
    private final GameEntityTypes type = GameEntityTypes.VARIABLE;
    private String key;
    private String value;
    private ActionWithVariable actionWithVariable = ActionWithVariable.SET;

    public Variables() {
    }

}
