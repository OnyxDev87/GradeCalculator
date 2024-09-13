import java.util.Scanner;

class main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the course name.");
        String className = scan.nextLine();

        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        double averageWeekTime = scan.nextDouble();
        int averageHours = (int)(averageWeekTime / 60);
        int averagemins = (int)(averageWeekTime % 60);
        
        System.out.println("How many homeworks do you have?");
        int numHomeworks = scan.nextInt();

        System.out.println("How much is homework weighed?");
        float homeworkWeight = scan.nextFloat();

        System.out.println("Please enter the homework grades for this course.");
        
        float[] homeworks;
        homeworks = new float[numHomeworks];
        for(int i=0; i<homeworks.length; i++) {
          homeworks[i] = scan.nextFloat();
        }

        System.out.println("How many classworks do you have?");
        int numClassworks = scan.nextInt();

        System.out.println("How much is classwork weighed?");
        float classworkWeight = scan.nextFloat();

        System.out.println("Please enter the classwork grades for this course.");
        
        float[] classworks;
        classworks = new float[numClassworks];
        for(int i=0; i<classworks.length; i++) {
          classworks[i] = scan.nextFloat();
        }

        System.out.println("How many quizzes do you have?");
        int numQuizzes = scan.nextInt();

        System.out.println("How much are quizzes weighed?");
        float quizWeight = scan.nextFloat();

        System.out.println("Please enter the quiz grades for this course.");
        
        float[] quizzes;
        quizzes = new float[numQuizzes];
        for(int i=0; i<quizzes.length; i++) {
          quizzes[i] = scan.nextFloat();
        }

        System.out.println("How many exams do you have?");
        int numExams = scan.nextInt();

        System.out.println("How much are exams weighed?");
        float examWeight = scan.nextFloat();

        System.out.println("Please enter the exam grades for this course.");
        
        float[] exams;
        exams = new float[numExams];
        for(int i=0; i<exams.length; i++) {
          exams[i] = scan.nextFloat();
        }

        System.out.println("Course name: " + className);
        System.out.println("Weekly time spent: " + averageHours + "h" + averagemins);

        double averageHomework = 0;
        for(int i=0; i<homeworks.length; i++) {
          averageHomework += homeworks[i];
        }
        averageHomework /= homeworks.length;

        double averageClasswork = 0;
        for(int i=0; i<classworks.length; i++) {
          averageClasswork += classworks[i];
        }
        averageClasswork /= classworks.length;

        double averageQuiz = 0;
        for(int i=0; i<quizzes.length; i++) {
          averageQuiz += quizzes[i];
        }
        averageQuiz /= quizzes.length;

        double averageExam = 0;
        for(int i=0; i<exams.length; i++) {
          averageExam += exams[i];
        }
        averageExam /= exams.length;
        System.out.println("Average homework grade: " + averageHomework);
        System.out.println("Average classwork grade: " + averageClasswork);
        System.out.println("Average quiz grade: " + averageQuiz);
        System.out.println("Average exam grade: " + averageExam);
        double overallGrade = ((averageHomework * homeworkWeight) + (averageClasswork * classworkWeight) + (averageQuiz * quizWeight) + (averageExam * examWeight));
        int roundedGrade = (int) (overallGrade+0.5);
        System.out.println("Overall grade: " + roundedGrade);
    }
}
//Grades to enter
//75
//99
//80
//100
//89.2
//98.1
//87.58
