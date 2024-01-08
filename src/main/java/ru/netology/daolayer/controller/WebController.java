package ru.netology.daolayer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.daolayer.repository.JdbcRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class WebController {
    private final JdbcRepository jdbcRepository;

    public WebController(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @RequestMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return jdbcRepository.getProductName(name);
    }
}
