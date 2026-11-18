import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        /* ###### 1. Primitive Types ###### */

        // Integers:

        // byte: 8 bits, ranges from -128 to 127
        byte byteNumber = 100;

        // short: 16 bits, ranges from -32,768 to 32,767
        short shortNumber = 30000;

        // int: 32 bits, ranges from -2,147,483,648 to 2,147,483,647
        int intNumber = 2000000000;

        // long: 64 bits, requires the L suffix
        long longNumber = 9200000000000000000L;

        // Floating-point numbers:

        // float: single precision, approximately 7 significant digits
        float floatNumber = 1.1234567F;

        // double: double precision, approximately 15-16 significant digits
        double doubleNumber = 1.123456789123456;

        // Text:

        // String: represents a sequence of characters
        String name = "Henry";

        // char: represents a single character
        char letter = 'a';

        // Boolean:

        boolean isTrue = true;
        boolean isFalse = false;

        // var: allows Java to infer the variable type at compile time
        var myName = "Henry";

        /* ###### 2. Conditionals ###### */

        if (1 == 1) {
            System.out.println("1 == 1");
        } else {
            System.out.println("1 != 1");
        }

        if (2 == 3) {
            System.out.println("2 == 3");
        } else {
            System.out.println("2 != 3");
        }

        if (4 == 3) {
            System.out.println("4 == 3");
        } else if (4 == 5) {
            System.out.println("4 == 5");
        } else {
            System.out.println("4 != 3 and 4 != 5");
        }

        // Java does not have a strict equality operator (===).

        /* ###### 3. Arrays and Lists ###### */

        // Array: fixed size, defined when created
        int[] numbers = {1, 2, 3, 4, 5};

        // Creates an array with 5 positions, automatically initialized with the default value of its type
        int[] newNumbers = new int[5];

        // List: interface that defines the behavior of a list
        // ArrayList: implementation of List that can dynamically grow and shrink

        List<String> names = new ArrayList<>();

        names.add("Henry");
        names.add("Test");

        System.out.println(names.get(1));

        /* ###### 4. Loops ###### */

        // Standard for loop
        for (byte i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Enhanced for loop: iterates over arrays and collections
        for (String currentName : names) {
            System.out.println(currentName);
        }

        // Standard while loop
        byte count = 0;

        while (count < 2) {
            System.out.println("Inside the while loop");
            count++;
        }

        /* ###### 5. Type Casting ###### */

        // float to byte: explicit casting
        // The fractional part is discarded (truncation, not rounding)
        float floatResult = 10.2F;
        byte byteResult = (byte) floatResult;

        System.out.println(byteResult);

        // String to byte: parsing
        String stringResult = "10";
        byte parsedByte = Byte.parseByte(stringResult);

        // byte to String: conversion
        byte anotherByte = 10;
        String convertedString = String.valueOf(anotherByte);
    }
}
