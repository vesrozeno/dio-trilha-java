public class MobilePhone implements Phone{

    @Override
    public void call() {
        System.out.println("Mobile phone: calling.");

    }

    @Override
    public void hangUp() {
        System.out.println("Mobile phone: hanging up.");

    }

    @Override
    public void selectContact() {
        System.out.println("Mobile phone: selecting contact.");

    }
    
}
