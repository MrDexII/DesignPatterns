package GoFDesignPatterns.BehavioralDesignPatterns.Mediator.Example2Stock;

public class JTPoorman extends Colleague {

    public JTPoorman(Mediator mediator) {
        super(mediator);

        System.out.println("JT Poorman signed up with the stock exchange\n");
    }
}
