bool isPrime(int n)
{
    //Your code here
      if(n==2||n==3||n==5||n==7||n==11||n==13||n==17||n==19||n==23)
     return true;
     
    if(n%6!=5&&n%6!=1)
    
        return false;
  
    
    if(n%2==0||n%3==0||n%5==0||n%7==0||n%11==0||n%13==0||n%17==0||n%19==0||n%23==0)
    return false;
    for(int i=24;i*i<=n;i++)
    { if((n%i)==0)
        return false;
    }
    return true;
}