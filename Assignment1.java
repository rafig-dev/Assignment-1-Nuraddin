import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int formulaSwitch = Integer.parseInt(args[0]);
        if (formulaSwitch == 1) {
            float m1 = Float.parseFloat(args[1]);
            if(m1 < 0) {
                System.out.println("First mass must be positive");
                return;
            }

            float m2 = Float.parseFloat(args[2]);
            if(m2 < 0) {
                System.out.println("Second mass must be positive!");
                return;
            }

            float F = Float.parseFloat(args[3]);

            if(F < 0) {
                System.out.println("Force must be positive!");
                return;
            }
            
	        double G = 6.674 * Math.pow(10,-11);
            double r =Math.sqrt((G * m1 * m2) / F);
            System.out.println(r);
        }
        else if (formulaSwitch == 2) {
            double x = Double.parseDouble(args[1]);
            int n = Integer.parseInt(args[2]);

            if(n < 0) {
                System.out.println("n must be positive!");
                return;
            }

            x = x % (2 * Math.PI);

            float answer = 0;

            for (int i = 0; i < n; i++) {
                 answer += (Math.pow(-1,i) * Math.pow(x,2*i + 1)) / factorial(2*i + 1);
            }
            System.out.println(answer);
        }
        else {
            System.out.println("There are only 2 formulas!");
        }
    }
    public static int factorial(int a)
    {
        if (a == 0)
            return 1;
        return a*factorial(a-1);
    }
}