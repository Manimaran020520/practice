package com.example.AddressDummy.Response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private int id;
    private String city;
    private String district;
    private String state;
    private String country;
    private String countrycode;
}
