package com.jim.vertx.base;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

/**
 * Author: Jim
 * Date: 2018/9/7:下午8:34
 * Description:
 */

public class WebVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Router router = Router.router(vertx);
        router.route("/")
                .handler(routingContext -> {
                    HttpServerResponse response = routingContext.response();
                    response.putHeader("Content-Type", "text/html")
                            .end("<h1>Hello</h1>");
                });

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(config().getInteger("http.port", 8080), result -> {
                    if (result.succeeded()){
                        startFuture.complete();
                    }else{
                        startFuture.fail(result.cause());
                    }
                });
    }
}
