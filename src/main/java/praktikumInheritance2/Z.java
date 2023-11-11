package praktikumInheritance2;

/**
 *
 * @author Radit
 */
public class Z extends X {
    public static void main(String[] args) {
        new Z();
    }

    Y y = new Y();

    Z() {
        System.out.print("Z");
    }
}
