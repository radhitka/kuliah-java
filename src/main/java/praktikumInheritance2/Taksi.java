package praktikumInheritance2;

/**
 *
 * @author Radit
 */
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
}
