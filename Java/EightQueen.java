public class EightQueen {

    int N = 4;
    int[][] map = new int[N][N];

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();

        eightQueen.render();

        eightQueen.add(0);
    }

    public void render() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.print("\n");
        }
    }

    public void add(int k) {
        if (k == N) {
            this.render();
        } else {
            for (int i = 0; i < N; i++) {
                if (this.check(k, i)) {
                    this.map[k][i] = 1;

                    add(k + 1);

                    this.map[k][i] = 0;
                }
            }
        }
    }

    public boolean check(int row, int column) {

        for (int i = 0; i < row; i++) {
            if (this.map[i][column] == 1) {
                return false;
            }
        }

        for (int m = row - 1, n = column - 1; m >= 0 && n >= 0; m--, n--) {
            if (this.map[m][n] == 1) {
                return false;
            }
        }

        for (int m = row - 1, n = column + 1; m >= 0 && n < N; m--, n++) {
            if (this.map[m][n] == 1) {
                return false;
            }
        }
        return true;
    }
}
