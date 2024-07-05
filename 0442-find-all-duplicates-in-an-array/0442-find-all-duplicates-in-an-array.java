class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        cyclic_sort(nums);
        int i = 1;
        for(int ele: nums){
            if(ele!=i){
                list.add(ele);
            }
            i++;
        }
        return list;
    }
     static void cyclic_sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(i<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int [] arr ,int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}