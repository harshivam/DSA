class Solution {
    public int[] findErrorNums(int[] nums) {
        cyclic_sort(nums);
        int[] result = new int[2];
        int i = 1;
        for(int ele: nums){
            if(ele!=i){
                result[0] = ele;
                result[1] = i;
            }
            i++;
        }
        return result;
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