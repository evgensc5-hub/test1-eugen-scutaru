import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
         Scanner scaner = new Scanner(System.in);

        System.out.print("Numarul unu: ");
        int unu = scaner.nextInt();

        System.out.print("Numarul doi: ");
        int doi = scaner.nextInt();

        if (unu > doi) {
            System.out.println("Numarul mai mare este: " + unu);
            System.out.println("Numarul mai mic este: " + doi);
        }else if (doi > unu) {
            System.out.println("Numarul mai mare este: " + doi);
            System.out.println("Numarul mai mic este : " + unu);
        }
    }
}
