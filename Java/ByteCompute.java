public class ByteCompute {
    public static void main(String[] args) {
        int i = 0b0101 >> 2;

        System.out.println(i);

        byte b = -1 >> 2;

        System.out.println(b);

        byte b1 = 0b00000001;
        b1 = (byte)(b1 + 128);
        System.out.println(b1);
    }
}
