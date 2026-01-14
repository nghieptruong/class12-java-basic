package basic;

public class OperatorDemo {
    public static void main(String[] args) {
        //1. Toan tu so hoc: + - * / %
        // Bieu thuc: x + y = z
        int x = 1;
        int y = 2;
        int z = x + y;
        System.out.println(z);

//        Toan tu % la chia so dư
        System.out.println(1 / 2); // phep toan chia nguyen (0.5 ep kieu sang so nguyen 0)
        System.out.println(1 % 2); // 1 (phan dư bao cho biet la 1 la so le)
        System.out.println(2 % 2); // 0 (phần dư bao cho biet la so 2 la so chan)

        //2.toan tu gan
        int a = 1;
        int b = 2;
        a += b; //toan tu cong gan --> a = a + b
        System.out.println(a); // 3

        //3. toan tu so sanh
        int x1 = 2;
        int x2 = 2;
        boolean result = x1 != x2;
        System.out.println(result);

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("hashcode s1 = " + System.identityHashCode(s1));  // 1791741888
        System.out.println("hashcode s2 = " + System.identityHashCode(s2));  // 1791741888
        boolean result1 = s1 == s2; // so sanh 2 dia chia reference (2 dia chi tham chieu)
        System.out.println(result1); // true

        String s3 = new String("Hello");
        System.out.println("hashcode s3 = " + System.identityHashCode(s3)); // 883049899
        System.out.println(s3); // Hello
        System.out.println(s3 == s1); // false

        //Sanh sanh noi dung 2 chuoi voi nhau phai dung phuong thuc .equal()
        System.out.println(s3.equals(s1)); // true
        System.out.println(s1.equals(s2)); // true

        String s4 = s3.intern(); // dua object mới vào string pool
        System.out.println(s4 == s1); // 1791741888 --> true

        //4. toan tu &&, ||, ! (phép toán phủ định)
        boolean isMatchAge = false;
        boolean isGoodHealth = false;
        boolean isMilitaryJoined = isMatchAge && isGoodHealth;
        System.out.println(isMilitaryJoined); // false

        System.out.println("-------------------------");
        boolean isCorrect = true;
        System.out.println(isCorrect); // true

        isCorrect = !isCorrect;
        System.out.println(isCorrect); // false

        boolean falseValue = false;
        System.out.println(!falseValue); // true

        System.out.println("---------------------");
        //5. toan tu tang giam
        //prefix: ++x (tang truoc)
        //postfix: x++ (tang sau)

        // Tang bien num len 1 --> 2
        int num = 1;
//        num = num + 1;
//        num += 1;
//        ++num;    // tang 1
//        num++;    // tang 1

        //case1: ++num --> tang truoc, sau do lam phep toan thu 2 (+. -, *, /, =....)
        int sum = ++num; // 1. num tang truoc (tang len 1 --> num: 2), buoc 2: gan num cho sum (num: 2 gan cho sum --> sum: 2)
        System.out.println(sum); // 1 hay 2 ???
        System.out.println("num = " + num);

//        case 1: int sum = ++num; ---> sum: 2
//        case 2: int sum = num++; ---> sum: 1   --> 1.thuc hien gan truoc (num: 1 gan cho sum --> sum : 1) -->  buoc 2: tang sau

        System.out.println("------------");
        int m = 5;
        int n = 4;
        int res1 = n + ++m; // 10
        System.out.println(res1);
    }
}
