package factory;

public class CoffeLatte implements Coffe {
    @Override
    public void drink() {
        System.out.println("Вы выбрали Латте!");
    }
}
