package basic;

import java.util.Scanner;

public class ExerciseDemo {
    public static void main(String[] args) {
        /*
            Hệ thống vé vào khu vui chơi có nhập chiều cao (cm) vào cột chiều cao trên hệ thống website trực tuyến.
            Chi tiết được mô tả như sau:
            Chiều cao được nhập phải là số nguyên không bao gồm chữ và số âm với đơn vị tính là cm.
            Khi nhập chiều cao từ 40 -99 cm sẽ miễn phí vé vào
            Chiều cao từ 100 – 140 đơn giá sẽ hiển thị [150000]
            Chiều cao từ 141 – 200 giá vé sẽ là [300000]
            Nếu chiều cao hơn 200 hệ thống sẽ thông báo lỗi
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height (cm): ");
        String input = sc.nextLine();
        int height = Integer.parseInt(input);
        System.out.println("Your height is " + height + " cm");

        if(height >= 40 && height <= 99) {
            System.out.println("Mien phi ve vao !");
        } else if(height >= 100 && height <= 140) {
            System.out.println("Gia ve la 150000");
        } else if(height >= 141 && height <= 200) {
            System.out.println("Gia ve la 300000");
        } else {
            System.out.println("Invalid Height !");
        }

    }
}
