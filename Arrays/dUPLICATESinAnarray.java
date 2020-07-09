class Solution {
public static ArrayList<integer> duplicates(int arr[], int n) {
Map<integer,integer> map = new HashMap<>(); 
ArrayList<integer> a=new ArrayList<>();
int count = 0; 
boolean dup = false; 
for(int i = 0; i < n; i++){ 
if(map.containsKey(arr[i])){ 
count = map.get(arr[i]); 
map.put(arr[i], count + 1); 
} 
else{ 
map.put(arr[i], 1); 
} 
}

for(Map.Entry<integer,integer> entry : map.entrySet()) 
{

// if frequency is more than 1 
// print the element 
if(entry.getValue() > 1){ 
a.add(entry.getKey());
// System.out.print(entry.getKey()+ " "); 
dup = true; 
} 
} 
// no duplicates present 
if(!dup){ 
System.out.print("-1"); 
} 
Collections.sort(a);
return a; 
} // code here
}