package GoFDesignPatterns.BehavioralDesignPatterns.CommandPattern.Example1choosingOS;

public class UnixFileSystemReceiver implements FileSystemReceiver {


    @Override
    public void opeFile() {
        System.out.println("Open file in unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in unix OS");
    }
}
