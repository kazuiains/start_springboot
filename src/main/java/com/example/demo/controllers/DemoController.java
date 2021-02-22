package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController // annotation untuk mendeklarasikan bahwa class ini controller
public class DemoController {

    @RequestMapping("/") // annotation untuk mendeklarasikan rute atau mapping
    public String index() {
        return "ohayou sekai good morning world";
    }
    // seperti layaknya java di android ini merupakan untuk membalikan nilai.

    @RequestMapping("data")
    public String data() {
        return "ini adalah data ya!!1";
    }

    @PostMapping("post")
    public String thisPost() {
        return "ini post";
    }

    @GetMapping("get")
    public String thisGet() {
        return "ini get";
    }

    @PutMapping("put")
    public String thisPut() {
        return "ini put";
    }

    @DeleteMapping("delete")
    public String thisDelete() {
        return "ini delete";
    }

//    RequestMapping untuk mendapatkan semua macam method. jika ingin spesifik silahkan tulis "Method yang diinginkan"+mapping.
//    contohnya PutMapping
}
