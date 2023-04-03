package lab2;

public class Method {
    public static double[] getMinOfVector(MyFoo foo, double[] start, double[] dir, double eps) {
        double norma = Math.sqrt(Math.pow(dir[0], 2) + Math.pow(dir[1], 2) + Math.pow(dir[2], 2));
        double[] moving = new double[] { dir[0]/norma, dir[1]/norma, dir[2]/norma };
        double[] next = new double[] { start[0]+moving[0], start[1]+moving[1], start[2]+moving[2] };

        double currF = foo.insert(start);
        double nextF = foo.insert(next);

        if (currF < nextF) {
            moving[0] = -moving[0];
            moving[1] = -moving[1];
            moving[2] = -moving[2];
        }

        //double[] currentPoint = new double[] { start[0], start[1], start[2] };
        double[] currentPoint = new double[3];
        next = new double[] { start[0]+moving[0], start[1]+moving[1], start[2]+moving[2] };
        //double currF = foo.insert(start);
        nextF = foo.insert(next);

        while (nextF < currF) {
            currentPoint = next;
            currF = nextF;
            next = new double[] { next[0]+moving[0], next[1]+moving[1], next[2]+moving[2] };
            nextF = foo.insert(next);
            moving[0] *= 2;
            moving[1] *= 2;
            moving[2] *= 2;
        }

        

        return new double[] { x, y, z };
    }
}
