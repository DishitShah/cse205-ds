import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<String>();
        recursion(s,0,0,"",n);
        return s;

    }
    public void recursion(List<String> s,int l,int r,String str,int n){
        if(str.length() == n*2){
            s.add(str);
            return;
        }
        if(l<n){
            recursion(s,l+1,r,str+"(",n);
        }
        if(l>r){
            recursion(s,l,r+1,str+")",n);
        }
    }
}
