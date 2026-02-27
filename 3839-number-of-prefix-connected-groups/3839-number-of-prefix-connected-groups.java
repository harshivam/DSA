class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            if(word.length()>=k){
                String suffix = word.substring(0,k);
                map.put(suffix,map.getOrDefault(suffix,0)+1);
            }
        }
        int count = 0;
        for(int freq : map.values()){
            if(freq>=2) count++;
        }

        return count;
    }
}