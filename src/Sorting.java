import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1=input.nextInt();
        System.out.println("Enter the number 2:");
        num2=input.nextInt();
        System.out.println("Enter the number 3:");
        num3=input.nextInt();


        if(num1>=num2&&num1>=num3){
            if(num2>=num3){
                System.out.println(num3+"<="+num2+"<="+num1);
            }else {
                System.out.println(num2+"<="+num3+"<="+num1);
            }
        } else if (num2>=num1 && num2>=num3) {
            if(num1>=num3){
                System.out.println(num3+"<="+num1+"<="+num2);
            }else {
                System.out.println(num1+"<="+num3+"<="+num2);
            }
        }else {
            if(num1>=num2){
                System.out.println(num2+"<="+num1+"<="+num3);
            }else {
                System.out.println(num1+"<="+num2+"<="+num3);
            }
        }

    }
}
