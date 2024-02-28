
/***
 * Singleton Lazy Holder
 * 
 * @author matheus-fvp13
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
    
}
