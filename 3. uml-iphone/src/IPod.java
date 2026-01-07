public class IPod implements MusicPlayer{

    @Override
    public void play() {
        System.out.println("IPod: playing music.");
    }

    @Override
    public void pause() {
               System.out.println("IPod: pausing music.");

    }

    @Override
    public void selectMusic() {
                System.out.println("IPod: selecting music.");

    }
    
}
