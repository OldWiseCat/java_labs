package functions;

/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 18.07.13
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class FunctionPoint implements FunctionPointInterface {
    private double X;
    private double Y;
    public double getYCoordinate() {
        return Y;
    }
    public double getXCoordinate() {
        return X;
    }
    FunctionPoint(double x, double y) {
        X = x;
        Y = y;
    }

    FunctionPoint(FunctionPoint point) {
        this.X = point.getXCoordinate();
        this.Y = point.getYCoordinate();
    }

    FunctionPoint() {
        this.X = default_coordinate;
        this.Y = default_coordinate;
    }
}
