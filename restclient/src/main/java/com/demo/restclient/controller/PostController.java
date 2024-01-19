package com.demo.restclient.controller;

import com.demo.restclient.payload.PostRequest;
import com.demo.restclient.service.PostService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Fellipe Toledo
 */
@RestController
@RequestMapping("/api/v1/post")
@AllArgsConstructor
public class PostController {

    public final PostService postService;

    @GetMapping("/all")
    List<PostRequest> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    PostRequest findById(@PathVariable Integer id) {
        return postService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PostRequest create(@RequestBody PostRequest post) {
        return postService.create(post);
    }

    @PutMapping("/{id}")
    PostRequest update(@PathVariable Integer id, @RequestBody PostRequest post) {
        return postService.update(id, post);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Integer id) {
        postService.delete(id);
    }

}
