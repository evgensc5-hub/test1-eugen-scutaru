

public class Ex8 {
    public static void main (String[] args){
        int ora = 15;

        if (ora >= 6 && ora < 12) {
            System.out.println("Dimineata");
        } else if (ora >= 12 && ora < 18) {
            System.out.println("Amiaza mare");
        } else if (ora >= 18 && ora < 22) {
            System.out.println("Seara");
        }else {
            System.out.println("Noaptea");
        }


    }
}
