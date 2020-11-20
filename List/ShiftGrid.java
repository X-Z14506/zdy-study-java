//1260. 二维网格迁移
// 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
//
//每次「迁移」操作将会引发下述活动：
//
//位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
//位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
//位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
//请你返回 k 次迁移操作后最终得到的 二维网格。



public class shiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> lists = new ArrayList<>();

        //迁移k次
        for (;k > 0;k--) {
            int[][] newGrid = new int[grid.length][grid[0].length];
            //1.grid[i][j]  ->  grid[i][j + 1]
            for (int i = 0;i < grid.length;i++) {
                for (int j = 0; j < grid[0].length - 1;j++) {
                    newGrid[i][j+1] = grid[i][j];
                }
            }
            //2.grid[i][n - 1]  ->  grid[i + 1][0];
            for (int i = 0; i < grid.length-1;i++) {
                newGrid[i+1][0] = grid[i][grid[0].length-1];
            }
            //3.grid[m - 1][n - 1] -> grid[0][0];
            newGrid[0][0] = grid[grid.length-1][grid[0].length-1];

            grid = newGrid;
        }
        for (int[] ret : grid) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid[0].length;i++) {
                list.add(ret[i]);
            }

            lists.add(list);
        }
        return lists;
    }
}
