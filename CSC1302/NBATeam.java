package com.CSC1302;
//Name: Talha Ansari
//this program creates a class of objects called NBATeam, which have 3 private instance fields, 1 constructor, and 9 instance methods
public class NBATeam {
    //declares the instance field teamName
    private String teamName;
    //declares the instance field numberOfWin
    private int numberOfWin;
    //declares the instance field numberOfLoss
    private int numberOfLoss;
    //NBATeam constructor with parameter String name, int winNumber, int loseNumber
    public NBATeam(String name, int winNum, int loseNum) {
        //sets teamName equal to the name parameter
        teamName = name;
        //sets numberOfWin equal to winNum
        numberOfWin = winNum;
        //sets numberOfLoss equal to loseNum
        numberOfLoss = loseNum;
    }

    //getter for TeamName
    public String getTeamName() {
        return teamName;
    }
    //setter for TeamName
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    //getter for NumberOfLoss
    public int getNumberOfLoss() {
        return numberOfLoss;
    }
    //setter for TeamName
    public void setNumberOfLoss(int numberOfLoss) {
        this.numberOfLoss = numberOfLoss;
    }

    //declares the instance method winAgame with parameter NBATeam
    public static void winAgame(NBATeam teamB) {
        //increases int numberOfWin by 1 wherever this method is called
         teamB.numberOfWin++;
    }
    //declares the instance method loseAgame with parameter NBATeam
    public static void loseAgame(NBATeam teamB) {
        //increases int numberOfLoss by 1 wherever this method is called
        teamB.numberOfLoss++;
    }
    //declares the instance method setWinNum with parameter int n
    public int setWinNum(int n) {
        //sets int numberOfWin equal to int n
        numberOfWin = n;
        //returns int numberOfWin to wherever this method is called
        return numberOfWin;
    }
    //declares the instance method getWinNum
    public int getWinNum() {
        //returns int numberOfWin to wherever this method is called
        return numberOfWin;
    }
    //declares the instance method toString
    public String toString() {
        //returns the following string to wherever this method is called
        return teamName + " have lost " + numberOfLoss + " game(s) and have won " + numberOfWin + " game(s).";
    }
}
