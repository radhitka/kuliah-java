package praktikumInheritance1;

import Task2.Tabungan;

/**
 *
 * @author Radit
 */
public class PengambilanUang extends Tabungan {

    private int proteksi;

    public PengambilanUang(int saldo) {
        super(saldo);
        this.proteksi = 0;
    }

    public PengambilanUang(int saldo, int tingkatBunga) {
        super(saldo);
        this.proteksi = tingkatBunga;
    }

    public int getSaldo() {
        return super.getSaldo();
    }

    public boolean ambilUang(int jumlah) {

        if (jumlah > super.getSaldo()) {

            return false;
        }

        int total = super.getSaldo() - jumlah;

        if (this.proteksi >= total) {

            return false;
        }

        return super.ambilSaldo(jumlah);
    }
}
