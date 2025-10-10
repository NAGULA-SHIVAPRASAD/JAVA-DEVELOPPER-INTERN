import java.util.ArrayList;
import java.util.Scanner;
class ToDo{
    public static void main(String [] ar){
        Scanner s1=new Scanner(System.in);
        ArrayList<String>todolist=new ArrayList<>();
        int choi;
        do{
            System.out.println("features of tasks ");
            System.out.println("1.add task");
            System.out.println("2. view");
            System.out.println("3.remove");
            System.out.println("4.exit");
            


System.out.println("select the option");
            choi=s1.nextInt();
            s1.nextLine();
            switch(choi){
                case 1:
                    System.out.println("enter taask");
                    String task=s1.nextLine();
                    todolist.add(task);
                    System.out.println("task added");
                    break;
                case 2:
                    System.out.println("\n--your task---");
                    if(todolist.isEmpty()){
                        System.out.println("no task is there");
                    }
                    else{
                        for(int i=0;i<todolist.size();i++){
                            System.out.println((i+1)+"."+todolist.get(i));
                        }
                    }
                    break;
                    case 3:
                        System.out.println("enter task num to remove");
                        int index=s1.nextInt();
                        s1.nextLine();
                        if(index>0&&index<=todolist.size()){
                            todolist.remove(index-1);
                            System.out.println("task removed");
                        }
                        else{
                            System.out.println("invalid task index");
                        }
                        break;
                    case 4:
                        System.out.println("exiting the menu");
                        break;
                    default:
                        System.out.println("invalid option");
            }
            }    while(choi!=4);
                s1.close();
    }
}