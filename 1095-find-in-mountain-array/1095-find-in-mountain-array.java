/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);
        int foundIdx = BS(mountainArr,0,peak,target);
        if(foundIdx==-1){
            foundIdx = BS(mountainArr,peak+1,mountainArr.length()-1,target);
        }
        return foundIdx;
        
        
    }

    public int BS(MountainArray mountainArr,int start,int end,int target){
        boolean isAsc = mountainArr.get(start)<mountainArr.get(end);
        while(start <= end){
            int mid = start+(end-start)/2;
            int midValue = mountainArr.get(mid);
            if(midValue==target){
                return mid;
            }
            else if(isAsc){
                if(target<midValue){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<midValue){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public int findPeakIndex( MountainArray mountainArr) {
        int s=0;
        int e=mountainArr.length()-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(mountainArr.get(m+1)>mountainArr.get(m)){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return e;
    }
}
