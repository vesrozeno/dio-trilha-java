public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();
        Safari safari = new Safari();
        IPod ipod = new IPod();
        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.call();
        ipod.play();
        safari.showPage();

        iphone.call();
        iphone.play();
        safari.showPage();
    }
}
