package be.businesstraining.services;

import be.businesstraining.domain.Book;

import java.util.Set;

public interface BooksService {

    Set<Book> allBook();
    Book getBookById(Long id);
}
