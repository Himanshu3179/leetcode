class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<target.length;j++){
                if(arr[i]==target[j]){
                    found = true;
                    target[j]=-1;
                    break;
                }   
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}