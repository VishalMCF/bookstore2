package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        BookDto book = BookDto.builder()
                .title("My friend a bull")
                .build();
        List<BookDto> books = new ArrayList<>();
        books.add(book);
        return ResponseEntity.ok().body(books);
    }

}

