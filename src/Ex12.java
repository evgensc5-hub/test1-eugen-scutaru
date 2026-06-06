import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Varsta: ");
        int varsta = scaner.nextInt();

        if (varsta <= 0 || varsta > 100) {
            System.out.println("Varsta maxima");
        }else if (varsta < 12) {
            System.out.println("Copil");
        }else if (varsta < 18) {
            System.out.println("Adolescent");
        }else {
            System.out.println("Adult");
        }
        scaner.close();
    }
}
