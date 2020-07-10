
class EquilibriumPoint {

    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long a[], int n) {

        // Your code here
   long fs = 0;
for (int i = 0; i < n; i++) {
    
    fs += a[i];
}
long s=0;

for (int i=0;i<n;i++)
     {
        
        if (s ==fs-s-a[i])
            return i+1;
            s += a[i];
        } 
        return - 1; 
    } 
}
