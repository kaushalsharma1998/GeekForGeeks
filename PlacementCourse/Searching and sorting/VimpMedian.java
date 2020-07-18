public static int findMedian(int nums1[], int o, int nums2[], int p){
   int n1 = nums1.length;
int n2= nums2.length;
int p1=0,p2=0;
int k=0;
int[] res = new int[n1+n2];
while (p1<n1 || p2<n2)
{
if(p1<n1 && p2<n2)
{
if(nums1[p1]<nums2[p2])
{
res[k++] = nums1[p1++];
}
else
{
res[k++]= nums2[p2++];
}

        }else if(p1<n1 && p2>=n2)
        {
            res[k++] =nums1[p1++];
        }else
        {
            res[k++] = nums2[p2++];
         }
    }
    int t= n1+n2;
    if(t%2 ==0)
    {
        return (res[t/2]+res[t/2-1])/2;
    }
    
    return res[t/2];
}