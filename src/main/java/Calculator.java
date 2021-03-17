public class Calculator {
    public int getSum(int x, int y) {
        return x+y;
    }

    public int getDivide(int x, int y) {
        return x/y;
    }

    public int getMultiple(int x, int y) {
        return x*y;
    }

    public int getSubtract(int x, int y) {
        return x - y;
    }

    public double getSquareRoot(int x, int y) {
        return Math.pow(Double.valueOf(x), Double.valueOf(y));
    }


}
