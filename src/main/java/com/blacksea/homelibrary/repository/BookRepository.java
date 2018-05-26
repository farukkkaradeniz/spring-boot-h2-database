package com.blacksea.homelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blacksea.homelibrary.domain.BookModal;

public interface BookRepository extends JpaRepository<BookModal, Long>{
    BookModal findOneByBookName(String bookName);
}
