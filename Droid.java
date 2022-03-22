public class Droid{
   
    String name;
    int batteryLevel;
  
    //constructor
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    // to string method
    public String toString(){
      return "Droid name: " + name;
    }
  
    //performTask
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel = batteryLevel - 10;
      System.out.println(name + "'s batteryLevel is " + batteryLevel);
  
    }
    
    //main method
    public static void main(String[] args){
      Droid C3P0 = new Droid("C3P0");
      System.out.println(C3P0); 
  
      C3P0.performTask("Process Data");
      C3P0.performTask("System Reboot");
      C3P0.performTask("Assist Jedi training");
      C3P0.performTask("Find R2D2");
      C3P0.performTask("Analyze landscape");
      C3P0.performTask("Sweep floor");
      C3P0.performTask("Take over earth");

    }
  
  }
