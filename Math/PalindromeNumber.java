class Solution {
    public boolean isPalindrome(int x) {
          int temp,digit,rev=0;
        temp=x;
        if(x<0){
            return false;
        }
     while(x!=0){
         digit=x%10;
         rev=(rev*10)+digit;
         x/=10;
     }
        if(rev==temp){
             
                  return true;
           }
           
        else{
                 return false;
            
         }
        
    }
}
