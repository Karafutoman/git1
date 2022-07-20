import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var SalesManager = new SalesManager(new long[]{15, 27, 30, 42, 54});
        System.out.printf("Максимум от {15, 27, 30, 42, 54} = %d\n", SalesManager.max());
    }
}
