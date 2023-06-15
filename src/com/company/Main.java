package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        while (true) {
            System.out.print("\n\nString: ");
            String input = INPUT.nextLine();
            System.out.print("\nContains: ");
            String contains = INPUT.nextLine();
            System.out.println("\n"+contains(input, contains));
        }
    }

        public static boolean contains(String input, String contains) {
        //split input and contains
        String[] splitInput=input.split("");
        String[] splitContains=contains.split("");

        //counting variable
        int count=0;

        //loop until we find the first letter of contains in input
            while (count>splitInput.length && splitInput[count]!=splitContains[0]){
                count+=1;
            }
            //check to see if the rest of contains is in input
            if (splitInput.length> splitContains.length+count){
                for (int i = 0; i < splitContains.length; i++) {
                    //if letters don't match return false
                    if (!splitInput[count+i].equalsIgnoreCase(splitContains[i])){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }}
