/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thefile;

import java.io.File;

import java.util.Arrays;

import java.util.Formatter;

import java.util.Iterator;

import java.util.Scanner;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

/**
 *
 * @author Enzo
 */
public class TheFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
    File j = new File("in.txt");
    Scanner input = new Scanner(j);
    PrintWriter pw = new PrintWriter(new File("out.txt"));

    while (input.hasNextLine()) {

    String line = input.nextLine();// store the line in a variable - eg. String line = input.next();
    String[] numOperation = line.split(":");// split the line on the semi-colon
    String operation = numOperation[0];// assign the operation to a variable at index 0 of operation_numbers
    String[] digits = numOperation[1].split(",");// assign the numbers to a variable using index 1 of

    // operation_numbers - split the numbers on the commas

    int len = digits.length;

    int arr[] = new int[len];

    for (int i = 0; i < len; i++)

    arr[i] = Integer.parseInt(digits[i].trim());

    if(operation.equalsIgnoreCase("Min")) {
        int min = arr[0];
        for (int i = 0; i < len; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
    pw.println("The min of " + Arrays.toString(arr) + " is " + min + ".");
    }else if(operation.equalsIgnoreCase("Max")) {
        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if(max < arr[i])
                max = arr[i];
            }
    pw.println("The max of " + Arrays.toString(arr) + " is " + max + ".");
    }else if(operation.equalsIgnoreCase("Avg")) {
    double avg = 0.0;
        for (int i = 0; i < len; i++) {
            avg += arr[i];
        }
    avg /= len;
    pw.println("The avg of " + Arrays.toString(arr) + " is " + avg + ".");

    }else if(operation.charAt(0) == 'P') {
        int perc = Integer.parseInt(operation.substring(1));
        int index = (int)(arr.length * (perc / 100.0))-1;
        pw.println("The " + perc + "th percentile of " + Arrays.toString(arr) + " is " + arr[index] + ".");
    }else if(operation.equalsIgnoreCase("Sum")) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    pw.println("The sum of " + Arrays.toString(arr) + " is " + sum + ".");

    }

    }
    pw.close();
    input.close();

    } catch (FileNotFoundException e) {

    System.out.println("Unable to open file");

    }

    }
    }
