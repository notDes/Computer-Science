
public class Student{
    private String Name;
    private int score;
    private int numberOfQuizzes;
 
    
    public Student(String _name){
        this.Name = _name;
        this.numberOfQuizzes = 0;
        this.score = 0;
  
    }

    public String getName(){
      return Name;

    }
    public void addQuiz(int _score){
        this.score+=_score;
        numberOfQuizzes++;      
    }

    public int getTotalScore(){
      return score;

    }
    public double getAverageScore(){

        if(numberOfQuizzes < 0){
             System.out.println("Division by Zero");
        }
          double Average = (double)score / numberOfQuizzes;
          return Average;
    }

}
