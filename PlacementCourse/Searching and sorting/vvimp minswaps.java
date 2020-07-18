class GfG {
    // return the minimum number of swaps required to sort the arra
	public int minSwaps(int[] arr, int N) {
	  int n = arr.length; 

		// Create two arrays and use as pairs where first 
		// array is element and second array 
		// is position of first element 
		ArrayList <int[]>arrpos =new ArrayList <> (); 
		for (int i = 0; i < n; i++) 
			arrpos.add(new int[] {arr[i], i}); 

		// Sort the array by array element values to 
		// get right position of every element as the 
		// elements of second array. 
		arrpos.sort(new Comparator<int[]>() 
		{ 
			@Override
			public int compare(int[] o1, 
							int[] o2) 
			{ 
			 return o1[0]-o2[0];
			} 
		}); 

		// To keep track of visited elements. Initialize 
		// all elements as not visited or false. 
		Boolean[] vis = new Boolean[n]; 
		Arrays.fill(vis, false); 

		// Initialize result 
		int ans = 0; 

		// Traverse array elements 
		for (int i = 0; i < n; i++) 
		{ 
			// already swapped and corrected or 
			// already present at correct pos 
			if (vis[i] || arrpos.get(i)[1] == i) 
				continue; 

			// find out the number of node in 
			// this cycle and add in ans 
			int cycle_size = 0; 
			int j = i; 
			while (!vis[j]) 
			{ 
				vis[j] = true; 

				// move to next node 
				j = arrpos.get(j)[1]; 
				cycle_size++; 
			} 

			// Update answer by adding current cycle. 
			if(cycle_size > 0) 
			{ 
				ans += (cycle_size - 1); 
			} 
		} 

		// Return result 
		return ans;   
	}
	
}