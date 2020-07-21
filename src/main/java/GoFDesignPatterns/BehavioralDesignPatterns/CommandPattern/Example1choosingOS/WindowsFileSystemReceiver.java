package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example1choosingOS;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void opeFile() {
        System.out.println("Open file in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Windows");
    }
}
