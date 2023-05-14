package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.SchoolService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/api")
public class MainController {

    @Autowired
    private SchoolService schoolService;
    
    @GetMapping(path = "/welcome")
    public ResponseEntity<?> welcome(){
        ResponseEntity<?> responseEntity = new ResponseEntity<>("Hello, How are you!", HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping(path = "/add")
    public ResponseEntity<?> add(@RequestParam int a,@RequestParam int b){
        int res = schoolService.addition(a,b);
        ResponseEntity<?> responseEntity = new ResponseEntity<>(res,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping(path = "/getvalues")
    public ResponseEntity<?> getvalues(){
        ResponseEntity<?> responseEntity = new ResponseEntity<>(schoolService.getvalue(),HttpStatus.OK);
        return responseEntity;
    }


}
