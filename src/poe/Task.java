

package poe;
import java.time.LocalTime ;
import javax.swing.JOptionPane;
public class Task
{

    /**
     * @return the incrementTaskNumber
     */
    public static int getIncrementTaskNumber()
    {
        return incrementTaskNumber;
    }

    /**
     * @param aIncrementTaskNumber the incrementTaskNumber to set
     */
    public static void setIncrementTaskNumber(int aIncrementTaskNumber)
    {
        incrementTaskNumber = aIncrementTaskNumber;
    }

    /**
     * @return the taskNumber
     */
    public int getTaskNumber()
    {
        return taskNumber;
    }

    /**
     * @param taskNumber the taskNumber to set
     */
    public void setTaskNumber(int taskNumber)
    {
        this.taskNumber = taskNumber;
    }

    /**
     * @return the taskName
     */
    public String getTaskName()
    {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    /**
     * @return the taskDescription
     */
    public String getTaskDescription()
    {
        return taskDescription;
    }

    /**
     * @param taskDescription the taskDescription to set
     */
    public void setTaskDescription(String taskDescription)
    {
        this.taskDescription = taskDescription;
    }

    /**
     * @return the developerDetails
     */
    public String getDeveloperDetails()
    {
        return developerDetails;
    }

    /**
     * @param developerDetails the developerDetails to set
     */
    public void setDeveloperDetails(String developerDetails)
    {
        this.developerDetails = developerDetails;
    }

    /**
     * @return the taskDuration
     */
    public int getTaskDuration()
    {
        return taskDuration;
    }

    /**
     * @param taskDuration the taskDuration to set
     */
    public void setTaskDuration(int taskDuration)
    {
        this.taskDuration = taskDuration;
    }

    /**
     * @return the taskID
     */
    public String getTaskID()
    {
        return taskID;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(String taskID)
    {
        this.taskID = taskID;
    }

    /**
     * @param taskSelection
     * @return the taskStatus
     */
    public String getTaskStatus(int taskSelection )
    {
        this.taskStatus = STATUS [taskSelection];        
        return taskStatus;
    }

    /**
     * @param taskStatus the taskStatus to set
     */
    public void setTaskStatus(String taskStatus)
    {
        this.taskStatus = taskStatus;
    }
   //-------------POTENTIAL CLASS CONSTANTS--------------------------------------------------------------------------
private final int MAX_DESCRIPTION_LENGTH = 50;
private final String[] STATUS = {"To Do", "Doing", "Done"}; 
//-------------CLASS VARIABLES FOR TASK CLASS---------------------------------------------------
private static int incrementTaskNumber = 1;  // task number variable 
private int taskNumber = 0;  // This value is then assigned from the above static variable incrementTaskNumber
private String taskName = ""; // from the user input
private String taskDescription = ""; // This string may not exceed 50 characters - POE restrictitions 
private String developerDetails = "";  // Derived from user input
private int taskDuration = 0;  // Derived from user input
private String taskID = ""; // auto generated string 
private String taskStatus = "";
private int TotalHours = 0;

//--------------METHODS IN TASK CLASS (Obviously you will also have gets/sets)-------------------------------------
// 
public boolean checkTaskDescription(String taskDesc ) // Password restrictions 
{
    if(taskDesc.length() <= this.MAX_DESCRIPTION_LENGTH)
    {
        System.out.println("Task successfully captured");
    return true ;
    }
    else 
    {
        System.out.println("please enter a task description of less than 50 characters ");
    }
  return false;
} 
public String createTaskID(String taskname, int taskIncr, String devName  )
{
    String tempString = "";

tempString =getTaskName().substring(0, 2); // first 2 characters of the task name 

tempString = tempString + ":" + taskIncr + ":";
tempString = tempString + 
          devName.substring ((devName.length () - 3 )); 
        return tempString.toUpperCase(); 
}
public String printTaskDetails() //
{   
    String retuString = "Task Name: " + this.taskName +
                        "\r\nTask Number : " + this.taskNumber + 
                        "\r\nTask Description : " + this.taskDescription + 
                        "\r\nTask Developer Details : " + this.developerDetails + 
                        "\r\nTask ID : " + this.taskID  + 
                        "\r\nTask Status : " + this.taskStatus; 
    return retuString;
}  
//int returnTotalHours()
}
//-----------------------------SAMPLE JUNIT TESTS NOT COMPLETE (see POE) Just to generate ideas-------------
 
