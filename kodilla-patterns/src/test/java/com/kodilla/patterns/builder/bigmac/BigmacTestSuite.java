package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.options.Bun;
import com.kodilla.patterns.builder.bigmac.options.Ingredients;
import com.kodilla.patterns.builder.bigmac.options.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testCreatingBigmac() {
        Bigmac testBigmac = new Bigmac.BigmacBuilder()
                .burgers(0)
                .bun(Bun.WITH_SESAME)
                .ingredient(Ingredients.CHEESE)
                .sauce(Sauce.BARBECUE)
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.MUSHROOMS)
                .ingredient(Ingredients.CHILLI_PEPPER)
                .build();
        System.out.println(testBigmac);

        int expectedIngredientsNumber = 5;
        int expectedBurgersNumber = 0;
        Sauce expectedSauce = Sauce.BARBECUE;

        Assert.assertEquals(expectedIngredientsNumber, testBigmac.getIngredients().size());
        Assert.assertEquals(expectedBurgersNumber, testBigmac.getBurgers());
        Assert.assertEquals(expectedSauce, testBigmac.getSauce());
    }
}