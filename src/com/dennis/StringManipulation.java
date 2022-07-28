package com.dennis;

public class StringManipulation {
    /*String Manipulation*/
    String myGreeting = "Hello, how are you "; //literial way of defining a string. Here, the strings values are stores in a string pool
    String name = new String("Hassan Souvik"); //using the new keyword. Here, a new object of the string is created and new memory is allocated to it.

    String concatenatedResult1 = myGreeting + name; //concatenation
    String concatenatedResult2 = myGreeting.concat(name); // concatenation
    String replaceValueInAString = myGreeting.replace("Hello", "HEY!!!!");
    String phoneNumber = "08079685875";
    String replaceFirtOccuringCharacter = phoneNumber.replaceFirst("0", "+234");
    String cutOutFirst7Characters = myGreeting.substring(7); //remove the first 7 char
    String toUpperCase = myGreeting.toUpperCase(); //conversion to uppercase
}
