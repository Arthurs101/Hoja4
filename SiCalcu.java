public class SiCalcu {
    private static SiCalcu calcu;// variable estatica

    private SiCalcu() {

    }

    public static SiCalcu getInstance() {
        if (calcu == null) {
            calcu = new SiCalcu();
        }
        return calcu;
    }
}