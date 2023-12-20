package com.example.AddressDummy.FeignClient;

import com.example.AddressDummy.Response.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="BLOOD-DONOR-APPLICATION",url = "http://localhost:8181")
public interface AddressClient {
    @GetMapping("/DummyCheck")
    public ResponseEntity<Address> getDummyCheck(@RequestParam int id);

}
