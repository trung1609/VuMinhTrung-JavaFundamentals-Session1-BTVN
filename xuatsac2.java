package Session1;

import java.util.Scanner;

public class xuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap van toc (km/h): ");
        float v = sc.nextFloat();
        System.out.print("Nhap thoi gian di (gio): ");
        float t = sc.nextFloat();

        float s = (v >= 0 && t >= 0) ? (v * t) : -1;
        String message = (s >= 0) ?
                String.format("Quang duong di duoc voi van toc %.2f (km/h) va thoi gian %.2f (gio) la: %.2f (km)", v, t, s) : "Du lieu khong chinh xac";
        System.out.println(message);
    }
}
