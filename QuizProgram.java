
    import java.util.Scanner; 
    
    public class QuizProgram { 
    
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        int score = 0; 
        
        System.out.println("Welcome to the Quiz Program!"); 
        
    
        System.out.println("Question 1: What is the capital of Thailand"); 
        System.out.println("a. Bangkok"); 
        System.out.println("b. Bangbang"); 
        System.out.println("c. Bangbangbro");

        String answer1 = input.nextLine().toLowerCase(); 

        if (answer1.equals("a")) { 
        System.out.println("Correct!"); 
        score++; 

        } 
        else { 
        System.out.println("Sorry, the correct answer is Bangkok."); 

        } 
        
        
        System.out.println("Question 2: What is the capital of the Philippines"); 
        System.out.println("a. Philip"); 
        System.out.println("b. Maninya"); 
        System.out.println("c. Manila"); 

        String answer2 = input.nextLine().toLowerCase(); 

        if (answer2.equals("c")) { 

        System.out.println("Correct!"); 
        score++; 

        } 
        else { 

        System.out.println("Sorry, the correct answer is Manila."); 

        } 
        
        
        System.out.println("Your final score is: " + score); 

        input.close();
    } 
    } 