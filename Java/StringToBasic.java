public class StringToBasic {
    public static void main(String[] args) {
        int n1 = 199;
        
        float f1 = 1.99f;

        double d1 = 1.222;

        boolean b1 = false;

        String s1 = n1 + f1 + d1 + "";

        String s2 = b1 + "";


        System.out.println(s1);
        System.out.println(s2);

        String s3 = "123";
        int n2 = Integer.parseInt(s3);
        float f2 = Float.parseFloat(s3);

        System.out.println(n2);
        System.out.println(f2);

        System.out.println(s3.charAt(0));
    }
}
