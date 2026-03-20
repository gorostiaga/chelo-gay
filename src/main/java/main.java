public class main {
    public static void main(String[] args) {
        // Simple entry point for the application
        System.out.println("Hello from main.main()! Arguments: ");
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("  arg[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("  (no arguments)");
        }
    }
}
