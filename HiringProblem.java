/*
  Book - Introduction To Algorithms(Standard)
  Chapter - Probabilistic Analysis and Randomized Algorithms
  Concept - The hiring Problem
  Page No. - 114, 115
  Status :- Not completed  
*/
import java.io.*;
import java.util.*;

public class HiringProblem {
    
    public class candidateInfo implements Comparable<candidateInfo>{
        int competence=0, candidateId=0;
        boolean isEmployee=false;
        candidateInfo(int candidateId, boolean isEmployee, int competence){
            this.candidateId = candidateId;
            this.isEmployee = isEmployee;
            this.competence = competence;
        }

        @Override
        public int compareTo(candidateInfo o) {
        return  o.competence - this.competence;
    }


    public static void main(String[] args) throws Exception{
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iSR);

        System.out.println("Enter the number of all possible people in competition");
        int totalNumOfCandidate = Integer.parseInt(br.readLine());
        ProrityQueue<candidateInfo> maxCompetence = new PriorityQueue<candidateInfo>();
        
        System.out.println("Enter all potential people for company with candidateId.");
        System.out.println("If they the persons who have been just interviewed then add 0 in candidateId");
        System.out.println();

        for(int entryItr=0; entryItr<totalNumOfCandidate; entryItr++){
            System.out.print("Enter candidate Id: - ");
            int candidateId = Integer.parseInt(br.readLine());
            
            System.out.print("Enter competence: - ");
            int competence = Integer.parseInt(br.readLine());

            // if(candidateId==0){
                
            // } else {

            // }
        }

    }

    
}

/*
First day - Identifying the problem.
In this problem we can use priority Queue to get a candidate of office who is  having minimum competent value.
That value would be compared with the interviewed candidate and then person with maximum competence would be 
remain in office. 
Wrote little bit of code.

Second day - Corrected the errors. Still having problem with priority queue.
*/
