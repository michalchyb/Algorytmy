package pl.mchyb.algorytmy.patterns.decorator;

import java.math.BigDecimal;

public class PizzaWithMozarella extends Pizza {
    private static final BigDecimal MOZARELLA_PIZZA_PRICE = new BigDecimal(5);

    private final Pizza pizza;

    public PizzaWithMozarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice().add(MOZARELLA_PIZZA_PRICE);
    }

}
