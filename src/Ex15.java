public class Ex15 {
    public static void main (String[] args){
        byte[] numere = {1, 2, 3, 4, 5};

        for (byte n : numere) {
            System.out.print(n + " ");
        }
        System.out.println();
        numere[4] = 10;
        for (byte n : numere) {
            System.out.print(n + " ");
        }
    }
}
