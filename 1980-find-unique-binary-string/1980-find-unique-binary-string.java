class Solution {
    StringBuilder sb;

    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        sb = new StringBuilder();
        int n = nums[0].length();

        for(String st : nums){
            set.add(st);
        }
        return recurse(sb ,set, n);

        
        
    }

    String recurse(StringBuilder sb , HashSet<String> set,int n ){
            if(sb.length()==n){
                if(!set.contains(sb.toString())){
                    return sb.toString();
                }
                return null;
            }
            sb.append('0');
            String left = recurse (sb ,set, n);
            if(left!=null) return left;
            sb.deleteCharAt(sb.length()-1);
            sb.append('1');
            String right = recurse (sb ,set, n);
            sb.deleteCharAt(sb.length()-1);

            return right;

        }
}