import java.util.*;
class numgame{
    public static void main(String [] ar){
    Scanner s1=new Scanner(System.in);
    Random r1=new Random();
    int t1=r1.nextInt(100)+1;
    int guess,attempts=0;
    System.out.println("Guess the number bt 1 and 100");
    while(!false){
        System.out.println("enter your guess number");
        guess=s1.nextInt();
        attempts++;
        if(guess==t1){
            System.out.println("correct");
            System.out.println("number of attempts is:"+attempts);
            break;
        }
        else if(t1<guess){
            System.out.println("Too High try again");
        }
        else{
            System.out.println("Too loo try again");
        }
    }
}
}