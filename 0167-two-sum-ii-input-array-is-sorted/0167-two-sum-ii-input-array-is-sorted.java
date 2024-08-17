class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int [] arr = new int[2];
        while(start<end){
            int ans = numbers[start]+numbers[end];
            if(ans==target){
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
            else if(ans<target){
                start++;
            }
            else{
                end--;
            }
        }
        return arr;
    }
}