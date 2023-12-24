package com.CSC1302;
import java.util.ArrayList;
//Name: Talha Ansari
public class ArrayList_Practice {
//This program declares and initializes an character ArrayList containing every letter of my first name twice
//It uses this ArrayList as the argument to call the redundantCharacterMatch
    public static void main(String[] args) {
        //initializes and declares character ArrayList nameExamples
        ArrayList<Character> nameExamples = new ArrayList<Character>();
        //adds character 't' to nameExamples
        nameExamples.add('t');
        //adds character 'a' to nameExamples
        nameExamples.add('a');
        //adds character 'l' to nameExamples
        nameExamples.add('l');
        //adds character 'h' to nameExamples
        nameExamples.add('h');
        //adds character 'a' to nameExamples
        nameExamples.add('a');
        //adds character 't' to nameExamples
        nameExamples.add('t');
        //adds character 'a' to nameExamples
        nameExamples.add('a');
        //adds character 'l' to nameExamples
        nameExamples.add('l');
        //adds character 'h' to nameExamples
        nameExamples.add('h');
        //adds character 'a' to nameExamples
        nameExamples.add('a');
        //calls redundantCharacterMatch using nameExamples as the argument
        redundantCharacterMatch(nameExamples);
    }

    //declares redundantCharacterMatch method which accepts a char ArrayList as a parameter and returns a void
    public static void redundantCharacterMatch(ArrayList<Character> yourFirstName) {
        //initializes a char arraylist that holds the first instance of each char of the yourFirstName arraylist
        ArrayList<Character> chr = new ArrayList<Character>();
        //loop iterates through every element of the arraylist
        for (int i = 0; i < yourFirstName.size(); i++) {
            //if chr already contains the char, the loop continues onto the next iteration
            if (chr.contains(yourFirstName.get(i))) continue;
            //if the chr doesn't contain the char, the else statement runs
            else {
                //adds the current yourFirstName element to chr
                chr.add(yourFirstName.get(i));
                //initializes and declares string arraylist that holds each repeating letter and the index at which it occurs
                ArrayList<String> str = new ArrayList<String>();
                //adds the repeating letter and it first occurrence to str
                str.add(yourFirstName.get(i) + ": " + i);
                //declares int count and initializes it to equal 0
                int count = 0;
                //loop iterates through every element of yourFirstName
                for (int j = 0; j < yourFirstName.size(); j++) {
                    //if the ArrayList indices i and j equal each other the loop continues to the next iteration
                    if (i == j) continue;
                    //else statement runs when i and j are not equal
                    else {
                        //if statement runs when the ArrayList element are the same
                        if (yourFirstName.get(i) == yourFirstName.get(j)) {
                            //adds the ArrayList index and formatting to str
                            str.add(", " + j);
                            //increment count by 1
                            count++;
                        }
                    }
                }
                //if statement runs when int count is greater than 0
                if (count > 0) {
                    //for loop iterates through each String of str and prints it out
                    for (String s : str) System.out.print(s);
                    //starts each letter format on a new line
                    System.out.println();
                }
            }
        }
    }
}
