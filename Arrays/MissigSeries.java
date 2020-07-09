#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main()
{
	int i,n,m,j,k,l,o,p;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&p);
	    int a[p];
	    int b[1000000]={0};
	    int max = -9999;
	    for(j=0;j<p;j++)
	    {
	        scanf("%d",&a[j]);
	        b[a[j]]++;
	        if(a[j]>max)
	        {
	            max=a[j];
	        }
	    }
	    int flag = 0;
	    int O=-78,U=-963,I,L=-78;
	    for(j=0;j<=max;j++)
	    {
	       if(b[j]==0 && flag==0)
	       {
	           O=j;
	           flag=1;
	       }
	       else if(b[j]==0 && flag==1)
	       {
	           L=j;
	       }
	       else if(b[j]>=1 && O!=-78 && L==-78)
	       {
	           U=0;
	           printf("%d ",O);
	           flag = 0;
	           O=-78;
	       }
	       else if(b[j]>=1 && O!=-78 && L!=-78)
	       {
	           U=0;
	           printf("%d-%d ",O,L);
	           O=-78;
	           L=-78;
	           flag=0;
	       }
	    }
	    if(O!=-78)
	    {
	        U=0;
	        printf("%d ",O);
	      flag = 0;
	         O=-78;
	    }
	    else if(O!=-78 && L!=-78)
	    {
	        U=0;
	       printf("%d-%d ",O,L);
	       O=-78;
	       L=-78;
	    }
	    else if(U==-963)
	    {
	        printf("-1");
	    }
	    printf("\n");
	}
}