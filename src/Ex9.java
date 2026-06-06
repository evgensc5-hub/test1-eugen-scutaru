import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduceti Luna (1-12): ");
        int luna = scaner.nextInt();

        switch (luna) {

            case 12:
            case 1:
            case 2:
                System.out.println("Iarna");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavara");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Vara");
                break;
            case 9:
            case 10:
                case11:
                System.out.println("Toamna");
                break;
            default:
                System.out.println("Luna incorecta");
        }
        scaner.close();

    }
}
