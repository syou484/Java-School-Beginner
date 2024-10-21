import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] agrs)
    {
        int[] arr;
        arr = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("三つの数値を入力してください");
        for (int i = 0; i <= 2; i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 1; j <= 3; j++){
            System.out.println(j + "番目の要素の値は" + arr[j-1] + "で、２倍にすると" + (arr[j-1] * 2) + "になり、３で割ったあまりは" + (arr[j-1] % 3) + "です");
        }
    }
}
