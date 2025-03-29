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
        
    public void setAnswer(String answer){
        this.answer = answer;
    }
        

    public String getProblem(){
        return this.problem;
    }

    public String getAnswer(){
        return this.answer;
    }

    public boolean checkAnswer(String response){
        if (this.answer.equals(response.trim())){
            return true;
        }
        else return false;
    }

    public void displayProblem(){
        System.out.println(this.problem);
    }


}




public class JavaPorj {
    public static void main(String[] args) {
        
        ArrayList<ProblemAndAnswer> pandA = new ArrayList<>(); // Arraylists that hold objects of the ProbelmAndAnswer class
        ProblemAndAnswer major = new ProblemAndAnswer();
        
        ProblemAndAnswer[] iterate = new ProblemAndAnswer[15]; // makes an array that can store 15 objects 

        //Addition
        for (int i = 0; i<iterate.length-10; i++){  
            iterate[i] = new ProblemAndAnswer();
            int a = (int)(Math.random()*64);
            int b = (int)(Math.random()*64);
            String aBinary = Integer.toBinaryString(a);
            String bBinary = Integer.toBinaryString(b);
            String problem = aBinary + " + " + bBinary;
            int answer = a+b;
            System.out.println(answer);
            String aAnswer = Integer.toBinaryString(answer);
            pandA.add(iterate[i]);
            iterate[i].setProblem(problem);
            iterate[i].setAnswer(aAnswer);
            
            System.out.println(iterate[i].getProblem());
            System.out.println(iterate[i].getAnswer());

        }
        System.out.println(iterate[0].getAnswer());


        // For subtraction
        for (int i = 5; i<iterate.length-5; i++){ 
            iterate[i] = new ProblemAndAnswer();
            int a = (int)(Math.random()*64);
            int b = (int)(Math.random()*64);
            while (b > a){ // Don't want negative numbers for this assigment
             b = (int)(Math.random()*64);
        }
            String aBinary = Integer.toBinaryString(a);
            String bBinary = Integer.toBinaryString(b);
            String problem = aBinary + " - " + bBinary;
            int answer = a-b;
            System.out.println(answer);
            String aAnswer = Integer.toBinaryString(answer);
            pandA.add(iterate[i]);
            iterate[i].setProblem(problem);
            iterate[i].setAnswer(aAnswer);
            
            System.out.println(iterate[i].problem);
            System.out.println(iterate[i].answer);

        }
        // For Division
        for (int i = 10; i<iterate.length; i++){ 
            iterate[i] = new ProblemAndAnswer();
            int a = (int)(Math.random()*64);
            int b = (int)(Math.random()*64);
            String aBinary = Integer.toBinaryString(a);
            String bBinary = Integer.toBinaryString(b);
            String problem = aBinary + " * " + bBinary;
            int answer = a*b;
            System.out.println(answer);
            String aAnswer = Integer.toBinaryString(answer);
            pandA.add(iterate[i]);
            iterate[i].setProblem(problem);
            iterate[i].setAnswer(aAnswer);
            
            System.out.println(iterate[i].problem);
            System.out.println(iterate[i].answer);

        }
        String title = "Binary Math Tutor 1.0";
        // check if other methods are working

        // Each problem must be chosen randomly, each problem must be chosen once,

        // use math.random again to pick a number between 0 and 15, (the index's of the arraylist) then remove from the arraylist
        JOptionPane.showMessageDialog(null, "Welcome to the Binary Math Tutor 1.0!\n          Let's stat practicing! ",title,JOptionPane.INFORMATION_MESSAGE );
        boolean choice = true;
        while (choice = true){
            int random_Problem = (int)(Math.random()*15);
            //System.out.println(pandA.get(random_Problem).getAnswer()); // Get answer to check if works
            String userAnswerBinary = JOptionPane.showInputDialog(pandA.get(random_Problem).getProblem(), "Your Answer?"); // Picks random problem to display
            
            System.out.println(pandA.get(random_Problem).checkAnswer(userAnswerBinary));
            if (pandA.get(random_Problem).checkAnswer(userAnswerBinary) == true){
                System.out.println("Yes");
            }else System.out.println("Sorry, but no :(");
            pandA.remove(random_Problem); // Removes problem 
            

        }


        System.out.println(iterate[1].getAnswer());         //Works
        System.out.println(pandA.get(1).getAnswer());   // Works, USe array list because we can later remove elements bc no repeat questions

        int a =  (int)(Math.random()*64); // generate random number between 0 and 63
        int b = (int)(Math.random()*64);
        
       

        while (b > a){ // Don't want negative numbers for this assigment
             b = (int)(Math.random()*64);
        }
         //////////String answer = String.valueOf(a+b);
         //int answer = a+b;  // has to be after while (b > a) 



        //String aBinary = Integer.toBinaryString(a);
        //String bBinary = Integer.toBinaryString(b);

        //String problem = aBinary + " + " + bBinary;
        //System.out.println(answer);
        //String aAnswer = Integer.toBinaryString(answer);


        

        
        
        

        //pandA.add(major); // Adds major object ot arraylist

        

        //major.setProblem(problem);
        //major.setAnswer(aAnswer);

        //System.out.println(major.problem);
        //System.out.println(major.answer);
        //JOptionPane.showMessageDialog(null, "Question " + major.problem + "!");
    }




}

// Im thinking, make an array of 15 strings, loop the array in order to create 15 

