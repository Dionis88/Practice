public class For {
    public static void main(String[] args) {
        for (int i=0; i>=-10; i--) {
            System.out.println(i);
        }
        for (int i=-20; i<=20; i++) {
            System.out.println(i);
        }
        for (int i=30; i>=10; i--) {
            System.out.println(i);
        }
        for (int i=1; i<=100; i++) {
            if (i%7==0) System.out.println(i);
        }
        for (int i=1; i<=100; i++) {
            if (i%3==0 || i%5==0) {
                System.out.println(i);
            }
        }
    }
}
