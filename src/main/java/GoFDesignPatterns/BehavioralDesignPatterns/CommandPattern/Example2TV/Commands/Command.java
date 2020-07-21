package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example2TV.Commands;

//Each command you want to issue will implement the CommandPattern interface
public interface Command {

    void execute();

    //You may want to offer the option to undo a command
    void undo();

}
