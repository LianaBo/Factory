package factory;

public class CoffeFactory {
    public Coffe getCoffe(CoffeTypes types) {
        Coffe coffe = null;
        switch (types) {
            case LATTE: {
                coffe = new CoffeLatte();
                break;
            }
            case MOKKO: {
                coffe = new CoffeMokko();
                break;
            }
            default: {
                System.out.println("Неправильный тип кофе " + types);
            }
        }
        return coffe;
    }
}
