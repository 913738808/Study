import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            String output = "";
            for (int j = 0; j < length * 2 - 1; j++) {
                if(i == length - 1){
                    output += "*";
                }else{
                    if(j == length - i - 1 || length + i - 1 == j){
                        output += "*";
                    }else{
                        output += " ";
                    }
                }
            }

            System.out.println(output);
        }
    }
    
}
