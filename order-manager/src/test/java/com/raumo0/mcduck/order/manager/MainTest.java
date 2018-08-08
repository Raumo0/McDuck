package com.raumo0.mcduck.order.manager;

import com.raumo0.mcduck.order.manager.Main;
import org.junit.Assert;

public class MainTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getMessage() {
        Assert.assertEquals(Main.getMessage(), "Hello from order-manager!");
    }
}