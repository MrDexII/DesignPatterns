package GoFDesignPatterns.BehavioralDesignPatterns.Visitor.Example1ShopingCard;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
