package pl.mchyb.algorytmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;


@SpringBootApplication
public class AlgorytmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmyApplication.class, args);

        ArrayToBinar.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1)));
        ArrayToBinar.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1)));
        ArrayToBinar.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0)));
        ArrayToBinar.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1)));


    }
}
