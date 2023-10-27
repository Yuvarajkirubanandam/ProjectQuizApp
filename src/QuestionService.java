import java.util.Scanner;
public class QuestionService {
    String userInput[] = new String[5];
    String userName;
    Question[] questions = new Question[5];
    public QuestionService()
   {
       questions[0] = new Question(1,"Which keyword in java is used to define a constant variable?","static","final","constant","var","final");
       questions[1] = new Question(2,"Guess the output of the following program ?\n String x ='Java'; \n String y='programming'; \n System.out.println(x+y);","Error","javaprogramming","programmingjava","java","Error");
       questions[2] = new Question(3,"In java which is non primitive data type?","int","char","boolean","String","String");
       questions[3] = new Question(4,"Which java keyword is used to create a new instance of a class?","new","class","instance","create","new");
       questions[4] = new Question(5,"Which operator is used to assign a value to a variable in java?","+","-","==","=","=");
   }

   public void playQuiz()
   {
       System.out.print("Enter your name: ");
       Scanner sc = new Scanner(System.in);
       userName  = sc.nextLine();
       int i=0;
       for(Question q: questions){
           System.out.print("Question number: "+q.getQuenum() + ". ");
           System.out.println(q.getQuestion());
           System.out.println("Option A: "+q.getOpt1());
           System.out.println("Option B: "+q.getOpt2());
           System.out.println("Option C: "+q.getOpt3());
           System.out.println("Option D: "+q.getOpt4());
           System.out.print("Enter your answer: ");
           userInput[i] = sc.nextLine();
           i++;
       }
   }
   public void printScore()
   {
       int score  = 0;
       for(int i=0;i<questions.length;i++)
       {
           Question que = questions[i];
           String answer = que.getAnswer();
           String userAnswer = userInput[i];
           if(userAnswer.equalsIgnoreCase(answer))
           {
               score +=10;
           }
       }
       System.out.println("Hai "+userName + " Your Score is : " + score +"\n Thank You For Playing Quiz....");
   }

}
