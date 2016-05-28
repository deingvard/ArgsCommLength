/**
 * Created by igor on 28.05.16.
 */
public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " +
                "args: " + v.length +
                "contents:");
        for (int x :
                v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...) " +
                "args: " + v.length +
                "contents:");
        for (boolean x :
                v) {
            System.out.print(x + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        vaTest(true, false, false);
        vaTest(1, 2, 3);
    }
}
