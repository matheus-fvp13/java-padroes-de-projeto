public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy sl = SingletonLazy.getInstancia();
        System.out.println(sl);
        sl = SingletonLazy.getInstancia();
        System.out.println(sl);

        SingletonEager se = SingletonEager.getInstancia();
        System.out.println(se);
        se = SingletonEager.getInstancia();
        System.out.println(se);

        SingletonLazyHolder slh = SingletonLazyHolder.getInstancia();
        System.out.println(slh);
        slh = SingletonLazyHolder.getInstancia();
        System.out.println(slh);
    }
}
