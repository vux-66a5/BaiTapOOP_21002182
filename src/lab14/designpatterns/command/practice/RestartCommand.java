package lab14.designpatterns.command.practice;

class RestartCommand implements Command {
   private Computer computer;
 
   public RestartCommand(Computer computer) {
      this.computer = computer;
   }
 
   public void execute() {
      computer.restart();
   }
}