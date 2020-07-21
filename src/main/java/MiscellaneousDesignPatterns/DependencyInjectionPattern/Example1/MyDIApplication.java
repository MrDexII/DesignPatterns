package MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1;

public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication() {
    }

    //setter dependency injection
    public void setService(MessageService service) {
        this.service = service;
    }

    /*public MyDIApplication(MessageService service) {
        this.service = service;
    }*/

    @Override
    public void processMessages(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
