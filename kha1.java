package Session1;

import java.util.Scanner;

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số n bất kỳ: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là: %d", n, sum);
        }
    }

}
