package designpatternscollection.command.commandpractice;

import java.util.ArrayList;
import java.util.List;

class Switch {
   public List<Command> history = new ArrayList<Command>();
   public Switch() {}
   public void storeAndExecute(Command command) {
      this.history.add(command);
      command.execute();        
   }
}