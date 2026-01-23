class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }

        Arrays.sort(degree);

        // System.out.println(Arrays.toString(degree));
        long res = 0;
        int i = 1;
        for (Long ele : degree) {
            res += ele * i;
            i++;
        }
        return res;
    }

}