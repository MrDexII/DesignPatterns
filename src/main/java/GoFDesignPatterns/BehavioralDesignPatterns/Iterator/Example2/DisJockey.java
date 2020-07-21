package GoFDesignPatterns.BehavioralDesignPatterns.Iterator.Example2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DisJockey {

    /*SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;*/

    //New passing in song iterator
    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    //Bad way
    /*public DisJockey(SongsOfThe70s songs70s, SongsOfThe80s songs80s, SongsOfThe90s songs90s) {
        this.songs70s = songs70s;
        this.songs80s = songs80s;
        this.songs90s = songs90s;
    }*/

    //New way Initialize the iterator

    public DisJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    /*public void showTheSongs() {
        //Because the SongInfo Objects are stored in different
        //collections everything must be handle on an individual
        //basis. This is bad!
        ArrayList aL70SSongs = songs70s.getBestSongs();
        System.out.println("Songs of the 70s\n");
        for (int i = 0; i < aL70SSongs.size(); i++) {
            SongInfo bestSongs = (SongInfo) aL70SSongs.get(i);

            System.out.print(bestSongs.getSongName() + " ");
            System.out.print(bestSongs.getBandName() + " ");
            System.out.print(bestSongs.getYearReleased() + "\n");
        }

        SongInfo[] array80sSongs = songs80s.getBestSongs();
        System.out.println("Songs of the 80s\n");
        for (int j = 0; j < array80sSongs.length; j++) {
            SongInfo bestSongs = array80sSongs[j];

            System.out.print(bestSongs.getSongName() + " ");
            System.out.print(bestSongs.getBandName() + " ");
            System.out.print(bestSongs.getYearReleased() + "\n");
        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
        System.out.println("Songs of the 90s\n");
        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements(); ) {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.print(bestSongs.getSongName() + " ");
            System.out.print(bestSongs.getBandName() + " ");
            System.out.print(bestSongs.getYearReleased() + "\n");
        }
    }*/

    //Now that i can treat everything as an Iterator it cleans up
    //the code while allowing me to treat all collections as 1
    public void showTheSongs2() {
        System.out.println("NEW WAY WITH ITERATOR\n");

        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s);
    }

    private void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.print(songInfo.getSongName() + " ");
            System.out.print(songInfo.getBandName() + " ");
            System.out.print(songInfo.getYearReleased() + "\n");
        }
    }
}
