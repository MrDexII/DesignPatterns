package MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new SMSServiceImpl());
        return app;
    }
}
