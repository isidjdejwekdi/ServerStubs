package com.example.serverstubs.dto;

public record TransferTypeDto(
        String typeName,
        String currencyCode,
        String transferFee
) {
}
