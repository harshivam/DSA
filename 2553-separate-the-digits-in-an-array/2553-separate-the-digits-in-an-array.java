class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
         for(int i =n-1;i>=0;i--){
            int num = nums[i];
            while(num>0){
                int lastdigit = num%10;
                list.add(lastdigit);
                num/=10;
            
            }
         }
         Collections.reverse(list);
         int[] res = new int[list.size()];
         int k =0;
         for(int ele: list){
            res[k++] = ele;
         }
        return res;
    }
}