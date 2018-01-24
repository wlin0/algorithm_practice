class Solution {
    public boolean isStrobogrammatic(String num) {
        if(num.equals("1") || num.equals("8") || num.equals("0")){
            return true;
        }
        int len = num.length() - 1;
        for(int i = 0; i < num.length() / 2; i++){
            if((num.charAt(i) == '0' && num.charAt(len) == '0')||
               (num.charAt(i) == '1' && num.charAt(len) == '1')||
               (num.charAt(i) == '8' && num.charAt(len) == '8')||
               (num.charAt(i) == '6' && num.charAt(len) == '9')||
               (num.charAt(i) == '9' && num.charAt(len) == '6')){
                   len--;
               }else{
                   return false;
               }
        }
        if(num.length() % 2 == 1 && 
           (num.charAt(len) != '0' && 
            num.charAt(len) != '1' &&
            num.charAt(len) != '8')){
            return false;
        }
        return true;
    }
}