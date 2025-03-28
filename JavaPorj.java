import java.util.ArrayList;
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
        
   // public void setAnswer(String answer){}

    //public String getProblem(){}

   // public String getAnswer(){}

   // public boolean checkAnswer(String response){}

    //public void displayProblem(){}


}




public class JavaPorj {
    public static void main(String[] args) {
        ArrayList<String> pandA = new ArrayList<>();

        int a =  (int)(Math.random()*64); // generate random number between 0 and 63
        String b = Integer.toBinaryString(a);
        System.out.println(a);
        System.out.println(b);

        ProblemAndAnswer major = new ProblemAndAnswer();
        major.setProblem(b);
    }




}

