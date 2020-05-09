public class ComputerFactory {
    private ComputerFactory() {
    }

    public static Computer getComputer(AbstractComputer abstractComputer) {
        return abstractComputer.create();
    }
}