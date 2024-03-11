package com.example.serverstubs.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record TransferCashOrderReqDto(
        String transferType,
        UUID customerId,
        UUID remitterAccountNumber,
        UUID payeeAccountNumber,
        BigDecimal transferAmount,
        BigDecimal transferFee,
        BigDecimal amountWithCommission,
        String bic,
        String currency,
        Boolean isFavorite
) {
}
