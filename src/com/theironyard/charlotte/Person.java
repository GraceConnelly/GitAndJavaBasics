package com.theironyard.charlotte;

/**
 * Created by graceconnelly on 11/29/16.
 */
public class Person {

    //Establish vars that describe person
    String name;
    int age = 5;
    //boolean ageChange;
    String didOrDidntDrink = " may take the drink, stay in wonderland and see how far the rabbit hole goes. Their current age is ";
    int hairLength;
    String hairColor;
    String eyeColor;
    String sex;

    //Defines a method for randomly reassigning a new age 75% of the time to a person once they during the age potion

    public void drinkAgePotion() {
        if (Math.random() >= 0.25) {
            age = (int) Math.floor(Math.random() * 101);
            //ageChange = true;
            didOrDidntDrink = " drank the age potion. Their new age is ";
        } else {
            age++;
            //ageChange = false;
            didOrDidntDrink = " didn't drink the age potion. But they did have a Birthday! Their new age is ";
        }
    }

    //Defines a method for combining hair length so we can later check if we have enough to make a rug.
    //we also use an if statement to make sure that the other is not null when it is brought in so we don't
    //get a null no pointer exception

    int combinedHairLength (Person other){
        if (other != null) {
            return this.hairLength + other.hairLength;
        }
        else {
            return this.hairLength;
        }
    }

    //Defines a method to measure the length difference between the names final name(other) minus initial name (this)

    int nameDiff (Person other){
        if (other != null){
            return (other.name.length() - this.name.length());
        }
        else {
            return this.name.length();
        }
    }
}