//calculadora
public class SiCalcu {
    private static SiCalcu calcu;// variable estatica

    private SiCalcu() {

    }

    public synchronized static SiCalcu getInstance() {
        if (calcu == null) {
            calcu = new SiCalcu();
        }
        return calcu;
    }
    
    public int add(int a, int b){
    return a + b;
    }
    
    public int quit(int a, int b){
    return a - b;
    }
    
    public int multi(int a, int b){
    return a * b;
    }
    
    public int div(int a, int b){
    return a / b ;
    }
}