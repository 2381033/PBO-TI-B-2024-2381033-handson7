package polymorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(5);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi" + bangunDatar.Keliling());

        bangunDatar = new Lingkaran(7);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi" + bangunDatar.Keliling());

        bangunDatar = new SegitigaSamaSisi(5,8);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi" + bangunDatar.Keliling());

    }
}
