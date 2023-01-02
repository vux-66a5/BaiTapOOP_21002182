package lab14.designpatterns.command.practice;

import java.util.Scanner;
public class TestCommand {
   public static void main(String[] args){
      Computer computer = new Computer();
      Command shutdown = new ShutDownCommand(computer);
      Command restart = new RestartCommand(computer);

      Switch s = new Switch();

      Scanner scan = new Scanner(System.in);

//      String str = "shutdown"; //get value based on real situation
      while (true) {
         String command = scan.nextLine();

         if (command.equals("shutdown")) {
            s.storeAndExecute(shutdown);
         } else if (command.equals("restart")) {
            s.storeAndExecute(restart);
         } else {
            System.out.println("Command not found !");
            System.out.println();
            System.out.println("List used command: ");
            break;

         }
      }
      for( Command x : s.history ) {
         System.out.println(x.getClass().getSimpleName());
      }
   }
}