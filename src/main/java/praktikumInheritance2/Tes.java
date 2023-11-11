package praktikumInheritance2;

/**
 *
 * @author Radit
 */
public class Tes {

    public static void main(String[] args) {

        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("Kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("Merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("Oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("Biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("Hitam");
        sepeda1.setJmlSadel("1");
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("Putih");
        sepeda2.setJmlSadel("2");
        sepeda2.setJmlGir(5);

        String truk1Output = String.format(
                "Truk 1 , Jumlah Roda %s, Warna %s, Bahan Bakar %s, Kapasitan Mesin %s, Mutatan Maks %s",
                truk1.getJmlRoda(),
                truk1.getWarna(),
                truk1.getBahanBakar(),
                truk1.getKapasitasMesin(),
                truk1.getMuatanMaks());

        String truk2Output = String.format(
                "Truk 2 , Jumlah Roda %s, Warna %s, Bahan Bakar %s, Kapasitan Mesin %s, Mutatan Maks %s",
                truk2.getJmlRoda(),
                truk2.getWarna(),
                truk2.getBahanBakar(),
                truk2.getKapasitasMesin(),
                truk2.getMuatanMaks());

        String taksi1Output = String.format(
                "Taksi 1 , Jumlah Roda %s, Warna %s, Bahan Bakar %s, Kapasitan Mesin %s, Tarif Awal %s, Tarif Perkm %s",
                taksi1.getJmlRoda(),
                taksi1.getWarna(),
                taksi1.getBahanBakar(),
                taksi1.getKapasitasMesin(),
                taksi1.getTarifAwal(),
                taksi1.getTarifPerKm());

        String taksi2Output = String.format(
                "Taksi 2 , Jumlah Roda %s, Warna %s, Bahan Bakar %s, Kapasitan Mesin %s, Tarif Awal %s, Tarif Perkm %s",
                taksi2.getJmlRoda(),
                taksi2.getWarna(),
                taksi2.getBahanBakar(),
                taksi2.getKapasitasMesin(),
                taksi2.getTarifAwal(),
                taksi2.getTarifPerKm());

        String sepeda1Output = String.format(
                "Sepeda 1 , Jumlah Roda %s, Warna %s, Jumlah Sadel %s, Jumlah Gir %s",
                sepeda1.getJmlRoda(),
                sepeda1.getWarna(),
                sepeda1.getJmlSadel(),
                sepeda1.getJmlGir());

        String sepeda2Output = String.format(
                "Sepeda 2 , Jumlah Roda %s, Warna %s, Jumlah Sadel %s, Jumlah Gir %s",
                sepeda2.getJmlRoda(),
                sepeda2.getWarna(),
                sepeda2.getJmlSadel(),
                sepeda2.getJmlGir());

        System.out.println(truk1Output);
        System.out.println(truk2Output);
        System.out.println(taksi1Output);
        System.out.println(taksi2Output);
        System.out.println(sepeda1Output);
        System.out.println(sepeda2Output);
    }
}
