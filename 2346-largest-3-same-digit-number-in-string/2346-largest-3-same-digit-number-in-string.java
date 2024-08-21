class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int c = 0;
        String ans = "";
        for(int i=0; i<n-2; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                String a = num.substring(i,i+3);
                if(Integer.parseInt(a)>=c){
                    c = Integer.parseInt(a);
                    ans = a;
                }
            }
        }
        return ans;
    }
}