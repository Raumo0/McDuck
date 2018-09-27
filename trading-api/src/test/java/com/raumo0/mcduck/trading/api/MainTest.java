package com.raumo0.mcduck.trading.api;

import com.raumo0.mcduck.trading.api.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMessage() throws IOException, ParseException {
        Assert.assertEquals(Main.getMessage(), "Hello from trading-api!");
    }
}