class Solution {
    public int sumFourDivisors(int[] nums) {
        int sumGlobal = 0;
        for (int ele : nums) {
            if (ele < 5)
                continue;
            int countD = countDivisor(ele);
            if (countD > 0) {
                sumGlobal += countD;
            }
        }
        return sumGlobal;

    }

    public int countDivisor(int n) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                    sum += i;
                } else {
                    count += 2;
                    sum += i + n / i;
                }
            }

           
        }
        return count==4?sum:-1;
    }
}