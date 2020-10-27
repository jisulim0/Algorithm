class Solution {

    private int[] nodes;
    private int currentCount;

    public Solution() {
        currentCount = 0;
        nodes = new int[1000000];
    }

    public int solution(int[] scoville, int k) {
        int answer = 0;

        for(int i=0; i<scoville.length; i++){
            insertHeap(scoville[i]);
        }

        while (nodes != null){
            int val1 = deleteHeap();
            if(val1 < k){
                if (currentCount == 0) return -1;
                int mixSco = val1 + 2*deleteHeap();
                insertHeap(mixSco);
                answer++;
            }
            else{
                break;
            }
        }

        return answer;
    }

    public void insertHeap(int value) {
        int i = ++currentCount;
        while ((i != 1) && (value < nodes[i/2])) {
            nodes[i] = nodes[i/2];
            i /= 2;
        }
        nodes[i] = value;
    }

    public int deleteHeap() {
        int parent, child;
        int remove;
        int temp;

        remove = nodes[1];
        temp = nodes[currentCount--];
        parent = 1;
        child = 2;

        while (child <= currentCount) {
            if ((child < currentCount) && (nodes[child] > nodes[child+1]))
                child++;

            if (temp <= nodes[child])
                break;

            nodes[parent] = nodes[child];
            parent =  child;
            child *= 2;
        }

        nodes[parent] = temp;

        return remove;
    }

}