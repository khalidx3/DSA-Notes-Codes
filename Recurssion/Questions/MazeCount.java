public class MazeCount {
    public static int count(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // to move down
        int downPath = count(i + 1, j, n, m);
        // to move right
        int rightPath = count(i, j + 1, n, m);
        return downPath + rightPath;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalCount = count(0, 0, n, m);
        System.out.println(totalCount);
    }
}
