package com.demo.restclient.payload;

/**
 * @author Fellipe Toledo
 */
public record PostRequest(
        Integer userId,
        Integer id,
        String title,
        String body){}
