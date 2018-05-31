package com.company;

import java.util.Scanner;

public class SomeThingAboutYou {

    public static void main(String[] args) {


            Scanner keyboard = new Scanner(System.in);


        String firstName;
        int age;
        String height;
        double gpa;

        System.out.print( "What is your first name? \n" );
        firstName = keyboard.nextLine();

        System.out.print( "How old are you? \n " );
        age = keyboard.nextInt();

        System.out.print( "How tall are you? \n" );
        height = keyboard.next();

        System.out.print( "What is your GPA? \n" );
        gpa = keyboard.nextDouble();

        System.out.println( "Name" + firstName );
        System.out.println( "Age" + age );
        System.out.println( "Height" + height );
        System.out.println( "Gpa" + gpa);

    }
    }

