class Solution {
    public int maximumWealth(int[][] a){ 
    int sum=0;
    int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            if(sum>temp){
                temp=sum;
            }
            sum=0;
        }
        return temp;
        
    }
}