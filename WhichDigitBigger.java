import java.util.Scanner;

public class WhichDigitBigger {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scan=new Scanner(System.in);
        String num=scan.nextLine();

        char[] digits=num.toCharArray();

        int max=0;

        for (int i=0; i<digits.length; i++) {
            if (max<(digits[i]-'0')) {
                max=digits[i]-'0';
            }
        }

        System.out.println("Biggest digit is "+ max);

    }
}
