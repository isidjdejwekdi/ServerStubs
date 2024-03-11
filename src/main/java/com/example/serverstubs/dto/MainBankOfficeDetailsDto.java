package com.example.serverstubs.dto;

public record MainBankOfficeDetailsDto(
        String organizationType,
        String name,
        String corporateAccount,
        String swift,
        String bik,
        int bin,
        String inn,
        int kpp,
        String okpo,
        String ogrn,
        int postalCode,
        String city,
        String street,
        String building
) {
}
