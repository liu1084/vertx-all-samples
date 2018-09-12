package com.jim.vertx.base;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import static com.jim.vertx.base.HTMLVerticle.PORT;

/**
 * Author: Jim
 * Date: 2018/9/7:下午4:47
 * Description:
 */

@RunWith(VertxUnitRunner.class)
public class HTMLVerticleTest {

    private Vertx vertx;

    @Before
    public void setUp(TestContext context) throws Exception {
        vertx = Vertx.vertx();
        vertx.deployVerticle(HTMLVerticle.class.getName(), context.asyncAssertSuccess());
    }

    @After
    public void tearDown(TestContext context) {
        vertx.close(context.asyncAssertSuccess());
    }

    @Test
    public void testApp(TestContext context) {
        final Async async = context.async();
        vertx.createHttpClient().getNow(PORT, "localhost", "/", response -> {
           response.handler(body -> {
               context.assertTrue(body.toString().contains("Hello"));
               async.complete();
           });
        });
    }
}
