package com.ovalles.shadowgamev1;

import java.util.Scanner;

/* People are but shadow and breath.
 * 
 * @author Isabel
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		StartConfig config = new StartConfig();
		config.setPlayerName(userInput.nextLine());
		
		
		// for testing setting the name of player
		//System.out.println(config.setPlayerName(userInput)); 
		

	}

}
