package com.bnp.speedcheck.services;

import com.bnp.speedcheck.models.ResponseDTO;
import java.util.Optional;

public class SpeedCheckService implements ISpeedCheckService{

    @Override
    public Optional<ResponseDTO> getClientTargets(boolean https, String token, int urlCount) {
        ResponseDTO response = null;

        // I am not sure how the response generated logically
        // The business logic should be implemented here

        return Optional.of(response);
    }
}