// worker class 
package poe;

import javax.swing.*;
import java.util.Scanner ;

public class Worker {   
    private final int MAX_USER = 5; 
    static int MAX_Task = 15;
    
     Login [] users  = new Login[MAX_USER]; // EMPTY ARRAY !!!!
     static int numUser = 0; // count of the users 
     private int loggedInUser = 0;  // amounts of users logged in the app. 
     Task object = new Task();
     Task[] project  = new Task [MAX_Task];
    public void registerUser ()
    {
        
        Scanner input = new Scanner (System.in); 
        Login temp = new Login();
        String userInput = "" ;        
        boolean valid = false ; 
        // check user name 
        
        do 
        {
            System.out.print("Enter preffered username [<8 + _]:");
            userInput = input.next() ;

            if(checkEmptyNull(userInput))
            {
                if(temp.checkUserName(userInput))
                {
                    valid = true;
                }
                
            }
            if (!valid) 
            { // error message from poe 
                printError("Username is not correctly formated," +
                        "\nplease ensure that your username cotains" + 
                        "\nan underscore and is no more than 5 characters"+
                        "\nin length ."); 
               
            }
             
        }
        while(!valid);
        
        temp.setUsername(userInput);
        System.out.println("Username successfully captured");
        //__---_---__---__--__---__--__---_______----
        valid = false;
         do 
        {
            System.out.print("Enter preffered password:");
            userInput = input.next() ;

            if(checkEmptyNull(userInput))
            {
                if(temp.checkPasswordComplexity(userInput))
                {
                    valid = true;
                }
            }
            if (!valid) 
            {
                 printError(" Password is not correctly formatted," +
                        "\nplease ensure that the password contains at least 8 characters" +                         
                        "\na capital letter, a number and a special characters.");
            }
             
        }
         while(!valid);
        temp.setPassword(userInput);
        System.out.print("Password successfully captured");
      //------------------------------
      
        System.out.print(" Enter First Name: ");
        temp.setName (input.next());
        System.out.print(" Enter Last Name : ");
        temp.setSurname(input.next());
        users[numUser] = temp;
        numUser++;     
    }
            
