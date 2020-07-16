class SquareRoot
{
     long floorSqrt(long x)
	 {
	long l =0,r=x,ans=0;
		while(l<=r)
		{ long mid=l-((l-r)/2);
		    if(mid*mid==x)
		    return mid;
		    if(mid*mid>x)
		    r=mid-1;
		    else{
		    ans = mid;
		    l=mid+1;
		    }
		}
		return ans;
	 }
}
