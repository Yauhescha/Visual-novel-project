package com.onlinegames.novel.entity.game;

import java.util.ArrayList;

import com.onlinegames.novel.types.GameEntityTypes;
import com.onlinegames.novel.types.PersonDistance;
import com.onlinegames.novel.types.PersonPosition;

import lombok.Data;


@Data
public class Person {
	private final GameEntityTypes type = GameEntityTypes.PERSON;
	
	private PersonPosition position = PersonPosition.CENTER;
	private PersonDistance distance = PersonDistance.NORMAL;
	
    private String shortName;
    private String fullName;
    private String aheadPersonShortName;
    
    private ArrayList<String> images = new ArrayList<>();
   
    public Person() {}
	
}
