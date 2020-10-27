class Solution {
    public String solution(String s) {
        String answer = "";
        int  strlen = s.length();
        if((strlen %2) == 0)  //짝수일때
        {
            answer = answer + s.substring((s.length())/2-1, (s.length())/2+1);
        }
        else
        {
            answer = answer + s.substring((s.length())/2, (s.length())/2+1);
        }
        return answer;
    }
}