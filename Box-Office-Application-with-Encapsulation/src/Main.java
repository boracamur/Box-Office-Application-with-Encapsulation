import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gişe Uygulamasına Hoşgeldiniz!");
        System.out.print("Lüfen TCKN giriniz: ");

        String tckn = scanner.nextLine();

        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);


    }
}