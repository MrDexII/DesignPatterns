package GoFDesignPatterns.StructuralDesignPatterns.Composite.CompositeExample2;

public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrialMusic =
                new SongGroup("Industrial",
                        "is a genre of experimental music which draws on harsh, transgressive or provocative sounds and themes");
        SongComponent heavyMetalMusic =
                new SongGroup("\nHeavy Metal",
                        "is a genre of rock music that developed in the late 1960s and early 1970s, largely in the United Kingdom");
        SongComponent dubstepMusic =
                new SongGroup("\nDubstep",
                        " is a genre of electronic dance music that originated in South London in the late 1990s");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();
    }
}
