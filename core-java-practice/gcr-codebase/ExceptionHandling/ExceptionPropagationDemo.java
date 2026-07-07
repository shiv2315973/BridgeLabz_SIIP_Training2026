public class ExceptionPropagationDemo {
    public static void methodLevelTwo() throws Exception {
        throw new Exception("Data fetch failed in methodLevelTwo.");
    }

    public static void methodLevelOne() throws Exception {
        methodLevelTwo();
    }

    public static void main(String[] args) {
        try {
            methodLevelOne();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }
}
