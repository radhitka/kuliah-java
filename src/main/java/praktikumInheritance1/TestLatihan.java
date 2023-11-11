package praktikumInheritance1;

/**
 *
 * @author Radit
 */
public class TestLatihan {

    public static void main(String[] args) {
        PenyimpananUang tabungan = new PenyimpananUang(5000, 8.5 / 100);

        System.out.println("Uang yang ditabung : 5000");
        System.out.println("Tingkat Bunga : 8.5%");
        System.out.println("Total uang anda sekarang : " + tabungan.cetakUang());
    }
}
