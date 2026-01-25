package oop;

public class DemoStatic {
    public static void main(String[] args) {

        //Viet ham static dung cho utilities (ham tien ich)

        int defaultTimeout1 = Constants.DEFAULT_TIMEOUT;
        System.out.println(defaultTimeout1); // 10

        System.out.println("--------------");
        Constants c1 = new Constants();
        int defaultC1 = c1.DEFAULT_TIMEOUT;
        System.out.println("[c1] = " + defaultC1); // 10
        c1.DEFAULT_TIMEOUT = 20;
        System.out.println("[c1] After modified: " + c1.DEFAULT_TIMEOUT); // 20
        System.out.println("Constants.DEFAULT_TIMEOUT = " + Constants.DEFAULT_TIMEOUT); // 20

        System.out.println("--------------");
        Constants c2 = new Constants();
        int defaultC2 = c2.DEFAULT_TIMEOUT;
        System.out.println("[c2] = " + defaultC2); // 20
        c2.DEFAULT_TIMEOUT = 30;
        System.out.println("[c2] After modified: " + c2.DEFAULT_TIMEOUT); // 30

        System.out.println("[c1] After modified: " + c1.DEFAULT_TIMEOUT); // 30

        System.out.println("------------------");
        //Static: ko can phai "new" doi tuong de goi static variable hay static method,...
        //Truy cap bang cach: <Ten Class>.<static var/static method>
        int defaultTimeout2 = Constants.DEFAULT_TIMEOUT;
        System.out.println(defaultTimeout2); // 30
    }
}
