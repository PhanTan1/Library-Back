package be.businesstraining.repository;

import be.businesstraining.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository
    extends JpaRepository<Book,Long> {
}
