import java.util.Scanner;
import java.util.ArrayList;
class Task3{
    //To do list
    public static void main(String [] args){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter no of tasks");
        int n1=s1.nextInt();
        String[] Tasks=new String[n1];
        for(int i=0;i<n1;i++){
            Tasks[i]=s1.nextLine();
            System.out.println("enter the task"+i+":");
           
        }
        for(int k=0;k<n1;k++){
            System.out.println((k+1)+"task to do:"+Tasks[k]);
        }
    }
}