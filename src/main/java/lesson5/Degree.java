package lesson5;

public class Degree {
    public static void main(String[] args) {
        System.out.println(multyply(10, -2)); //5 4 3 2 1
    }

    private static double multyply(float n, int y)    {
        if (n == 0 && y >= 0) {
            return 0;
        }
        if (n == 0 && y < 0) {
            throw new ArithmeticException();
        }
        if (y > 1) {
            return n * multyply(n, y - 1);
        }
        else if (y <= -1) {
            return multyply(n, y + 1)/n;
        }
        else if (y == 1){
            return n;
        }

        else {
            return 1;
        }
    }
}
