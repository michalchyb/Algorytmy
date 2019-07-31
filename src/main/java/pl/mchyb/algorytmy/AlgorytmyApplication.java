package pl.mchyb.algorytmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorytmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmyApplication.class, args);

        System.out.println(new Dubstep().SongDecoder("WUBWUBABCWUB"));
        System.out.println(new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));

    }
}
