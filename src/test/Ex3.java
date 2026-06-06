package test;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.print("Pimul numar: ");
        int unu = scaner.nextInt();

        System.out.print("Al doilea numar: ");
        int doi = scaner.nextInt();

        System.out.println("Adunare: " + (unu + doi));
        System.out.println("Scadere: " +(unu - doi));
        System.out.println("Inmultire: " + (unu * doi));
        System.out.println("Inpartirea: " + (unu / doi));
        System.out.println("Restul :" + (unu % doi));
    }
}
