class Sol
{
    public String multiply(String a,String b)
    {
        BigInteger f=new BigInteger(a);
        f=f.multiply(new BigInteger(b));
        return f.toString();
        
    }
}