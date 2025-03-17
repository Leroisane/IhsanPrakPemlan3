package praktic.geometry.shapes;

public class Rectangle {
    private int id; // ID unik untuk setiap persegi panjang
    private double panjang; // Panjang persegi panjang
    private double lebar; // Lebar persegi panjang

    public Rectangle(int id, double panjang, double lebar) { // Konstruktor dengan parameter id, panjang, dan lebar
        this.id = id; // Menetapkan ID persegi panjang
        this.panjang = panjang; // Menetapkan panjang
        this.lebar = lebar; // Menetapkan lebar
    }

    public int getId() {
        return id; // Mengembalikan ID
    }

    public double getPanjang() {
        return panjang; // Mengembalikan panjang
    }

    public double getLebar() {
        return lebar; // Mengembalikan lebar
    }

    public double getKeliling() {
        return 2 * (panjang + lebar); // Menghitung keliling persegi panjang
    }

    public double getLuas() {
        return panjang * lebar; // Menghitung luas persegi panjang
    }

    public void printDeskripsi() {
        // Menampilkan informasi persegi panjang
        System.out.printf("ID       : %d\n", id);
        System.out.printf("Panjang  : %.2f\n", panjang);
        System.out.printf("Lebar    : %.2f\n", lebar);
        System.out.printf("Keliling : %.2f\n", getKeliling());
        System.out.printf("Luas     : %.2f\n", getLuas());
    }
}