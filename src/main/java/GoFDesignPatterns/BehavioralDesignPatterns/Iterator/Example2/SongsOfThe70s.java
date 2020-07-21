package GoFDesignPatterns.BehavioralDesignPatterns.Iterator.Example2;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    //ArrayList holds SongInfo objects
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    //Add a SongInfo object to the end of the ArrayList
    private void addSong(String songName, String bandName, int yerReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yerReleased);
        bestSongs.add(songInfo);
    }
    // Bad implementation
    //Return the ArrayList filled with SongInfo Objects
    /*public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }*/

    //New by adding this method i'll be able to treat all
    //collections the same

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
