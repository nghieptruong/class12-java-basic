package basic;

import java.util.Scanner;

public class ExerciseDemo2 {
    public static void main(String[] args) {
        /*
            Bài tập về nhà bảng quyết định:
            Nếu bạn có thẻ đường sắt "over 60s" thì được giảm giá 34% trên tất cả các vé bạn mua.
            Nếu bạn đi cùng với trẻ em (dưới 16 tuổi), thì bạn sẽ được giảm 50% nếu bạn có thẻ
            "family rail card", ngược lại bạn sẽ được giảm 10%. Bạn chỉ được sử dụng 1 loại thẻ
            đường sắt.
            Hãy viết bảng quyết định liệt kê toàn bộ các kết hợp loại thẻ và kết quả giảm giá. Và viết
            test case từ bảng quyết định này
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card (over 60s|family rail card|Others): ");
        String inputCard = sc.nextLine();
        System.out.println("Your card is '" + inputCard + "'");
        System.out.println("Has children (true/false)?");
        String inputChildren = sc.nextLine();
        boolean hasChildren = Boolean.parseBoolean(inputChildren);

        if(inputCard.equals("over 60s")) {
            System.out.println("giam 34%");
        } else if(inputCard.equals("family rail card")) {
            if(hasChildren) {
                System.out.println("giam 50%");
            } else {
                System.out.println("giam 0%");
            }
        } else {
            if(hasChildren) {
                System.out.println("giam 10%");
            } else {
                System.out.println("giam 0%");
            }
        }


        // Chuong trinh dang co bug
//        if(inputCard.equals("over 60s")) {
//            System.out.println("giam gia 34%");
//        } else {
//            System.out.println("Has children (true/false)?");
//            String inputChildren = sc.nextLine();
//            boolean hasChildren = Boolean.parseBoolean(inputChildren);
//            if(hasChildren) {
//                if(inputCard.equals("family rail card")) {
//                    System.out.println("giam gia 50%");
//                }
//            } else {
//                System.out.println("giam gia 10%");
//            }
//        }

    }
}
