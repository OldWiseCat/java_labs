import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 11.07.13
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class lab2 {
    private static int RADIAN = 0;
    private static int GRAD = 1;
    private static boolean isRad = false;

    public static double getSumSinuses(Vector<Double> angles,int type) {
        double sum = 0;
        for (double angle: angles) {
           sum+=Math.sin(angle);
        }
        return sum;
    }

    public static void main (String[] args) {
        Vector<Double> angles = new Vector<Double>();
        for (String str: args) {
            try {
                angles.add(Double.parseDouble(str));
            } catch (NumberFormatException i) {
                if (str == "rad") {
                    isRad = true;
                } else if (str != "grad") {
                    System.exit(0);
                }
            }
        }
        double sinSum = 0;
        if (isRad) {
            sinSum = getSumSinuses(angles, RADIAN);
        } else {
            sinSum = getSumSinuses(angles, GRAD);
        }

        System.out.println("Среднее значение = " + sinSum);
    }
}
