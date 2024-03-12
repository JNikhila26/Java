public class ChainedExceptions {

    public static void main(String[] args) {
        try {
            // Simulate an initial exception
            method1();
        } catch (Exception e) {
            // Catch the initial exception and chain a new one
            throw new RuntimeException("Chained Exception", e);
        }
    }
    private static void method1() {
        try {
            // Simulate another exception
            method2();
        } catch (Exception e) {
            throw new RuntimeException("Chained Exception in method1", e);
        }
    }
    private static void method2() {
        // Simulate an exception
        int result = 1 / 0;
    }
}
