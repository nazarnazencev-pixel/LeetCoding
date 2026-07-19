class Solution {
    public boolean isPalindrome(int x) {
    int pal = x;
    int rev = 0;
    if (x < 0) return false;
    
        while(x != 0){
            int a = x % 10;
            rev = rev * 10 + a;
            x /= 10;
        }

        if(rev != pal){
            return false;
        }
        return true;
    }
}
