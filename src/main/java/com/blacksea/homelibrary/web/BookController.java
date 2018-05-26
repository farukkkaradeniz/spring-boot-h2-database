package com.blacksea.homelibrary.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blacksea.homelibrary.domain.BookModal;
import com.blacksea.homelibrary.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping()
	public List<BookModal> getAll() {
		return this.bookService.findAll();
	}
	
	@GetMapping("/save/{bookName}")
	public BookModal saveBook(@PathVariable String bookName) {
		return this.bookService.saveBookModal(bookName);
	}
	
}
