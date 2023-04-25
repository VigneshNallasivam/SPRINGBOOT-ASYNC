package com.spring.async.controller;

import com.spring.async.model.Asyncs;
import com.spring.async.response.Response;
import com.spring.async.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AsyncController
{
    @Autowired
    AsyncService service;
    @PostMapping("/post")
    public ResponseEntity<Response>  insert(@RequestBody Asyncs async)
    {
        Asyncs async1 = service.dataInsert(async);
        service.getAllData();
        Response response = new Response("All the Data Were Added to data-base..!!",async1);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
