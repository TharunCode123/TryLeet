class Solution {
    public int diagonalSum(int[][] mat) {
        int sum  = 0 ;
        for(int i = 0 ; i < mat.length ; i++){
            sum = sum + mat[i][i];
            sum = sum +mat[i][mat.length - 1  - i];
        }
        int n = mat.length ;
        if(mat.length%2!=0){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }
}