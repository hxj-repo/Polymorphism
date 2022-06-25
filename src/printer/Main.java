package printer;

public class Main {
    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.printing();
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();
        blackAndWhitePrinter.printing();
    }
}
