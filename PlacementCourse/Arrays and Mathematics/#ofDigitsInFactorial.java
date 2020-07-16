class Factorial
{
    
    public int digitsInFactorial(int n)
    {
        //Your code here
        if(n<0)
    return 0;
    if(n<=1)
    return 1;
   double x = (n * Math.log10(n / Math. exp(1.0)) + 
                    Math.log10(2 * 3.14 * n) /  
                    2.0); 
  
        return (int)Math.floor(x) + 1; 
    }

}