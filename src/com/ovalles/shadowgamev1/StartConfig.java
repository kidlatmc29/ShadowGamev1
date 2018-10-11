package com.ovalles.shadowgamev1;

import java.util.Scanner;

public class StartConfig {

	public String setPlayerName(String userInput) {
		System.out.print("Please enter your name (NOTE: Press enter for the default name): ");
		String playerName = userInput;
		if (playerName.equals("")) {
			playerName = "Remi";
		}
		return playerName;
	}

}
