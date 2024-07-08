package com.jinho.springboot.learnspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    CurrencyServiceConfiguration config;

    public CurrencyConfigurationController(CurrencyServiceConfiguration config) {
        this.config = config;
    }

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfig() {
        return config;
    }

}
