package com.example.serverstubs.controller;

import com.example.serverstubs.dto.AccountChangeStatusReqDto;
import com.example.serverstubs.dto.AccountChangeStatusRespDto;
import com.example.serverstubs.dto.FullAccountInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("/account-service/api/v1")
public class AccountController {

    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<FullAccountInfoDto> getFullAccountInfo(
            @PathVariable String accountId
    ) {
        var info = new FullAccountInfoDto(UUID.randomUUID(),
                UUID.randomUUID(),
                "openDate",
                "RUB",
                "accountName",
                "accountNumber",
                BigDecimal.valueOf(10_000),
                "statusOPEN",
                BigDecimal.ZERO,
                true,
                123L,
                "MAIN");

        return ResponseEntity.ok(info);
    }

    @PatchMapping("/accounts/{accountId}")
    public AccountChangeStatusRespDto changeStatus (AccountChangeStatusReqDto request){
        return new AccountChangeStatusRespDto("CLOSED", "timestamp_now");
    }


}
