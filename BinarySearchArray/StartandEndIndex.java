package binarySearch;
//at least 2 questions a Day

import java.util.Arrays;

public class StartandEndIndex {
    public static void main(String[] args) {
        int[] arr= {-1,-1};
        int[] nums = {1,2,3,3,3,3,3,3,5,5,5,5,7,8};
        arr[0] = binarySearchIndex(nums,3,true);
        arr[1] = binarySearchIndex(nums,3,false);
        System.out.println(Arrays.toString(arr));

    }

  static int binarySearchIndex(int [] arr, int element,Boolean StartIndex) {
      int ans =-1;
      int start = 0;
      int end = arr.length - 1;
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (arr[mid] > element) {
              end = mid-1;

          } else if (arr[mid] < element) {
              start = mid + 1;
          } else {
              ans = mid;
              if (StartIndex) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          }
      }
      return ans;

  }
   static int BS_forInfiniteArray(int[] arr,int target){
        int start =  0;
        int end = 1;
        while (target>arr[end]){
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]>target){
                    end = mid-1;
                }
                else if(arr[mid]<target) start = mid+1;
                else{return mid;}
            }
        return -1;
   }


}
