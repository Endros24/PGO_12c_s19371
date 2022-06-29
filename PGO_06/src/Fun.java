public interface Fun {

    double f(double x);
    static double minimum(Fun func, double a, double b, double alpha) {
        double result = func.f(a);
        for(double i = a;i <= b;i += alpha){
            if(func.f(i) < result) {
                result = func.f(i);
            }
        }
        return result;
    }
}
