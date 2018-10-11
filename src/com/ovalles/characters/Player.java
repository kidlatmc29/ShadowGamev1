package com.ovalles.characters;

public class Player extends HumanCharacter {
	private String name;
	private boolean isAlive;
	
	public Player(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}
