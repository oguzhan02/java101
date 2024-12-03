import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Please enter the numbers to calculate GCD and LCM:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("GCD: " + getGcd(num1, num2));
        System.out.println("LCM: " + getLcm(num1, num2));
        /* gcd calculation place with while loop
        int x = num1 <= num2 ? num1 : num2;
        int gcd = 1;
        while (x > 0) {
            if (num1 % x == 0 && num2 % x == 0){
                gcd=x;
                break;
            }

            x--;
        }
        System.out.println("gcd:"+gcd);
        */
    }

    public static int getGcd(int number1, int number2) {
        //GCD(a,b)=LCM(b,a % b)
        if (number1 % number2 == 0) return number2;
        else {
            return getGcd(number2, number1 % number2);
        }
    }

    public static int getLcm(int number1, int number2) {
        return (number1 * number2) / getGcd(number1, number2);
    }
}