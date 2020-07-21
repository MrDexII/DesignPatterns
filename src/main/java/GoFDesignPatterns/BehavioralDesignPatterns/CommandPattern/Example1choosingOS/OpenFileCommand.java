package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example1choosingOS;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.opeFile();
    }

}
