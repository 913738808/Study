public class VarParams {
    public static void main(String[] args) {
        int res = new VarParams().add(1,2,3,4,5,8,6,89);
        System.out.println(res);
    }

    public int add(int a,int b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b;
    }

    // int... 表示可以接收可变参数 类型是int 
    // 使用时可以将params当作数组使用
    public int add(int... params){
        int sum = 0;
        
        for (int i = 0; i < params.length; i++) {
            sum += params[i];
        }

        return sum;
    }
}
