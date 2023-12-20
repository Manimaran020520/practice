package com.example.AddressDummy.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DummyResponse {
    private String message;
    private Address address;

}
