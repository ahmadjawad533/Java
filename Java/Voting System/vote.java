import java.util.Scanner;
public class vote{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
       
        // Candidates infromation
                System.out.print("Enter total number of Candidates:" + " ");
        int totalcandidates = sc.nextInt();
            sc.nextLine();
        String[] candidatename = new String[totalcandidates];
        String[] candidatesign = new String[totalcandidates];
        int[] voteCount = new int[totalcandidates];

        // Get candidate names
                System.out.println(" ");
                System.out.println("Enter the name of candidates");
            for (
                int i=0; i<totalcandidates; i++
                ){
                System.out.print((i + 1)+"."  );
        candidatename[i]= sc.nextLine();
                }
       
                // totalcandidate =new Candidate(candidatename,candidatesign);
                // Get candidate signs
                System.out.println(" ");
                System.out.println("Enter sign of candidates");
            for (
                int i=0; i<totalcandidates; i++
                ){
                System.out.print((i+1)+"." );
        candidatesign[i] = sc.nextLine();
                 }
       
                 //  Sign and name list
                 System.out.println(" ");
                System.out.println("Candidates and signs list:");
            for (
                int i = 0; i < totalcandidates; i++
                ){
                System.out.println((i +1) + "." + candidatename[i] + "-" + candidatesign[i] );
                 }

                //  Voters information
                System.out.println(" ");
                System.out.print("Enter total number of voters:" + " ");
        int voters = sc.nextInt();
        sc.nextLine();
               
                //  Candidates listing
                System.out.println(" ");
                System.out.println("Enter the candidate to vote");
            for (
                int i = 0; i<voters; i++
                ){
                    System.out.println(" ");
                System.out.println("Voter " + (i+1)+"'s turn:");
                System.out.println("Candidates");
                for (int j = 0; j < totalcandidates; j++) {
                System.out.println((j + 1) + ". " + candidatename[j] + " - " + candidatesign[j]);
                }
                // Voting
        int vote=sc.nextInt();
        sc.nextLine();
            if (
                vote>=1 && vote<=totalcandidates
            ){
                voteCount[vote-1]++;
            }else{
                System.out.println("Invalid choice! Please try again.");
                i--;
            }
            
       }

        // Results
        // Display
        System.out.println("\nVoting Results:");
        for (int i = 0; i < totalcandidates; i++) {
            System.out.println(candidatename[i] + " - " + voteCount[i] + " votes");
        }

        // Find the winner
        int maxVotes = 0;
        String winner = "";
        for (int i = 0; i < totalcandidates; i++) {
            if (voteCount[i] > maxVotes) {
                maxVotes = voteCount[i];
                winner = candidatename[i];
            }
        }

        // Print the winner
        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
        }
    }

