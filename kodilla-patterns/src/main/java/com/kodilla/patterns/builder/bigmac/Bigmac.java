package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.options.Bun;
import com.kodilla.patterns.builder.bigmac.options.Ingredients;
import com.kodilla.patterns.builder.bigmac.options.Sauce;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private Bun bun;
    private int burgers;
    private Sauce sauce;
    private List<Ingredients> ingredients;

    private Bigmac(final Bun bun, final int burgers, final Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "\nBigmac{" +
                "\nbun=" + bun +
                "\nburgers=" + burgers +
                "\nsauce=" + sauce +
                "\ningredients=" + ingredients +
                "}\n";
    }
}
