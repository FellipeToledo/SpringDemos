package com.demo.restclient.client;

import com.demo.restclient.payload.PostRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

/**
 * @author Fellipe Toledo
 */
public interface JsonPlaceholderService {
    @GetExchange("/posts")
    List<PostRequest> findAll();

    @GetExchange("/posts/{id}")
    PostRequest findById(Integer id);

    @PostExchange("/posts")
    PostRequest create(PostRequest post);

    @PutExchange("/posts/{id}")
    PostRequest update(@PathVariable Integer id, PostRequest post);

    @DeleteMapping("/posts/{id}")
    void delete(@PathVariable Integer id);

}
