public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i >= 0 && i <= 10) {
            System.out.println(i);
            i++;


        }

        i=-20;

        while (i>=-20 && i<=20) {
            System.out.println(i);
            i++;

        }
        i=30;
        while (i<=30 && i>=10) {
            System.out.println(i);
            i--;

        }
        i=1;
        while (i>=1 && i<=100) {
            if (i%7==0) System.out.println(i);
            i++;

        }

        i=1;
        while (i>=1 && i<=100) {
            if (i%3==0 || i%5==0) System.out.println(i);
            i++;

        }



    }
}
