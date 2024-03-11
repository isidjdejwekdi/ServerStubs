package com.example.serverstubs.controller;

import com.example.serverstubs.dto.TransferCashOrderReqDto;
import com.example.serverstubs.dto.TransferCashOrderRespDto;
import com.example.serverstubs.dto.TransferTypeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/transfers")
public class TransferController {

    @PostMapping
    public TransferCashOrderRespDto getTransferResult(TransferCashOrderReqDto transferCashOrderReqDto){

        log.info("POST request");

        return new TransferCashOrderRespDto(
                UUID.randomUUID(),
                BigDecimal.ONE,
                "IN_PROGRESS",
                 "today",
                "noew",
                "transfer done",
                "timestamp of now"
        );
    }

    @GetMapping("/transfer-type")
    public TransferTypeDto getTransferType(){
        log.info("GET requset");
        return new TransferTypeDto("type1", "RUB", "10");
    }
}
