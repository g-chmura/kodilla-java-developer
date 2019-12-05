package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void TestDisplayAdd() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 0.50;

        double actual = calculator.add(0.00, 0.50);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void TestDisplaySub() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = -0.50;

        double actual = calculator.sub(0.00, 0.50);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void TestDisplayMul() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 0.00;

        double actual = calculator.mul(0.00, 0.50);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void TestDisplayDiv() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 1.00;

        double actual = calculator.div(0.50, 0.50);

        Assert.assertEquals(expected, actual, 0.1);
    }

}
