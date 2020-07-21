package MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1;

public class EmailServiceInjection implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }
}
