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
    
    public class candidateInfo implements Comparable{
        int competence=0;
        boolean isEmployee=false;
        candidateInfo(boolean isEmployee, int competence){
            this.isEmployee = isEmployee;
            this.competence = competence;
        }

        @Override
        public int compareTo(candidateInfo other) {
        return this.competence-other.competence;
    }


    public static void main(String[] args) throws Exception{
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(iSR);
        
    }

   
    
}

/*
First day - Identifying the problem.
In this problem we can use priority Queue to get a candidate of office who is  having minimum competent value.
That value would be compared with the interviewed candidate and then person with maximum competence would be 
remain in office. 
Wrote little bit of code.
*/
