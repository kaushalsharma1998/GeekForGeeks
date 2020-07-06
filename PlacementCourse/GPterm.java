class GP 
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r= (double)B/(double)A;
        return A*Math.pow(r,N-1);
    }

}