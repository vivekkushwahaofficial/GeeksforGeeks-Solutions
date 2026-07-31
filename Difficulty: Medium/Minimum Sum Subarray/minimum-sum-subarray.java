class Solution {
	static int smallestSumSubarray(int a[], int size) {
		int leastEnding = a[0];
		int ans = a[0];
		
		for (int i = 1; i < size; i++) {
			int v1 = leastEnding + a[i];
			int v2 = a[i];
			leastEnding = Math.min(v1, v2);
			ans = Math.min(ans, leastEnding);
		}
		return ans;
	}
}
