public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyProxy myProxy= new MyProxy(8088);
        myProxy.listen();
    }
}
