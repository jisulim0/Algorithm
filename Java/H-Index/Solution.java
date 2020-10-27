import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<citations.length; i++){
            arr.add(citations[i]);
        }

        Collections.sort(arr);
        Collections.reverse(arr);


        for(int i=0; i<citations.length; i++){
            System.out.println(i+1 +", "+arr.get(i));
            if(i+1 <= arr.get(i)){
                answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
}