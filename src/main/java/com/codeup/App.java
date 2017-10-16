package com.codeup;

// Java program to ReverseString using StringBuilder
import org.apache.commons.lang3.StringUtils;

import java.lang.*;
import java.io.*;
import java.util.*;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args )
    {


        Scanner scan = new Scanner(System.in);
        System.out.println( "Hello World!" );



        System.out.println("enter something");

        String line = scan.nextLine();

        if (StringUtils.isNumeric(line)) {
            System.out.println(line + " is a number");
        } else {
            System.out.println(line + " is not a number");
            System.out.println("flipped case " + StringUtils.swapCase(line));
            System.out.println("reversed " + StringUtils.reverse(line));
        }



    }
}
