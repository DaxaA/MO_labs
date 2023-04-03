package lab2;

public class Function1 implements MyFoo {

    double x0 = 3;
    double y0 = 1;
    double a = Math.PI / 6;

    public double insert(double x, double y, double z) {
        return Math.pow((x - x0) * Math.cos(a) + (y - y0) * Math.sin(a), 2) +
                Math.pow((y - y0) * Math.cos(a) - (x - x0) * Math.sin(a), 2) +
                Math.pow(z-3, 2);
    }

    public double insert(double[] vec) {
        double x = vec[0];
        double y = vec[1];
        double z = vec[2];
        return insert(x, y, z);
    }

    public double[] gradVec(double x, double y, double z) {
        double[] vector = new double[3];
        return vector;
    }

    public double[] noGradVec(double x, double y, double z) {
        double[] vector = gradVec(x, y, z);
        vector[0] = -vector[0];
        vector[1] = -vector[1];
        vector[2] = -vector[2];
        return vector;
    }

}
