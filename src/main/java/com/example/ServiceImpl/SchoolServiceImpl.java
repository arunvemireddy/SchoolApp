package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.Service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Value("${app.value}")
    private int val;

    @Override
    public int addition(int a, int b) {
       return a+b;
    }

    @Override
    public int getvalue() {
        return val;
    }
    
}
