package factory;

public class Main {
    public static void main(String[] args) {
        CoffeFactory factory = new CoffeFactory();

        Coffe latte = factory.getCoffe(CoffeTypes.LATTE);
        Coffe mokko = factory.getCoffe(CoffeTypes.MOKKO);

        latte.drink();
        mokko.drink();
    }
}
