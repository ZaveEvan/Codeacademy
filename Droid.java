public class Droid{

  int batteryLevel;
  String name;

  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }

  public String toString(){
    return name;
  }

  public void performTask(String task){
    System.out.println(name + " is performing the task: " + task);
    batteryLevel -= 10;
  }

  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println("Hello, I'm the droid: " + codey);
    codey.performTask("dancing");
    codey.performTask("cooking");
    codey.performTask("studying");
    codey.performTask("running");

  }
}