package praktikumOOPTask1;

public class Mobil {

    private String nama;
    private String warna;
    private String tipeMobil;
    private int CC;
    private int Qty;

    public Mobil(String nama, String warna, String tipeMobil, int CC, int Qty) {
        this.nama = nama;
        this.warna = warna;
        this.tipeMobil = tipeMobil;
        this.CC = CC;
        this.Qty = Qty;
    }

    public void infoMobil() {

        System.out.println("Nama Mobil : " + this.nama);
        System.out.println("Warna Mobil : " + this.warna);
        System.out.println("Tipe Mobil : " + this.tipeMobil);
        System.out.println("CC Mobil : " + this.CC);
        System.out.println("Total Mobil : " + this.Qty);
    }
}
