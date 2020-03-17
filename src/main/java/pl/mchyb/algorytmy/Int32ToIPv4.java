package pl.mchyb.algorytmy;

public class Int32ToIPv4 {
    public static String longToIP(long ip) {
        return ((ip >> 24) & 0xFF) + "." +

                ((ip >> 16) & 0xFF) + "." +

                ((ip >> 8) & 0xFF) + "." +

                (ip & 0xFF);
    }
}
