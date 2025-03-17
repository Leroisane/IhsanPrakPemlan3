package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;
import java.util.Scanner;

public class Main {
        static String WHITE = "\u001B[0m";
        static String GREEN = "\u001B[32m";
        static String YELLOW = "\u001B[33m";
        static String BLUE = "\u001B[94m";
        static String pewarnaTulisan = GREEN + "==============================" + WHITE;

        public static void printGaris() {
                System.out.println(pewarnaTulisan);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Isikan Nama anda: ");
                String nama = sc.nextLine();
                System.out.println("Isikan NIM anda: ");
                String NIM = sc.nextLine();

                printGaris();
                System.out.println("Nama : " + nama);
                System.out.println("NIM  : " + NIM);
                printGaris();

                System.out.println("Circle");
                printGaris();
                System.out.print("Isikan ID       : ");
                int idCircle = sc.nextInt();
                System.out.print("Isikan Radius   : ");
                double radius = sc.nextDouble();

                Circle circle = new Circle();
                circle.setId(idCircle);
                circle.setRadius(radius);

                printGaris();
                circle.printDeskripsi();
                printGaris();

                System.out.println("Rectangle");
                printGaris();
                System.out.print("Isikan ID       : ");
                int idRectangle = sc.nextInt();
                System.out.print("Isikan Panjang  : ");
                double panjang = sc.nextDouble();
                System.out.print("Isikan Lebar    : ");
                double lebar = sc.nextDouble();

                Rectangle rectangle = new Rectangle(idRectangle, panjang, lebar);

                printGaris();
                rectangle.printDeskripsi();
                printGaris();
        }
}
