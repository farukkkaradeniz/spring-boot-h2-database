package com.blacksea.homelibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blacksea.homelibrary.domain.BookModal;
import com.blacksea.homelibrary.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<BookModal> findAll() {
		return this.bookRepository.findAll();
	}
	
	public BookModal save(BookModal modal) {
		return this.save(modal);
	}
	
	public BookModal saveBookModal(String bookName) {
		BookModal modal = new BookModal();
		modal.setBookName(bookName);
		return this.bookRepository.save(modal);
	}
	
	public BookModal findOneByBookName(String bookName) {
		return this.bookRepository.findOneByBookName(bookName);
	}

}
