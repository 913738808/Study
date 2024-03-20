public class YangHui {
    public static void main(String[] args) {
        int length = 10;

        int arr[][] = new int[length][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + "" + '\t');
            }
            System.out.println('\n');
        }
    }
}
