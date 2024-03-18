public class FloatDetail {

    public static void main(String[] args) {
        float num1 = 1.1f;
        System.out.println(num1);

        double num2 = 1.2;
        System.out.println(num2);

        double num3 = .22;
        System.out.println(num3);

        // 科学计数法
        double num4 = 5.12e2;
        System.out.println(num4);

        double num5 = 5.12e-2;
        System.out.println(num5);

        double num6 = 25.123322421243324;
        float num7 = 5.123322421243324f;

        System.out.println(num6);
        System.out.println(num7);

        double num8 = 2.7;
        double num9 = 8.1 / 3;

        System.out.println(num8);
        System.out.println(num9);

        // 错误写法
        if (num8 == num9) {
            System.out.println("相等");
        }

        // 正确写法
        System.out.println(Math.abs(num9 - num8));

        if (Math.abs(num9 - num8) < 0.00000001) {
            System.out.println("相等");
        }
    }
}