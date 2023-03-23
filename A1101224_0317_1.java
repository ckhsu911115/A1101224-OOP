import java.util.Scanner;

public class A1101224_0317_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    while (true) {
      System.out.print("請輸入一個數字 n：");
      if (sc.hasNextInt()) {
        n = sc.nextInt();
        break;
      } else {
        System.out.println("錯誤，請輸入一個數字。");
        sc.next();
      }
    }

    int m = 0;
    while (true) {
      System.out.print("請輸入一個數字 m：");
      if (sc.hasNextInt()) {
        m = sc.nextInt();
        break;
      } else {
        System.out.println("錯誤，請輸入一個數字。");
        sc.next();
      }
    }

    int[][] arr = new int[n][m];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        arr[i-1][j-1] = i * j;
      }
    }

    for (int[] row : arr) {
      for (int element : row) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}


