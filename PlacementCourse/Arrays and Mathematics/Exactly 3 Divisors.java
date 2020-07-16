class Divisors
{
    
    public int exactly3Divisors(int n)
    {
        //Your code here
         int nn =(int )Math.ceil(Math.sqrt(n));
         boolean sieve[]=new boolean[nn+1]; //_isnotprime
    sieve[0]=true;
    sieve[1]=true;
    
    for( int i=2;i*i<=nn;i++)
    {
        if(!sieve[i])
        {
            for(int j=i*i;j<=nn; j+=i)
            sieve[j]=true;
        }
    }
    int count=0;
for(int i=2;i*i<=n;i++)
{
    if(sieve[i]==false)

    count++;
}
    return count;
    }
}
