class Solution {
    public int concatenatedBinary(int n) {
        int mod = (int) 1e9 + 7;
        long res = 1;
        for (int i = 2; i <= n; i++) {
            int shift = Integer.toBinaryString(i).length();
            res = ((res << shift) + i) % mod;
        }


        return (int) res;
    }


}