package pl.mchyb.algorytmy;

public class Dubstep {
    public static String SongDecoder(String song) {

        return song.replaceAll("(WUB)+"," ").trim();
    }
}
