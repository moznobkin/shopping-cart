package com.beeline.oms.shoppingcart.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import com.beeline.oms.shoppingcart.model.ShoppingCart;

public interface ShoppingCartRepository extends CouchbaseRepository<ShoppingCart, String> {

}

