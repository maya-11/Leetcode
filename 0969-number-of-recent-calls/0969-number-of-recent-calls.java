import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        // add the new request
        q.offer(t);
        
        // remove outdated requests (older than t - 3000)
        while (q.peek() < t - 3000) {
            q.poll();
        }
        
        // number of recent requests
        return q.size();
    }
}


