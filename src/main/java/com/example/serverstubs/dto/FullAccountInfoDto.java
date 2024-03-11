package com.example.serverstubs.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record FullAccountInfoDto(
        UUID id,
        UUID customerId,
        String openDate,
        String currency,
        String accountName,
        String accountNumber,
        BigDecimal balance,
        String status,
        BigDecimal blockedCash,
        Boolean isMain,
        Long contractNumber,
        String type
) {
}
