package DependencyInjection;

public class MainClass {
    public static void main(String[] args) {
        Oppo o = new Oppo();
        Iphone i = new Iphone(0);
        i.camera();
    }
}
