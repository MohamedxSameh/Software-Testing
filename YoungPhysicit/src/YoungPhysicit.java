import java.util.Scanner;

public class YoungPhysicit {
    public static void main(String[] args) {
        int x = 0 ,y = 0 ,z = 0 ;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] mat = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++)
        {
            x+=mat[i][0];
            y+=mat[i][1];
            z+=mat[i][2];
        }
        String result = (x == 0 && y == 0 && z == 0) ?"YES": "NO";
        System.out.println(result);
    }
}
