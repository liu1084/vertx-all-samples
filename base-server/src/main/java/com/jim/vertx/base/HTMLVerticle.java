package com.jim.vertx.base;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Author: Jim
 * Date: 2018/9/7:下午4:33
 * Description:
 */

public class HTMLVerticle extends AbstractVerticle {
    public static final int PORT = 8081;
    @Override
    public void start(Future<Void> startFuture) throws Exception {
        vertx.createHttpServer()
                .requestHandler(r -> {
                    r.response().end("<h1>Hello World</h1>");
                })
                .listen(config().getInteger("http.port", PORT), result -> {
                    if (result.succeeded()) {

                        startFuture.complete();
                    } else {
                        startFuture.fail(result.cause());
                    }
                });
    }
}
