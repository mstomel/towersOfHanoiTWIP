package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("input number of disks");
        Scanner hi = new Scanner(System.in);
        int diskCount = hi.nextInt();
        int nextMove = 1;
        if (diskCount%2==0) {
            for (int i = 0; i < Math.pow(2, diskCount)-1; i++) {
                if (nextMove == 1) {
                    System.out.println("make the legal move between pegs A and B (in either direction)");
                    nextMove++;
                }
                else if (nextMove == 2) {
                    System.out.println("make the legal move between pegs A and C (in either direction)");
                    nextMove++;
                }
                else if (nextMove ==3) {
                    System.out.println("make the legal move between pegs B and C (in either direction)");
                    nextMove = 1;
                }
            }
        }
        else if (diskCount%2==1) {
            for (int i = 0; i < Math.pow(2, diskCount)-1; i++) {
                if (nextMove == 1) {
                    System.out.println("make the legal move between pegs A and C (in either direction)");
                    nextMove++;
                }
                else if (nextMove == 2) {
                    System.out.println("make the legal move between pegs A and B (in either direction)");
                    nextMove++;
                }
                else if (nextMove ==3) {
                    System.out.println("make the legal move between pegs B and C (in either direction)");
                    nextMove = 1;
                }
            }
        }
        else {
            System.out.println("invalid input");
        }
    }
}