package GoFDesignPatterns.BehavioralDesignPatterns.Mediator.Example1Chat;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
