import java.util.ArrayList;
import java.util.List;

public class LCR187 {
    public static void main(String[] args) {
        LCR187 lcr187 = new LCR187();
        int res = lcr187.iceBreakingGame(12, 5);
        // int res = lcr187.iceBreakingGame(7, 4);
        System.out.println(res);
    }

    public int iceBreakingGame(int num, int target) {
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        return this.run(list, target,0);

    }

    public int run(List<Integer> list,int target,int index){
        // 0 1 2 3 4 5 6
        if (list.size() == 1) {
            return list.get(0);
        }else{
            // System.out.println(list.toString());
            
            // index = target + index - 1;
            // if(index >= list.size()){
            //     index = index - list.size();
            // }
            for(int i = 0;i < target - 1;i++){
                index++;
                // System.out.println(index);
                if(index == list.size()){
                    index = 0;
                }
            }

            // System.out.println(index);

            list.remove(index);

            if (index == list.size()) {
                index = 0;
            }
            
            return run(list, target,index);
        }

    }
}
