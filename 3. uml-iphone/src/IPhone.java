public class IPhone implements WebBrowser, Phone, MusicPlayer{

    @Override
    public void play() {
        System.out.println("IPhone: playing music.");

    }

    @Override
    public void pause() {
         System.out.println("IPhone: pausing music.");
    }

    @Override
    public void selectMusic() {
         System.out.println("IPhone: selecting music.");
    }

    @Override
    public void call() {
         System.out.println("IPhone: calling.");
    }

    @Override
    public void hangUp() {
         System.out.println("IPhone: hanging up.");
    }

    @Override
    public void selectContact() {
        System.out.println("IPhone: selecting contact.");
    }

    @Override
    public void searchForPage() {
         System.out.println("IPhone: searching for page.");
    }

    @Override
    public void showPage() {
        System.out.println("IPhone: showing page.");
    }

    @Override
    public void updatePage() {
        System.out.println("IPhone: updating page.");
    }
    
}
