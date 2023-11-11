package praktikumInheritance2;

/**
 *
 * @author Radit
 */
public class Sup extends Base {
    public static void main(String[] args) {
        Sup s = new Sup();
        s.derived();
    }

    Sup() {
        super(1);
    }

    public void derived() {
        // baris 3
    }
}
