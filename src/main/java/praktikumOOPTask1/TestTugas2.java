package praktikumOOPTask1;

public class TestTugas2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);

        mobil1.infoMobil();
        System.out.println(" ");
        mobil2.infoMobil();
        System.out.println(" ");
        mobil3.infoMobil();
        System.out.println(" ");
        mobil4.infoMobil();
    }
}
