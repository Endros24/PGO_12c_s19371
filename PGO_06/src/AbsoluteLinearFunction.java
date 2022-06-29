import static java.lang.Math.abs;

public class AbsoluteLinearFunction extends LinearFunction implements Fun{

    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public double f(double x) {
        return abs(super.f(x));
    }
}
