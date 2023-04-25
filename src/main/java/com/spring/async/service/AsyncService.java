package com.spring.async.service;

import com.spring.async.model.Asyncs;
import com.spring.async.repository.AsyncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsyncService
{
    @Autowired
    AsyncRepository repo;

    public Asyncs dataInsert(Asyncs async)
    {
        return repo.save(async);
    }

    @Async("AsyncExecution")
    public void getAllData()
    {
        try
        {
            System.out.println("Sleep Method Started");
            Thread.sleep(1000);
            System.out.println("Sleep Method Ended");
            List<Asyncs> list = repo.findAll();
            list.forEach(async -> {
                System.out.println("Response Data  " +async.toString());
            });
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
