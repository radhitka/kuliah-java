package praktikumInheritance2;

/**
 *
 * @author Radit
 */
public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;

    public int getJmlGir() {
        return jmlGir;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    public String getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }
}
