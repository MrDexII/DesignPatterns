package GoFDesignPatterns.BehavioralDesignPatterns.Memento.Example2;

public class Originator {
    private String article;

    //Sets the value for the article
    public void set(String newArticle) {
        System.out.println("From Originator: Current Version of Article\n" + newArticle + "\n");
        this.article = newArticle;
    }

    //Creates a new Memento with a new article
    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    //Get the article current stored in memento
    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArtivle();
        System.out.println("From Originator: Previous Article Saved in Memento\n" + article + "\n");
        return article;
    }
}
