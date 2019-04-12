//Runtime: 12 ms, faster than 81.70% of Java online submissions for Count Primes.
//Memory Usage: 33.1 MB, less than 100.00% of Java online submissions for Count Primes.

class Solution {
    public int countPrimes(int n) {
        boolean[] check = new boolean[n];
        int count = 0;
        for(int a =2;a < n;a++){
            if(check[a]==false){
                count++;
                for(int b = 2;a*b<n;b++){
                    check[a*b] = true;
                }
            }
        }
        return count;
    }
}

