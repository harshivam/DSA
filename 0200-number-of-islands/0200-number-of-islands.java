class Solution {
    int row;
    int col;

    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;

        boolean[][] visited = new boolean[row][col];
        int component = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    component++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return component;
    }

    void dfs(char[][] grid, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col]
                || grid[row][col] == '0')
            return;
        int[][] edge = new int[][] { { row + 1, col }, { row - 1, col }, { row, col - 1 }, { row, col + 1 } };
        visited[row][col] = true;

        for (int[] neighbour : edge) {
            dfs(grid, neighbour[0], neighbour[1], visited);
        }
    }

}