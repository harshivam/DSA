class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { sr, sc });
        image[sr][sc] = color;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int r = temp[0];
            int c = temp[1];
            int[][] edges = new int[][] { { r + 1, c }, { r, c + 1 }, { r, c - 1 }, { r - 1, c } };
            for (int[] neighbour : edges) {
                int nr = neighbour[0];
                int nc = neighbour[1];

                if (nr < 0 || nc < 0 || nr >= image.length || nc >= image[0].length)
                    continue;

                if (image[nr][nc] != originalColor)
                    continue;

                queue.offer(new int[] { nr, nc });
                image[nr][nc] = color;
            }
        }
        return image;

    }

    // void dfs(int[][] image, int sr, int sc, int color, int originalColor) {
    //     if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor || image[sr][sc]==color)
    //         return;
    //     image[sr][sc] = color;

    //     // left call 
    //     dfs(image, sr, sc - 1, color,  originalColor);
    //     // right call 
    //     dfs(image, sr, sc + 1, color, originalColor);
    //     // top call 
    //     dfs(image, sr - 1, sc, color, originalColor);
    //     // bottom call 
    //     dfs(image, sr + 1, sc, color, originalColor);
    // }
}