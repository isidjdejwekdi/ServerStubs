package com.example.serverstubs.controller;

import com.example.serverstubs.dto.MainBankOfficeDetailsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abs")
public class AbsInfoController {

    @GetMapping("/bank-offices/main/details")
    MainBankOfficeDetailsDto getMainBankOfficeDetailsDto() {
        return new MainBankOfficeDetailsDto(
                "АО",
                "ЛИБЕРТИ БАНК",
                "30202010200000000891",
                "LIBBRUMM007",
                "044527713",
                527713,
                "7782188977",
                770801077,
                "09610477",
                "1027700057413",
                125009,
                "Москва",
                "Никитский переулок",
                "3"
        );
    }
}
