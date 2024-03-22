/**
 * 递归
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        // recursion.test(10);

        // System.out.println("----------");

        // recursion.test2(10);

        // recursion.test3(10);

        // int res = recursion.test4(4);
        // System.out.println("阶乘" + res);
        
        // int res = recursion.exercise1(5);
        // System.out.println("斐波那契数" + res);

        // int res = recursion.exercise2(9);
        // System.out.println("吃桃子" + res);

        // boolean res = recursion.isPowerOfThree(9);
        // System.out.println("3的幂次" + res);

        // boolean res = recursion.isPowerOfTwo(8);
        // System.out.println("2的幂次" + res);

        
    }

    public void test(int n){
        if(n > 2){
            test(n - 1);
        }
        System.out.println(n);
    }

    public void test2(int n){
        System.out.println(n);
        
        n = n - 1;
        if(n > 2){
            test2(n);
        }
        
    }

    public void test3(int n){
        if(n > 2){
            test3(n - 1);
        }else{
            System.out.println(n);
        }
    }

    public int test4(int n){
        if(n == 1){
            return 1;
        }else{
            return this.test4(n - 1) * n;
        }

    }

    public int exercise1(int num){
        /**
         * 斐波那契数列 1，1，2，3，5，8，13
         */
        if (num < 3) {
            return 1;
        }else{
            return exercise1(num - 1) + exercise1(num-2);
        }
    }

    public int exercise2(int num){
        /**
         * 猴子每天吃一半的桃子 并多吃一个
         * 第十天时剩下1个 
         * 第一天剩下多少
         * 10 -> 1
         * 9 -> (1 + 1) * 2 = 4
         * 8 -> ((1 + 1) * 2 + 1) * 2 = 10
         */
        if (num == 10) {
            return 1;
        }else{
            return (exercise2(num + 1) + 1) * 2;
        }
    }

    public boolean isPowerOfThree(int n){
        /**
         * n = 0时 false
         * 1 / 3 = 0 。。。1
         * 2 / 3 = 0 。。。2
         * 3 / 3 = 1 。。。0
         * 4 / 3 = 1 。。。1
         * 5 / 3 = 1 。。。2
         */

        if (n > 1) {
            return isPowerOfThree(n / 3) && n%3==0;
        }else if(n == 1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isPowerOfTwo(int n){
        if (n > 1) {
            return isPowerOfTwo(n / 2) && n%2==0;
        }else if(n == 1){
            return true;
        }else {
            return false;
        }
    }
}
