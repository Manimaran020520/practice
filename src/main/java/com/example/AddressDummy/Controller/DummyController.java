package com.example.AddressDummy.Controller;


import com.example.AddressDummy.FeignClient.AddressClient;
import com.example.AddressDummy.Response.Address;
import com.example.AddressDummy.Response.DummyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DummyController {
    @Autowired
    private AddressClient addressClient;
    @GetMapping("/answer")
    public ResponseEntity<DummyResponse> getData(@RequestParam int id){
        DummyResponse dummyResponse=new DummyResponse();
        dummyResponse.setMessage("Dummy class");
        ResponseEntity<Address> response=addressClient.getDummyCheck(id);
        dummyResponse.setAddress(response.getBody());
        return new ResponseEntity<>(dummyResponse, HttpStatus.OK);
    }
}
