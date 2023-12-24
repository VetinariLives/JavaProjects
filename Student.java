package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 21
public class Student extends Human {
//This program creates a class of Student objects, and is a subclass of Human.java
    //declares private instance field 'major', which holds the student's declared major
    private String major;
    //declares private instance field 'gpa', which holds the student's grade point average
    private double gpa;
    //declares private instance field 'creditHours', which holds the number credit hours the student has completed
    private int creditHours;

    //constructor for Student, accepts the following parameters
    public Student(int age, double weight, double height, String major, double gpa, int creditHours) {
        //calls the superclass' constructor using the age, weight and height parameters
        super(age, weight, height);
        //sets the 'major' instance field equal to the 'major' parameter
        this.major = major;
        //sets the 'gpa' instance field equal to the 'gpa' parameter
        this.gpa = gpa;
        //sets the 'creditHours' instance field equal to the 'creditHours' parameter
        this.creditHours = creditHours;
    }

    //getter for major
    public String getMajor() {
        return major;
    }
    //getter for gpa
    public double getGpa() {
        return gpa;
    }

    //this method calculates the year of the Student by specifying the number of credit hours required per year
    public String getYear() {
        //student with less than 32 hours are freshmen
        if (creditHours < 32) return "Freshman";
        //student with 32 to 63 hours are sophomores
        else if (creditHours < 64) return "Sophomore";
        //student with 64 to 95 hours are juniors
        else if (creditHours < 96) return "Junior";
        //student with 96+ hours are seniors
        else return "Senior";
    }

    @Override
    //toString method for Student
    public String toString() {
        //returns the student's major, gpa, and year wherever this method is called
        return "Student{" +
                "major = '" + major +
                ", gpa = " + gpa +
                ", year = " + getYear() +
                '}';
    }
}
