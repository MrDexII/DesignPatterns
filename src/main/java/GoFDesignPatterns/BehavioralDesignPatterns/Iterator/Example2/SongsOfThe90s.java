package GoFDesignPatterns.BehavioralDesignPatterns.Iterator.Example2;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
    //Create a Hashtable with an int as a key and SongInfo
    //Objects
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();

    //Will increment the Hashtable key
    int hashKey = 0;

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    //Add a SongInfo object to the Hashtable and increment the Hashtable key
    private void addSong(String songName, String bandName, int yerReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yerReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    // Bad implementation
    /*public Hashtable<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }*/

    //New by adding this method I'll be able to treat all
    //collections the same
    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
