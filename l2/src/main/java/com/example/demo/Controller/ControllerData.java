package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.Document;

@RestController
@RequestMapping("/connect")
public class ControllerData {
//    @PostMapping("/adddata")
//    public void adddata(@RequestBody Object mobile){
//        String str="http://localhost:8032/accessdata/addtodata";
//        RestTemplate restTemplate=new RestTemplate();
//        restTemplate.postForObject(str,mobile,String);
//    }

    @PostMapping("/getdata")
    public String getdata(@RequestBody String mobile){
        String str="http://localhost:8032/accessdata/gettodata";
        RestTemplate restTemplate=new RestTemplate();
        String ans=restTemplate.postForObject(str,mobile,String.class);
        return ans;
    }

//    @PutMapping("/users/{id}")
//    public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody String mobile) {
//
//        String str="http://localhost:8032/accessdata/gettodata";
//        userService.updateUserById(id, mobile);  // finds the user with the provided id and update it
//
//        return new ResponseEntity<>("User updated.", HttpStatus.OK);
//    }

}
