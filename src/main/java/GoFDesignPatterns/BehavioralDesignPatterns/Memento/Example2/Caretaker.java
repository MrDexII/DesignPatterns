package GoFDesignPatterns.BehavioralDesignPatterns.Memento.Example2;

import java.util.ArrayList;

//Memento Design Pattern
public class Caretaker {
    //Where all memento are saved
    ArrayList<Memento> savedArticles = new ArrayList<>();

    //Adds memento to the ArrayList
    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    //Gets the memento requested from the ArrayList
    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
