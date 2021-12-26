package com.bnp.speedcheck.services;

import com.bnp.speedcheck.models.ResponseDTO;

import java.util.Optional;

public interface ISpeedCheckService {

    Optional<ResponseDTO> getClientTargets(boolean https, String token, int urlCount);
}
