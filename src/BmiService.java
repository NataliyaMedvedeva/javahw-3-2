public class BmiService {
    public int calculate(double a, int b) {
        double index = b / (a * a);
        int result = (int) index;
        return result;
    }
}
