package com.onlinegames.novel.entity.game;

import java.util.ArrayList;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class If {
	private final GameEntityTypes type = GameEntityTypes.IF;
	private ArrayList<IfItem> items = new ArrayList<>();
}
