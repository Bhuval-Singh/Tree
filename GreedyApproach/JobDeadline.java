
//Find job deadline and maximum profit
import java.util.*;

public class JobDeadline {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 2, 20 }, { 3, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> job = new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            job.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(job,(a,b) -> b.profit - a.profit);
        ArrayList<Integer> seq= new ArrayList<>();
        int time=0;
        for(int i=0;i<job.size();i++){
            Job curr = job.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
