package com.example.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DocumentsController {

    @GetMapping("/document")
    public String Document(){

        return "app/documents";
    }

    @GetMapping("/document_reg")
    public String DocumentReg(){

        return "app/documents_reg";
    }

}
