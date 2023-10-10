package recursiontest;

public class RecursionFunctions {
    RecursionFunctions() {};

    public int getPowerFunction(int x, int n) {
        
        System.out.printf("[x=%d],[n=%d]\n",x,n);

        if (n == 1) {
            return x;
        } else {
            return x*getPowerFunction(x, n-1);
        }

    }

    public void getStepFunction(int steps) {

        if (steps == 0) {
            return;
        }
        getStepFunction(steps - 1);

        System.out.printf("You take step #%d\n", steps);

    }

    public int getFactorialFunction(int x) {
        
        if (x == 1) {
            System.out.printf("[xif=%d]\n",x);
            return x;
        } else {
            System.out.printf("[xelse=%d], [x*getFactorialFunction(x-1)=%d]\n",x,x*getFactorialFunction(x-1));
            int m = getFactorialFunction(x-1);
            return m*x;
        }

    }

    public int mystery5(int x, int y) {
        if (x < 0) {
            return -mystery5(-x, y);
        } else if (y < 0) {
            return -mystery5(x, -y);
        } else if (x == 0 && y == 0) {
            return 0;
        } else {
            return 100 * mystery5(x / 10, y / 10) + 10 * (x % 10) + y % 10;
        }
    }
    
}
