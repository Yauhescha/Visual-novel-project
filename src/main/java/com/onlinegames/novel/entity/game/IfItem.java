package com.onlinegames.novel.entity.game;

import java.util.ArrayList;

import com.onlinegames.novel.types.GameEntityTypes;

import lombok.Data;

@Data
public class IfItem {
	private final GameEntityTypes type = GameEntityTypes.IF_ITEM;

	private ArrayList<IfCriterion> criterions = new ArrayList<>();
	private ArrayList<Object> commands = new ArrayList<>();
	
}
