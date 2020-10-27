package test;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();

        String answer = "";

        for (String insert : participant){
            if(hashMap.get(insert) == null){
                hashMap.put(insert, 1);
            }
            else{
                int val = hashMap.get(insert) + 1;
                hashMap.put(insert, val);
            }
        }

        for(String finish : completion){
            int val = hashMap.get(finish) - 1;
            hashMap.put(finish, val);
        }

        for(String ret : hashMap.keySet()){
            if(hashMap.get(ret) == 1){
                answer = ret;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        Solution s = new Solution();
        String answer = s.solution(p, c);
        System.out.println(answer);
    }

}
