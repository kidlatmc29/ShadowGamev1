package com.ovalles.shadowgamev1;

import java.util.Scanner;

public class StartConfig {

	public String setPlayerName(Scanner userInput) {
		System.out.print("Please enter your name (NOTE: Press enter for the default name): ");
		String playerName = userInput.nextLine();
		if (playerName.equals("")) {
			playerName = "Remi";
		}
		return playerName;
	}

}
