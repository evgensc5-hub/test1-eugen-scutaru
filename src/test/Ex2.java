package test;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.print("Numarul unu: ");
        int unu = scaner.nextInt();

        System.out.print("Numarul doi: ");
        int doi = scaner.nextInt();

        System.out.println("Rezultatul este: " + (unu * doi));

        scaner.close();
    }
}
