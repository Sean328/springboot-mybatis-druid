package com.sean.springbootspringdataelasticsearch.book.service;

import com.sean.springbootspringdataelasticsearch.book.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by sean on 2017/11/13.
 *
 * @author sean
 * @desc
 * @date 2017/11/13 17:36.
 */
public interface BookService {

	Book save(Book book);

	void delete(Book book);

	Book findOne(String id);

	Iterable<Book> findAll();

	Page<Book> findByAuthor(String author, PageRequest pageRequest);

	List<Book> findByTitle(String title);

}