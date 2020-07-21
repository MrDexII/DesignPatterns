package GoFDesignPatterns.BehavioralDesignPatterns.Iterator.Example1RadioStations;

public interface ChannelCollection {

    void addChannel(Channel c);
    void removeChannel(Channel c);
    ChannelIterator iterator(ChannelTypeEnum type);
}
