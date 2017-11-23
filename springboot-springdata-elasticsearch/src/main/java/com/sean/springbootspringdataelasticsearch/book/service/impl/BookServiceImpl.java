package com.sean.springbootspringdataelasticsearch.book.service.impl;

import com.sean.springbootspringdataelasticsearch.book.model.Book;
import com.sean.springbootspringdataelasticsearch.book.repository.BookRepository;
import com.sean.springbootspringdataelasticsearch.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sean on 2017/11/13.
 *
 * @author sean
 * @desc
 * @date 2017/11/13 17:37.
 */
@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public Book findOne(String id) {
		return bookRepository.findOne(id);
	}

	@Override
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
		return bookRepository.findByAuthor(author, pageRequest);
	}

	@Override
	public List<Book> findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

}