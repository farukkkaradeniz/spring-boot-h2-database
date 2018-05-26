package com.blacksea.homelibrary;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.blacksea.homelibrary.domain.BookModal;
import com.blacksea.homelibrary.repository.BookRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class HomeLibraryTest {

	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void checkBookName() {
		BookModal modal = new BookModal();
		modal.setBookName("KAYI");
		this.bookRepository.save(modal);
		assertThat(this.bookRepository.findOneByBookName("KAYI").getBookName()).isEqualTo(modal.getBookName());
	}

}
