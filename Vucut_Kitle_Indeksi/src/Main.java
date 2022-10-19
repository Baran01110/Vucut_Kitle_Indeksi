import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,VKE,kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (Metre): ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz (Kg): ");
        kilo = inp.nextDouble();

        VKE = kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: " + VKE);

    }
}