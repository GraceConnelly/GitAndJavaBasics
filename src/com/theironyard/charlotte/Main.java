package com.theironyard.charlotte;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        // Create two new people
        Person aStudent = new Person();
        Person bStudent = new Person();

        aStudent.name = "Wendy Herman";
        aStudent.age = 12;
        aStudent.eyeColor = "Blue";
        aStudent.hairColor = "Purple";
        aStudent.hairLength = (int) Math.floor(Math.random() * 11);
        aStudent.sex = "Female";

        bStudent.name = "Sandy Pants";
        bStudent.age = 47;
        bStudent.eyeColor = "Purple";
        bStudent.hairColor = "Red";
        bStudent.hairLength = 4;

        //Each students choice and being effected by the Age potion method

        System.out.println(aStudent.name + aStudent.didOrDidntDrink + aStudent.age);
        aStudent.drinkAgePotion();
        System.out.println(aStudent.name + aStudent.didOrDidntDrink + aStudent.age );


        System.out.println(bStudent.name + bStudent.didOrDidntDrink + bStudent.age);
        bStudent.drinkAgePotion();
        System.out.println(bStudent.name + bStudent.didOrDidntDrink + bStudent.age);

        //applying the combined hair length method to determine if we can make a rug
        System.out.println(aStudent.hairLength);
        System.out.println(bStudent.hairLength);

        aStudent.combinedHairLength(bStudent);





    }


}
