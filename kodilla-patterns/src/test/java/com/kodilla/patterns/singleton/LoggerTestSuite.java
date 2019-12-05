package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        Logger.getInstance().log("Last log");

        String lastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals(lastLog, "Last log");
    }
}
