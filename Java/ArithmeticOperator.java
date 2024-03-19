public class ArithmeticOperator {
    
    public static void main(String[] args) {
        // int类型 运算后 还是int类型
        // 自动去除小数位 得 2
        System.out.println(10/4);
        float a = 10 / 4;
        System.out.println(a);

        // 计算完成后 再将int结果 隐式转换为float
        // 所以结果还是2.0
        float b = 10 / 4;
        System.out.println(b);

        // 运算时自动将int（10）提示为高精度的float 在进行运算
        // 结果2.5
        float b1 = 10 / 4.0f;
        System.out.println(b1);

        float c = 1.0f * 10 / 4;
        System.out.println(c);
        
        // 先运算10/4得2后 在被提升精度
        // 结果为2.0
        float c1 =  10 / 4 * 1.0f;
        System.out.println(c1);

        
    }

}
