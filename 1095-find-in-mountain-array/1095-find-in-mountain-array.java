class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int length = mountainArr.length();
        int end = length - 1;
        int mid = 0;
        int peakIndex = peakelement(mountainArr, start, end);

        int rightbs = binarySearch(mountainArr, start, peakIndex, target);
        if (rightbs > -1) {
            return rightbs;
        } else {
            return binarySearchAgnostic(mountainArr, peakIndex , end, target);
        }
    }

    int peakelement(MountainArray mountainArr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    int binarySearch(MountainArray mountainArr, int start, int end, int element) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > element) {
                end = mid - 1;
            } else if (mountainArr.get(mid) < element) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    int binarySearchAgnostic(MountainArray mountainArr, int start, int end, int element) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
             if (mountainArr.get(mid) == element) {
                return mid;}
             else if (mountainArr.get(mid) < element) {
                 end = mid - 1;
            } else  {
               start = mid+1;
            } 
        }
        return ans;
    }
}
