package com.bnp.speedcheck.controllers;

import com.bnp.speedcheck.exceptions.ResourceNotFoundException;
import com.bnp.speedcheck.models.ResponseDTO;
import com.bnp.speedcheck.services.ISpeedCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class SpeedCheckController {

    private final ISpeedCheckService service;

    @Autowired
    public SpeedCheckController(ISpeedCheckService service) {
        this.service = service;
    }

    @GetMapping(path = "/speedtest/v2", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseDTO getClientTargets(
            @RequestParam(value = "https", defaultValue = "true") boolean https,
            @RequestParam String token,
            @RequestParam(value = "urlCount", defaultValue = "5") int urlCount) {
        return service.getClientTargets(https, token, urlCount)
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found."));
    }
}