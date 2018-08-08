package com.raumo0.mcduck.analytical.engine;

import com.raumo0.mcduck.analytical.engine.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMessage() {
        Assert.assertEquals(Main.getMessage(), "Hello from analytical-engine!");
    }
}