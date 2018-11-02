package com.bpawan.hibernate.api;

import com.bpawan.hibernate.dal.entity.Shop;
import com.bpawan.hibernate.dal.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static reactor.core.publisher.Flux.fromIterable;

@Component
public class ShopHandler {

    private ShopRepository shopRepository;

    @Autowired
    public ShopHandler(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public HandlerFunction<ServerResponse> listShops() {
        return request -> ok().body(fromIterable(shopRepository.findAll()), Shop.class);
    }

    public Mono<ServerResponse> addShop(ServerRequest serverRequest) {

        return serverRequest
                .bodyToMono(Shop.class)
                .doOnNext(shopRepository::save)
                .then(ok().body(fromObject("ok")));
    }
}
