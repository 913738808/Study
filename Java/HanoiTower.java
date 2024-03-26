import java.util.ArrayList;
import java.util.List;

public class HanoiTower {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<Integer>();
        List<Integer> cList = new ArrayList<Integer>();

        aList.add(5);
        aList.add(4);
        aList.add(3);
        aList.add(2);
        aList.add(1);

        HanoiTower hanoiTower = new HanoiTower();
        hanoiTower.hanota(aList, bList, cList);
    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        /**
         * 1
         * 2
         * 3
         * 4
         * 5
         */

        AToC(A.size(), A, B, C);

        System.out.println("\n--------A--------\n");
        for (int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i));
        }

        System.out.println("\n--------B--------\n");
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i));
        }

        System.out.println("\n--------C--------\n");
        for (int i = 0; i < C.size(); i++) {
            System.out.print(C.get(i));
        }
    }

    public void AToC(int length, List<Integer> A, List<Integer> B, List<Integer> C) {

        if (length == 1) {

            C.add(A.get(A.size() - 1));
            A.remove(A.size() - 1);

        } else {

            AToC(length - 1, A, C, B);

            AToC(1, A, B, C);

            AToC(length - 1, B, A, C);

        }

    }
}