    public void printError(String errorMsg)
    {
        JOptionPane.showMessageDialog(null,errorMsg,"ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean checkEmptyNull(String toCheck)
    {
        boolean valid = false;
        if((toCheck != null)  && (!toCheck.isEmpty()))
        {
            valid = true; 
        }
        return valid;
    }    
    public int printLoginMenu ()
    {
         int selection = 0;
         boolean valid = false; 
         String userInput = ""; 
         do
         {
              userInput = JOptionPane.showInputDialog(
              null,"\tMenu" +
              "\n User Poe App " +
              "\n\tl.Register a User " +
              "\n\t2.Login a User " + 
               "\n\t3.Quit","CANBAN APP",JOptionPane.INFORMATION_MESSAGE);
               if (checkEmptyNull(userInput))
               {
                   selection = Integer.parseInt(userInput);
                   if ((selection > 0) && (selection < 4))
                   {
                       valid = true; 
                   }
               }
                   if (!valid)
                   {
                       printError("Input has the limit of 1 to 3");
                   }   

         }while (!valid);
         return selection;
    }
    
    public boolean loginuser ()
    {
    boolean valid = false; 
    Scanner input = new Scanner (System .in); 
    String username, password;
    System.out.println("Insert the Username : ");
  
    username = input.next();
     System.out.println("Username sucssefull");
     System.out.println("Insert the user Password:");
    password = input.next(); 
    System.out.println("Pasword sucssefull");
    for (int count = 0; count < numUser; count++ ) 
    {
         if (users[count].getUsername().equals(username))
        {
            if (users[count].getPassword().equals(password))
            {
                valid = true ;
                loggedInUser = count;
                break;
            }
        }
    
    }
    if (valid ) 
    {
        JOptionPane.showMessageDialog(null,
                "welcome"+ users [loggedInUser].getName() + 
                        ", " + users [loggedInUser].getSurname() +
                        " it is great to see you again.",
                         "Login sucess",// peo ,essage 
                         JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
        printError("Username or password incorrect, please try again");
    }
    
    return valid;
    
 }
   
    public void mainThread()
    {
        var selection = 0 ; 
        boolean quit = false ;
        
        do 
        {
            selection = printLoginMenu();
            switch (selection)
            {
                case 1: 
                    registerUser();   
                case 2: 
                   if (loginuser())
                       tASKMenu ();                
                default : 
                    quit = true ;
                                           // System.out.println(" thank you  !!" ) ;
                      
            }
        }while (!quit);
        System.exit(0); 
    }
    //---------------------------END OF TASK 1 CODES----------------------------
    
    //-------------------------START OF TASK 2 CODES----------------------------
    
    public int tASKMenu ()
    {
         int selection =0;
         boolean valid = false; 
         String userInput = ""; 
         do
        {
              userInput = JOptionPane.showInputDialog(
              null,"\tWelcome to easykanban" +
              "\n User Poe App " +
              "\n\tl.Add Task " +
              "\n\t2.Show report " + 
               "\n\t3.Quit","Task adding menu",JOptionPane.INFORMATION_MESSAGE);
              if (checkEmptyNull (userInput))
               {
                   selection = Integer.parseInt (userInput);
                   if ((selection > 0) && (selection < 4))
                   {
                       valid = true; 
                   }
               }
                   if (!valid)
                   {
                      printError("Input has the limit of 1 to 3");
                   }   

         }
         while (!valid);
         return selection;
    }
    
    public void taskThread()
    {
        int selection = 0 ; 
        boolean quit = false ;
        
        do 
        {
            selection = printLoginMenu();
            switch (selection)
            {
                case 1 :   
                         //AddTask(); 
                         break;                      
                case 2 : 
                         //showReport();
                         break; 
                case 3: 
                    quit = true ;                                   
                default : 
                         System.out.println(" thank you  !!" ) ;
                      
            }
        }
        while (!quit);
    }    
    public void showReport ()
    {
        JOptionPane.showMessageDialog(null, "Coming soon!");
    }

    
    public void addTaskMenu ()//apagar 
    {
        String userType = ""; 
        int numTask; 
         userType = JOptionPane.showInputDialog(null, "Please enter the number of "
                 + "task", "Adding Tasks", JOptionPane.QUESTION_MESSAGE);
         if (userType.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Invalid value");
         }
         numTask = Integer.parseInt(userType);
         
         for (int helder = 0; helder < numTask; helder++)
         {
             JOptionPane.showMessageDialog(null, "ADDING " + helder +1 + numTask + " TASKS");
             addTask();
         }
         JOptionPane.showMessageDialog(null, "Task successfully captured");
    }
    
    public void addTask ()
    {
        boolean valid = false;
        Scanner key = new Scanner (System.in);
        
        //---------local variables to add taks and store the details------------
        String tName, tDesc, devCred = "", taskID; 
        int tDuration, tStatus;
        int takeOff = object.getIncrementTaskNumber();
        //---------setting a temporary Task class object-----------------------
         
        System.out.println("--------------------------");
        System.out.print("Enter the Task name: ");
        tName = key.nextLine();
        object.setTaskName(tName);
        
        
        do 
        {
            System.out.print("Enter the Task description: ");
            tDesc = key.nextLine();
            if (object.checkTaskDescription(tDesc))
            {
                valid = true; 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters"," ",
                        JOptionPane.ERROR_MESSAGE);
                
            }
            
            
        }
        while (!valid); 
        object.setTaskDescription(tDesc);
        System.out.print("------------------------------");
        taskID = object.createTaskID(tName, takeOff, devCred);
        System.out.print("Developper details: "); 
        devCred = key.nextLine(); 
        object.setDeveloperDetails(devCred);
        System.out.print("Task Duration: "); 
        tDuration = key.nextInt(); 
        key.nextLine();
        object.setTaskDuration(tDuration);
        
        System.out.println("Select an option for task Status ");
        System.out.print( " 1 to do ;  2 doing ; 3 done" ); 
        valid = false ;
        
        do
        { System.out.println("Status Choice "); 
        tStatus = key.nextInt (); 
         key.nextLine(); 
              
         if ((tStatus < 1 ) || ( tStatus > 3)) 
         {
             JOptionPane.showMessageDialog( null,"input limited form 1 to 3!"); 
         }
         else 
         {
            tStatus--; 
                 valid = true;
                 }
        }
                while (!valid);
        
        object.setTaskStatus(Integer.toString(tStatus));
             
        
        project [takeOff] = object;    
    }
}

  
  

     

