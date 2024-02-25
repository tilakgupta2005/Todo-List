import java.util.*;

class Todo
  {
  public static void main(String[] args)
    {
      int choice,i,del,n;
      String temp,newtask;
      Boolean add = false;
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to TODO APP");
      System.out.println("No of tasks you want to add");
      n = sc.nextInt(); //takes the no of task user want to add
      sc.nextLine();
      System.out.println("Enter your Tasks");
      String tasks[] = new String [99999];
      for(i=0 ;i<n;)
        {
        temp = sc.nextLine();
         tasks[i] = Integer.toString(i+1)+". "+temp;//formats the input
          i++;
        }
      for(int i=0 ;i<n;i++)
      {
       System.out.println(tasks[i]);
      }
      do
        {
      System.out.println("\n1 for delete\n2 for update\n3 for add\n4 for exit the app(will delete all the data)\n");
      choice = sc.nextInt();
      switch(choice)
      {
        case 1:
            System.out.println("Enter the task number you want to delete");
            del = sc.nextInt();
            for(i=0;i<n;i++)
              {
                  if(i == del-1)
                  {
                    tasks[i] = "Deleted";
                  }
              }
                for(i=0 ;i<n;i++)
                {
                 System.out.println(tasks[i]);
                }
          break;
            case 2:
            System.out.println("Enter the task number you want to update");
            del = sc.nextInt();
            for(i=0;i<n;i++)
              {
              if(i == del-1)
              {
                System.out.println("Enter the new task");
                sc.nextLine();
                temp = sc.nextLine();
                tasks[i] = Integer.toString(del)+". "+temp; 
              }
              }
                for(i=0 ;i<n;i++)
                {
                 System.out.println(tasks[i]);
                }
             break; 
            case 3:
          for(i=0;i<n;i++)
            {
              if(tasks[i] == "Deleted")
              {
                add = true;
                sc.nextLine();
                System.out.println("Enter the new task");
                newtask = sc.nextLine();
                tasks[i] = Integer.toString(i+1)+". "+newtask;
                i=n;
              }
              }
          if(!add)
          {
            sc.nextLine();
            System.out.println("Enter the new task");
            newtask = sc.nextLine();
            tasks[n] = Integer.toString(n +1)+". "+newtask;
            n++;
          }
                for(i=0 ;i<n;i++)
                {
                 System.out.println(tasks[i]);
                }
          break;
        default :
          System.out.println("All Data Deleted");
      }
    }
        while(choice != 4);
    }
}
  //Can create upto 99999 task,once the code is stoped all the data will be deleted
// Contact for query:- https://linktr.ee/tilakgupta2005
