package com.bnp.speedcheck.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String asn;
    private String ip;
    private String isp;
    private Location location;
}
