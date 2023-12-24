package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 7
public class NBA {
//this program first creates 2 NBATeams and names them,
//it then has the 2 teams play 3 simulated games against each other, and prints out the result using the toString method
    public static void main(String[] args) {

		System.out.println("Create the NBA team 'Heats'.......");
		//creates the NBATeam heats with the teamName Heats and a win and lose number of 0
		NBATeam heat = new NBATeam("Heats", 0, 0);

		System.out.println("Create the NBA team 'Spurs'.......");
		//creates the NBATeam spurs with the teamName Spurs and a win and lose number of 0
		NBATeam spurs = new NBATeam("Spurs", 0, 0);

		System.out.println("Game on Now .......");
		//this loop will run 3 times
		for (int i = 0; i < 3; i++) {
			//declares and initializes double n, which will be a randomly generated number between 0.0 and 1.0
			double n = Math.random();
			//if statement runs only if n is greater than 0.5
			if (n > 0.5) {
				//calls the winAgame method to increase the heat's numberOfWin by 1
				NBATeam.winAgame(heat);
				//calls the loseAgame method to increase the spurs' numberOfLoss by 1
				NBATeam.loseAgame(spurs);
			}
			//else statement runs if n is less than or equal to 0.5
			else {
				//calls the winAgame method to increase the spurs' numberOfWin by 1
				NBATeam.winAgame(spurs);
				//calls the loseAgame method to increase the heat's numberOfLoss by 1
				NBATeam.loseAgame(heat);
			}
		}
		//if statement runs if the spurs have won more games than the heats
		if (spurs.getWinNum() > heat.getWinNum())
			System.out.println("Spurs ***WIN the series***");
		//else statement runs if the heats have won more games than the spurs
		else
			System.out.println("Heats ***WIN the series***");
		//uses the toString method to print the spurs number of wins and losses
		System.out.println(spurs.toString());
		//uses the toString method to print the heats number of wins and losses
		System.out.println(heat.toString());


	}
}
