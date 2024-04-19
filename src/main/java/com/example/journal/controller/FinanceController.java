package com.example.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class FinanceController {

    @GetMapping("/finance")
    public String Finance(){

        return "app/finance";
    }

    @GetMapping("/new_finance")
    public String NewFinance(){

        return "app/new_finance";
    }

}
