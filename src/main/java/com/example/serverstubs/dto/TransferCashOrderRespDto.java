package com.example.serverstubs.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record TransferCashOrderRespDto(
        UUID id,
        BigDecimal rnn,
        String status,
        String createdAt,
        String completedAt,
        String message,
        String timestamp
) {
}
