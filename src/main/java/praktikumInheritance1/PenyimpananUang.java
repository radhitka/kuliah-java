package praktikumInheritance1;

import praktikumOOPTask1.Tabungan;

/**
 *
 * @author Radit
 */

public class PenyimpananUang extends Tabungan {

    public double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga) {
        super(saldo);
        this.tingkatBunga = tingkatBunga;
    }

    public double cetakUang() {

        double total = super.saldo * this.tingkatBunga;

        return total + super.saldo;
    }

}
