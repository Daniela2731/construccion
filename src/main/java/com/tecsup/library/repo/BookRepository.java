package com.tecsup.library.repo;

import java.util.Optional;

import com.tecsup.library.model.Book;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}
