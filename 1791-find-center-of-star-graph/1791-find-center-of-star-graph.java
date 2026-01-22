class Solution {
    public int findCenter(int[][] edges) {
        int size = edges.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] arr : edges) {
            int v = arr[0];
            int u = arr[1];

            map.put(v, map.getOrDefault(v,0) + 1);
            map.put(u, map.getOrDefault(u,0) + 1);
        }

        for (int Key : map.keySet()) {
            if (map.get(Key) == size)
                return Key;
        }
        return -1;
    }
}