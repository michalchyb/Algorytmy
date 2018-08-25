package pl.mchyb.algorytmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AlgorytmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmyApplication.class, args);

        MyMax myMax = new MyMax();
        int[] array = {};
        System.out.println(myMax.findMax(array));

        int[] A = {0, 3, 5, 7};
        int[] B = {0, 0, 1, 4, 9};
        CommonMax commonMax = new CommonMax();
        System.out.println(commonMax.findMinimum(A,B));


    }
}
