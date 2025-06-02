// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        // int n = arr.length;
         int n = arr.length;

    long S = (long) n * (n + 1) / 2;
    long Ssq = (long) n * (n + 1) * (2L * n + 1) / 6;

    long sumArr = 0;
    long sumSqArr = 0;

    for (int i = 0; i < n; i++) {
        sumArr += arr[i];
        sumSqArr += (long) arr[i] * arr[i];
    }

    long diff = sumArr - S; // x - y
    long sum = (sumSqArr - Ssq) / diff; // x + y

    long x = (diff + sum) / 2; // repeating
    long y = x - diff;         // missing

    ArrayList<Integer> res = new ArrayList<>();
    res.add((int) x);
    res.add((int) y);
    return res;
    }
}
