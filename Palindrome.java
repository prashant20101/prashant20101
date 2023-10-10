public class Palindrome{
    public boolean isPallindrome(String str)
    {
        String rev="";
        boolean answer=false;
        for(int i=str.length()-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            answer=true;
        }
        return answer;
    }
}

