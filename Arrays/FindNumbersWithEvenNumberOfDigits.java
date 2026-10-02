class Solution {
    public int findNumbers(int[] n) {
        int total =0;
        for (int c:n){
            int sum=0;
        while(c>0){
            sum +=1;
            c=c/10;
        }
        if(sum%2==0){
            total+=1;
        }
        }
        return total;
    }
}
