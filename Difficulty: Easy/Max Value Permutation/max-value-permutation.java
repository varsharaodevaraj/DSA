// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        
        int MOD = 1_000_000_007;
        long ans = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            ans = (ans + ((long) arr[i] * i) % MOD) % MOD;
        }

        return (int) ans;
    }
}
