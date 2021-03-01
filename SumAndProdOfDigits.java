import java.util.Scanner;

public class SumAndProdOfDigits {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scan=new Scanner(System.in);
        String num=scan.nextLine();


        char[] digits=num.toCharArray();

        int sum=0;
        int prod=1;

        for (int i=0; i<digits.length; i++) {
            sum+=digits[i]-'0';
            prod*=digits[i]-'0';
        }
        System.out.println("sum of digits is "+ sum);
        System.out.println("Product of digits is "+ prod);
    }
}
