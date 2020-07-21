package GoFDesignPatterns.BehavioralDesignPatterns.Iterator.Example1RadioStations;

public interface ChannelIterator {
    boolean hasNext();

    Channel next();
}
