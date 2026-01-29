class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int originalColor = image[sr][sc];
        recurse(image, sr, sc, color, visited, originalColor);
        return image;

    }

    void recurse(int[][] image, int sr, int sc, int color,boolean[][] visited, int originalColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] == true
                || image[sr][sc] != originalColor)
            return;
        image[sr][sc] = color;
        visited[sr][sc] = true;
        // left call 
        recurse(image, sr, sc - 1, color, visited, originalColor);
        // right call 
        recurse(image, sr, sc + 1, color, visited, originalColor);
        // top call 
        recurse(image, sr - 1, sc, color, visited, originalColor);
        // bottom call 
        recurse(image, sr + 1, sc, color,  visited, originalColor);
    }
}