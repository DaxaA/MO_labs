package lab2;

public class LabTwo {
    public static void start() {
        MyFoo fun = new Function1();
        double[] point = new double[] {1, 32, 12};
        double eps = Math.pow(10, -6);
        double[] dir = new double[] {0, 0, -1};
        double[] solution = Method.getMinOfVector(fun, point, dir, eps);
        System.out.println("(" + solution[0] + ", " + solution[1] + ", " + solution[2] + ")");
    }
}
