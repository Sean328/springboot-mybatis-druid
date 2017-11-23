package com.sean.springbootspringdataelasticsearch.book.repository;

import com.sean.springbootspringdataelasticsearch.book.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by sean on 2017/11/13.
 *
 * @author sean
 * @desc
 * @date 2017/11/13 17:35.
 */

public interface BookRepository extends ElasticsearchRepository<Book, String> {

	Page<Book> findByAuthor(String author, Pageable pageable);

	List<Book> findByTitle(String title);

}