package GoFDesignPatterns.BehavioralDesignPatterns.Mediator.Example1Chat;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
    }

    @Override
    public void receive(String msg) {
        System.out.print(this.name + ": Received Message:" + msg);
    }
}
