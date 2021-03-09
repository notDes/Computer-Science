public class Main {

    /**
    * @param args
    */
    public static void main(String[] args) {
    Student n = new Student("n");
    n.addQuiz(43);
    n.addQuiz(34);
    n.addQuiz(5);
    n.addQuiz(2);
    n.addQuiz(1);
    
    System.out.println("Student: " + n.getName());
    System.out.println("Total quiz score: " + n.getTotalScore());
    System.out.println("Average quiz score: " + n.getAverageScore());
    }
    
    
}