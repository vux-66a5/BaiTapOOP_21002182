package lab14.designpatterns.command.practice;

class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.shutDown();
    }
}