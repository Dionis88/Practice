import java.util.Arrays;
import java.util.Scanner;


public class ArraysClasswork {
    public static void main(String[] args) {
       /* int[] arrEven;
        arrEven=new int[50];
        for (int i=1; i<=50; i++) {
            arrEven[i-1]=i*2;

        }

        int[] arrOdd;
        arrOdd=new int[50];
        for (int i=0; i<=49; i++) {
            arrOdd[i]=1+i*2;

        }


        int[] fibo;
        fibo=new int[20];
        fibo[0]=1;
        fibo[1]=1;
        for (int i=2; i<20; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }

        for (int el : fibo) {
            System.out.println(el);
        }

        */

        int arr[][] = {{1,1,1,-1}, {1,1,1,-1}, {-1, -1, -1, 1}, {1,-1,1,-1}};

        //for (int i=0; i<4; i++) {
           // System.out.println(Arrays.toString(arr[i]));

       // }

        boolean lockIsClosed=true;
        while (lockIsClosed) {
            for (int i=0; i<4; i++) {
                for (int j=0; j<4; j++) {
                    if (arr[i][j]==1) System.out.print(" | ");
                    if (arr[i][j]==-1) System.out.print(" - ");
                    if (arr[i][j]==-0) System.out.print(" 0 ");
                }
                System.out.print("\n");
            }

            System.out.println("Веди номер рычага по вертикали (сверху вниз, 1-4), который ты хочешь повернуть");
            Scanner scanX=new Scanner(System.in);
            int x=scanX.nextInt();
            System.out.println("Веди номер рычага по горизонтали (слева направо, 1-4), который ты хочешь повернуть");
            Scanner scanY=new Scanner(System.in);
            int y=scanY.nextInt();

            if (x>5 || x<1) x=1;
            if (y>5 || y<1) y=1;

            x--;
            y--;
            arr[x][y]*=-1;

            lockIsClosed=false;

            for (int i=0; i<4; i++) {
                arr[x][i]*=-1;


            }

            for (int j = 0; j < 4; j++) {
                arr[j][y]*=-1;

            }

            for (int i=0; i<4; i++) {
                if (lockIsClosed) {
                    break;
                }
                for (int j=0; j<4; j++) {
                    if (arr[i][j]==1) {
                        lockIsClosed=true;
                        break;
                    }
                }
            }
            if (!lockIsClosed) {
                System.out.println("Ура!!! Ты открыл сейф!");
                break;
            }

        }

    }
}
