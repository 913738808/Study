public class ArrayDetail {
    public static void main(String[] args) {
        String s[] = {"a","b","c"};

        String s2[] = s;

        s2[1] = "d";

        System.out.println(s[1]);

        s2 = null;
        System.out.println(s[1]);

    }
}
