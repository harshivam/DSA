class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        dfs(image, sr, sc, color, originalColor);
        return image;

    }

    void dfs(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor || image[sr][sc]==color)
            return;
        image[sr][sc] = color;
    
        // left call 
        dfs(image, sr, sc - 1, color,  originalColor);
        // right call 
        dfs(image, sr, sc + 1, color, originalColor);
        // top call 
        dfs(image, sr - 1, sc, color, originalColor);
        // bottom call 
        dfs(image, sr + 1, sc, color, originalColor);
    }
}