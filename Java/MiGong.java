public class MiGong {
    
    public static void main(String[] args) {
        int height = 20;
        int width = 20;

        int map[][] = new int[height][width];

        for (int i = 0; i < width; i++) {
            map[0][i] = 1;
            map[height - 1][i] = 1;
        }

        for (int i = 0; i < height; i++) {
            map[i][0] = 1;
            map[i][width - 1] = 1;
        }

        map[5][1] = 1;
        map[5][2] = 1;
        map[5][3] = 1;

        map[4][3] = 1;
        map[3][3] = 1;
        map[3][2] = 1;

        System.out.print("\n");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("------------初始化地图-------------");

        MiGong miGong = new MiGong();

        miGong.findWay(map, 1, 1);


        System.out.print("\n");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }

    public boolean findWay(int[][] map,int i,int j){
        // 设定 map[i][j] == 0 未走过
        // 设定 map[i][j] == 1 障碍物
        // 设定 map[i][j] == 2 可走通
        // 设定 map[i][j] == 3 死路
        if (map[18][18] == 2) {
            return true;
        }else {
            if(map[i][j] == 0){
                map[i][j] = 2;
                // 尝试走
                if(findWay(map, i + 1, j)){
                    // 向下
                    return true;
                }else if (findWay(map, i, j + 1)) {
                    // 向右
                    return true;
                }else if (findWay(map, i - 1, j)) {
                    // 向上
                    return true;                    
                }else if (findWay(map, i, j - 1)) {
                    // 向左
                    return true;
                    
                }else{
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
