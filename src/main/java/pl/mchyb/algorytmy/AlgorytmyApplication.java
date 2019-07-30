package pl.mchyb.algorytmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AlgorytmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmyApplication.class, args);
        HighAndLow.HighAndLowNumber("8 3 -5 42 -1 0 0 -9 4 7 4 -4");

    }
}
