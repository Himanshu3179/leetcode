class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        boolean asc = false;
        int n = s.length();
        int idx = 0;
        String arr[] = new String[numRows];
        Arrays.fill(arr,"");
        for(int i=0;i<n;i++){
            arr[idx]=arr[idx]+s.charAt(i);
            if(idx==0 || idx==numRows-1){
                asc=!asc;
            }
            if(asc){
                idx++;
            }
            else{
                idx--;
            }
        }
        String ans = "";
        for(String x:arr){
            ans=ans+x;
        }
        return ans;
    }
}