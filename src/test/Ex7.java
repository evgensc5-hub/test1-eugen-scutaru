package test;

import java.util.Scanner;

public class Ex7 {
    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.print("Introduceti numarul :");
        int nr = scaner.nextInt();

        if (nr % 2 == 0) {
            System.out.println("Este numarul par ");
        }else {
            System.out.println("Este numarul impar ");
        }
        scaner.close();




    }
}
