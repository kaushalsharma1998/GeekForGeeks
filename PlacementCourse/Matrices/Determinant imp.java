class Solution
{
    static void cofactor( int mat[][], int temp[][], int p ,int q, int n)
    {
       int i = 0, j = 0; 
      
        // Looping for each element of  
        // the matrix 
        for (int row = 0; row < n; row++) 
        { 
            for (int col = 0; col < n; col++) 
            { 
                  
                // Copying into temporary matrix  
                // only those element which are  
                // not in given row and column 
                if (row != p && col != q) 
                { 
                    temp[i][j++] = mat[row][col]; 
      
                    // Row is filled, so increase  
                    // row index and reset col  
                    //index 
                    if (j == n - 1) 
                    { 
                        j = 0; 
                        i++; 
                    } 
                } 
            } 
        } 
        
    }
    static int determinantOfMatrix(int matrix[][], int n)
    {
        return helper(matrix,n,n);
    }
    
    static int helper( int mat[][], int n, int N){
        
        int D = 0; // Initialize result 
      
        // Base case : if matrix contains single 
        // element 
        if (n == 1) 
            return mat[0][0]; 
          
        // To store cofactors 
        int temp[][] = new int[N][N];  
          
        // To store sign multiplier 
        int sign = 1;  
      
        // Iterate for each element of first row 
        for (int f = 0; f < n; f++) 
        { 
            // Getting Cofactor of mat[0][f] 
            cofactor(mat, temp, 0, f, n); 
            D += sign * mat[0][f]  
               * helper(temp, n - 1,N); 
      
            // terms are to be added with  
            // alternate sign 
            sign = -sign; 
        } 
      
        return D; 
    }
    
    
}
