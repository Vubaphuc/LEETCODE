//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if((target-nums[j])==nums[i]){
                        return new int[]{i,j};
                    }
                }
            }
            return null;
    }
}
// 9. Palindrome Number
class Solution {
    public boolean isPalindrome(int number) {
        int temp = 0;
        int num = number;
        while (num > 0){
            temp = temp*10+ num %10;
            num = num/10;
        }
        if (temp != number){
            return false;
        } else {
            return true;
        }
    }
}
// 13. Roman to Integer
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        int ans = map.get(s.charAt(len-1));
        for (int i = len -2; i >= 0; i--){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                ans += map.get(s.charAt(i));
            } else {
                ans -= map.get(s.charAt(i));
            }
        }
        return ans;
    }
}

// 14. Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last  = strs[strs.length - 1].toCharArray();
        int i = 0;
        int len = Math.min(first.length, last.length);
        while (i < len && first[i] == last[i]){
            i++;
        }
        return strs[0].substring(0, i);
    }
}
// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int a = nums.length;
        for(int i = 0; i < a; i++){
            if(nums[i] == val){
                nums[i] = nums[a - 1];
                i--;
                a--;
            }
        }
    return a;
    }
}

// 35. Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}

// 58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        int num = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ' && num == 0) {
                i--;
            } else if (s.charAt(i) != ' ') {
                i--;
                num++;
            } else {
                break;
            }
        }
        return num;
    }
}

// 66. Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len -1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int []newDigits = new int[len+1];
        newDigits[0] = 1;
        return newDigits;
    }
}

// 69. Sqrt(x)
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}

// 118. Pascal's Triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows <=0){
            return lists;
        }
        for (int i = 0; i < numRows; i++){
            List<Integer> list =  new ArrayList<>();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i){
                    list.add(1);
                } else {
                    list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
// 121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int num = prices[0];
            int max = -1;
            for (int i = 1; i < prices.length; i++) {
                max = Math.max(max,prices[i] - num);
                num = Math.min(num,prices[i]);
            }
            return  max>0?max:0;
    }
}

// 136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j= 0; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   a++;
               } 
           }
            if (a == 1){
                return nums[i];
            } 
        }
        return 0;
    }
}
// 2235. Add Two Integers
class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
// 2469. Convert the Temperature
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.80 + 32.00;
        double ans[] = {kelvin,fahrenheit};
        return ans;
    }
}
// 1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            ans[i]=nums[a];
        }
        return ans;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j= 0; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   a++;
               } 
           }
            if (a == 1){
                return nums[i];
            } 
        }
        return 0;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
            for(int i : nums) {
                if(set.contains(i)) {
                    set.remove(i);
                } else {
                    set.add(i);
                }
            }
            return set.iterator().next();
    }
}
// 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
         int a = 0;
        for(int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int check = 0;
            while(b>0) {
                b = b/10;
                check++;
            }
            if(check % 2 == 0) {
                a++;
            }
        }
        return a;
    }
}
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //1. lay tung phan tu mang 2
        for(int j = 0; j < n; j++){
            //2 tim vi tri chen mang 1
            int i = 0;
            while(i < m && nums1[i] < nums2[j]){
                i++;
            } 
            // chen
            for(int u = m; u > i; u--){
                nums1[u] = nums1[u-1];
            }
            nums1[i] = nums2[j];
            m++;
        }
    }
}
// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int a = nums.length;
        for(int i = 0; i < a; i++){
            if(nums[i] == val){
                nums[i] = nums[a - 1];
                i--;
                a--;
            }
        }
    return a;
    }
}
// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int sumNums = 0;
        int runningSums[] = new int [nums.length];
        for (int i= 0; i < nums.length; i++){
            sumNums += nums[i];
            runningSums[i] = sumNums;
        }
        return runningSums;
    }
}
// 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
            String newString = s;
            while(s.length() > 0)
            {
                int curLength = s.length();
                String first = String.valueOf(s.charAt(0));
                s = s.replaceAll(first, "");
                if(s.length() == curLength - 1)
                    return newString.indexOf(first);
            }
            return -1;
    }
}
// 283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] == 0 && nums[j] !=0){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
        }
    }
}
// 217. Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        Arrays.sort(nums);
        int check = -1;
        for(int i : nums){
            if(i != check){
                check = i;
            } else {
                return true;
            }
        }
    return false;
    }
}
// 1051. Height Checker
class Solution {
    public int heightChecker(int[] heights) {
        int nums[] = heights.clone();
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(heights[i] != nums[i]){
                ans++;
            }
        }
        return ans;
    }
}