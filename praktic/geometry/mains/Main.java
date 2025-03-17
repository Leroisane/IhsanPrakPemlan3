package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;
import java.util.Scanner;

public class Main {
        static String pewarnaTulisan = "=============================="; // Pembatas untuk output

        public static void printGaris() {
                System.out.println(pewarnaTulisan); // Mencetak garis pembatas
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); // Scanner untuk input pengguna
                System.out.println("Isikan nama anda  :"); // Menanyakan nama pengguna
                String Nama = sc.nextLine(); // Kolom input nama pengguna
                System.out.println("isikan NIM anda  :"); // Menanyakan NIM pengguna
                String NIM = sc.nextLine(); // Kolom input NIM pengguna

                printGaris();
                System.out.println("Nama : " + Nama);
                System.out.println("NIM  : " + NIM);
                printGaris();

                // Input dan proses untuk Circle
                System.out.println("Circle");
                printGaris();
                System.out.print("Isikan ID       : ");
                int idCircle = sc.nextInt();
                System.out.print("Isikan Radius   : ");
                double radius = sc.nextDouble();

                Circle circle = new Circle();
                circle.setId(idCircle); // Menetapkan ID lingkaran
                circle.setRadius(radius); // Menetapkan radius lingkaran

                printGaris();
                circle.printDeskripsi(); // Menampilkan deskripsi lingkaran
                printGaris();

                // Input dan proses untuk Rectangle
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
                rectangle.printDeskripsi(); // Menampilkan deskripsi persegi panjang
                printGaris();

                sc.close();
        }
}
