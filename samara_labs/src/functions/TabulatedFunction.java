package functions;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 18.07.13
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
public class TabulatedFunction {
    private Vector<FunctionPoint> vault = new Vector<FunctionPoint>();
    public double getLeftDomainBorder() {
        return vault.firstElement().getYCoordinate();
    }

    public double getRightDomainBorder() {
        return vault.lastElement().getYCoordinate();
    }

    public double getFunctionValue(double x) {
        for (FunctionPoint point: vault) {
            if (point.getXCoordinate() == x)
                return point.getYCoordinate();
        }
        return Double.NaN;
    }
    TabulatedFunction(Vector<FunctionPoint> table) {
        vault = table;
    }
}
