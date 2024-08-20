package com.example.ProductService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping("/hello/")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name){
        return "Hello " + name;
    }
    @GetMapping("/seat/{SeatName}/show/{ShowName}")
    public String ShowInformation(@PathVariable("SeatName") String Seat, @PathVariable("ShowName") String Show){
        return "Show name : "+Show+", Seat name :"+Seat;
    }

}
