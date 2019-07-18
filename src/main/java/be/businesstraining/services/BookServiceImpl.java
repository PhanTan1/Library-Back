package be.businesstraining.services;

import be.businesstraining.domain.Book;
import be.businesstraining.repository.BooksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service

public class BookServiceImpl implements BooksService {

    private BooksRepository repository;

    @Override
    public Set<Book> allBook() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
