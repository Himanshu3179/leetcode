class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }

        
        int start=1;
        int end=max;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isEatingValid(piles,mid,h)){
                ans = mid;
                end=mid-1;
            }   
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    boolean isEatingValid(int []piles,int speed ,int hours){
        int hoursSpent= 0;
        for(int i=0;i<piles.length;i++){
            hoursSpent+=piles[i]/speed;
            if((piles[i]%speed)!=0){
                hoursSpent++;
            }
            if(hoursSpent>hours){
                return false;
            }
        }
        return true;
    }
}