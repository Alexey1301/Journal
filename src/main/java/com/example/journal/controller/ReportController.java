package com.example.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ReportController {

    @GetMapping("/report")
    public String Report() {

        return "app/report";
    }
}
