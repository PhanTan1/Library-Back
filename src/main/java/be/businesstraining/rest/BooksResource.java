package be.businesstraining.rest;

import be.businesstraining.domain.Book;
import be.businesstraining.services.BooksService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/books")
public class BooksResource {

    private BooksService service;

    public BooksResource (BooksService service){

        this.service =service;
    }

    @GetMapping
    public Set<Book> allBooks(){
        return service.allBook();
    }

    @GetMapping("/(id)")
    public Book getBookById(@PathVariable Long id) {
        return service.getBookById(id);

    }
}
