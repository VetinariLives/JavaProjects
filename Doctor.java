package com.CSC1302;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: July 21
public class Doctor extends Human {
//This program creates a class of Doctor objects, and is a subclass of Human.java
    //declares private instance field 'years', which holds the number of years the doctor has worked
    private int years;
    //declares private instance field 'specialty', which holds the doctor's field of specialization
    private String specialty;

    //constructor for Doctor, accepts the following parameters
    public Doctor(int age, double weight, double height, int years, String specialty) {
        //calls the superclass' constructor using the age, weight and height parameters
        super(age, weight, height);
        //sets the 'years' instance field equal to the 'years' parameter
        this.years = years;
        //sets the 'specialty' instance field equal to the 'specialty' parameter
        this.specialty = specialty;
    }

    //getter for years
    public int getYears() {
        return years;
    }
    //getter for specialty
    public String getSpecialty() {
        return specialty;
    }

    //this method calculates the doctor's salary
    public int getSalary() {
        //returns the doctor's salary as an int wherever this method is called. Equation: $40,000 + 5,000 for every year after the first
        return 40000 + (years - 1) * 5000;
    }

    @Override
    //toString method for Doctor
    public String toString() {
        //returns the doctor's height, weight, specialty, salary, and year wherever this method is called
        return "Doctor{" +
                "height = " + getHeight() +
                ", weight = " + getWeight() +
                ", specialty = " + specialty +
                ", years practiced: " + years +
                ", salary = $" + getSalary() +
                '}';
    }
}
