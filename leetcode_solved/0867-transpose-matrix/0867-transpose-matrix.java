class Solution {
    public int[][] transpose(int[][] m) {
            int a=m[0].length;
            int b=m.length;
            int[][]t=new int[a][b];
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                t[j][i]=m[i][j];
            
            }
        }
        return t;
        
    }
}