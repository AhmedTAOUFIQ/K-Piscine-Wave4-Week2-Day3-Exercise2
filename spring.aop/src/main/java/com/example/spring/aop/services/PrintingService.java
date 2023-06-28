package com.example.spring.aop.services;

import com.example.spring.aop.annotations.TimeIt;
import org.springframework.stereotype.Service;

@Service
public class PrintingService {
    public PrintingService() {
    }
    @TimeIt
    public void print(){
        int sum =0;
        for(int i=0; i<120;i++){
            sum+=i;
        }
        System.out.println("The sum is :" + sum );
    }
}
