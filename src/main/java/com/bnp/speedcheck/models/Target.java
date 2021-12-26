package com.bnp.speedcheck.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Target {
    private String name;
    private String url;
    private Location location;
}
