class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        int j=0;
        while(k>0){
            if(j<arr.length){
                if(arr[j]>i){
                    k--;
                    i++;
                }
                else if(arr[j]<i){
                    j++;
                }
                else{
                    j++;
                    i++;
                }
            }
            else{
                i++;
                k--;
            }
            
        }
        return i-1;
    }
}
