package MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("SMS sent to " + rec + " with Message = " + msg);
    }
}
