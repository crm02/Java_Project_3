import java.util.ArrayList;
import javax.swing.JOptionPane;
//The problems and their corresponding answer must be stored as an array or arraylist as ProblemAnsAnswer objects

//Create B as a ProblemAndAnswer object, it's assigned default String Problem and String Answer, store B in Arraylist, have B's problem and answer
// calculated and updated, continue with rest

// Create number vars separate to the object, and assing it to object, we have object a, generate two numbers with their own variables, send to setProblem

class ProblemAndAnswer{
        String problem;
        String answer;
    

    public ProblemAndAnswer(){// A default constructor that initializes the   // problem and answer to the empty string
        this.problem = "";
        this.answer = "";
    }     

    public void setProblem(String problem){// Pass generated string problem from main
        this.problem = problem;
    }   
        
    public void setAnswer(String answer){}

    //public String getProblem(){}

   // public String getAnswer(){}

   // public boolean checkAnswer(String response){}

    //public void displayProblem(){}


}




public class JavaPorj {
    public static void main(String[] args) {
        ArrayList<ProblemAndAnswer> pandA = new ArrayList<>(); // Arraylists that hold objects of the ProbelmAndAnswer class
        ProblemAndAnswer major = new ProblemAndAnswer();
        


        int a =  (int)(Math.random()*64); // generate random number between 0 and 63
        int b = (int)(Math.random()*64);
        
        

        while (b > a){ // Don't want negative numbers for this assigment
             b = (int)(Math.random()*64);
        }
        String aBinary = Integer.toBinaryString(a);
        String bBinary = Integer.toBinaryString(b);

        String problem = aBinary + " + " + bBinary;




        

        
        
        

        pandA.add(major); // Adds major object ot arraylist

        

        major.setProblem(problem);
        System.out.println(major.problem);
        JOptionPane.showMessageDialog(null, "Question " + major.problem + "!");
    }




}

// Im thinking, make an array of 15 strings, loop the array in order to create 15 

