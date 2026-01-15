package basic;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 4 / 2;
            int[] arr = {1, 2, 3};
            System.out.println(result);
            System.out.println(arr[0]);
        } catch (ArithmeticException e) {
            System.out.println("Phep chia khong hop le!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Truy cap phan tu khong hop le!");
        } finally {
            System.out.println("See you again!");
        }

    }
}
