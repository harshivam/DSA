class Solution {
    public int totalFruit(int[] fruits) {
        int right = 0;
        int maxCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int left = 0; left < fruits.length; left++) {
                int currentFruit = fruits[left];
                map.put(currentFruit,map.getOrDefault(currentFruit,0)+1);
                while(map.size()>2){
                    int rightFruit = fruits[right];
                    map.put(rightFruit,map.get(rightFruit)-1);
                    if(map.get(rightFruit)==0){
                        map.remove(rightFruit);
                    }
                    right++;
                }
           maxCount = Math.max(maxCount,left-right+1);
        }
    return maxCount;
    }
}