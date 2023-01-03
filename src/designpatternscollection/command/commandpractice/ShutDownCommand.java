package designpatternscollection.command.commandpractice;

class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.shutDown();
    }
}