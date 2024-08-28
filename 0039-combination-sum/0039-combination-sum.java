class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int index = 0;
        recursiveCombination(candidates,index,sum,target,ans,list);
       return ans;
    }
    static void recursiveCombination(int[] arr, int index , int sum , int k, List<List<Integer>> ans,ArrayList<Integer> list){
        if(sum==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>k){
            return;
        }
        if(index==arr.length){
            return;
        }
        sum+= arr[index];
        list.add(arr[index]);
        recursiveCombination(arr,index,sum,k,ans,list);
        sum-=arr[index];
        list.remove(list.size()-1);
        recursiveCombination(arr,index+1,sum,k,ans,list);
    }
}