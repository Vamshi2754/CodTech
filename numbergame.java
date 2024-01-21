import java.util.*;

//class
public class numbergame{
    public static void main(String[] args) {
//import sacnner here to take inputs
        Scanner sc = new Scanner(System.in);
        boolean playAgain=true;
        while(playAgain){
            playgame(); // called function
            System.out.print("ENTER 1 TO PLAY AGAIN OR 0 TO EXIT......  ");
            int n = sc.nextInt();
            if(n!=1){
                playAgain=false;
                System.out.println("Thanks for playing.....");
                break;
            }
        }

    }
        public static void playgame() {
        Random random = new Random();
       // Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(100)+1;
        System.out.println("Random number : " + randomNumber);
        
        

        int maxAtempts = 5;
        GuessFun( randomNumber,maxAtempts);
        //int n = sc.nextInt();
        }

    

    public static void GuessFun(int randomNumber,int maxAtempts ){
        Scanner sc = new Scanner(System.in);
       
        int AttemptsDone =0;
            while(AttemptsDone<maxAtempts){
                System.out.println("ENTER YOUR GUESS 1 - 100");
                int userGuess = sc.nextInt();
                AttemptsDone++;
            if(userGuess==randomNumber){
                System.out.println("YES BRO, YOU ARE CORRECT....... WORRAHHHHH");
                break;
            
            } else if(userGuess>randomNumber) {
                    System.out.println("SHIT YOU JUST MISSED ! USER GUESS IS HIGH");
                    
            } else {
                System.out.println("SHIT YOU JUST MISSED ! USER GUESS IS LOW");
                
            }

            if(AttemptsDone == maxAtempts){
                System.out.println("YOU HAVE REACHED MAX ATTEMPTS BRO SHIT...");
            } else{
                System.out.println("Guess again: (" + (maxAtempts - AttemptsDone) + " attempts left)");
            }
            
            
    }
}

}