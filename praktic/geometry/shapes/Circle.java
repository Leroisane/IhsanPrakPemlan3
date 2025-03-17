package praktic.geometry.shapes;

public class Circle {
    private int id; // ID unik untuk setiap lingkaran
    private double radius; // Jari-jari lingkaran
    private final int pembilang = 22; // Pembilang untuk perhitungan π (22/7)
    private final int penyebut = 7; // Penyebut untuk perhitungan π (22/7)

    public Circle() {
    } // Konstruktor tanpa parameter

    public void setId(int id) {
        this.id = id; // Menetapkan ID lingkaran
    }

    public void setRadius(double radius) {
        this.radius = radius; // Menetapkan jari-jari lingkaran
    }

    public double getKeliling() {
        return (2.0 * pembilang * radius) / penyebut; // Menghitung keliling lingkaran
    }

    public double getLuas() {
        return (pembilang * radius * radius) / penyebut; // Menghitung luas lingkaran
    }

    public void printDeskripsi() {
        // Menampilkan informasi lingkaran
        System.out.printf("ID       : %d\n", id);
        System.out.printf("Radius   : %.2f\n", radius);
        System.out.printf("Keliling : %.2f\n", getKeliling());
        System.out.printf("Luas     : %.2f\n", getLuas());
    }
}