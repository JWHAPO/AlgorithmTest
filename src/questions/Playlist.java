package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * AlgorithmTest
 * Class: Playlist
 * Created by hapo on 2019-02-27.
 * Description:
 * A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist. Otherwise, the playlist will end with the last song which points to null.
 *
 * Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.
 *
 * For example, the following code prints "true" as both songs point to each other.
 * ----------------------------------------
 * Song first = new Song("Hello");
 * Song second = new Song("Eye of the tiger");
 *
 * first.setNextSong(second);
 * second.setNextSong(first);
 *
 * System.out.println(first.isRepeatingPlaylist());
 * ------------------------------------------
 */
public class Playlist {
    public static class Song {
        private String name;
        private Song nextSong;

        public Song(String name) {
            this.name = name;
        }

        public void setNextSong(Song nextSong) {
            this.nextSong = nextSong;
        }

        public boolean isRepeatingPlaylist() {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}