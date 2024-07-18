package com.paginationandsorting.pagination.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paginationandsorting.pagination.entity.Product;
import com.paginationandsorting.pagination.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<Product> getAllProducts(@PageableDefault(size = 10, sort = "price", direction = org.springframework.data.domain.Sort.Direction.ASC) Pageable pageable) {
        return productService.getAllProducts(pageable);
    }
}