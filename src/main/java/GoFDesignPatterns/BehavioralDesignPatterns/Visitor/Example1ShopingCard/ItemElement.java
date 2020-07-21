package GoFDesignPatterns.BehavioralDesignPatterns.Visitor.Example1ShopingCard;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
