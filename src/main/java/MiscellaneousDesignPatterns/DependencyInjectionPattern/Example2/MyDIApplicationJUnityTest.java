package MiscellaneousDesignPatterns.DependencyInjectionPattern.Example2;

import MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1.Consumer;
import MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1.MessageService;
import MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1.MessageServiceInjector;
import MiscellaneousDesignPatterns.DependencyInjectionPattern.Example1.MyDIApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJUnityTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        //mock the injector with anonymous class
        /*injector = () -> {
            //mock the message service
            return new MyDIApplication(() -> System.out.println("Mock Message Service implementation"));
        };*/
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
