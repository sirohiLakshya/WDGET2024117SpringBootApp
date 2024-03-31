package BookLibraryApp.controller;

import BookLibraryApp.model.Book;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// Path to our server Eg: http://localhost:4050/books
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();

    // Path to our GET request Eg: http://localhost:4050/books/
    @GetMapping("/")
    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    // Path to our POST request Eg: http://localhost:4050/books/ (Along with JSON body)
    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
        books.add(book);
    }

    // Path to our DELETE request Eg: http://localhost:4050/books/1 (1 is book ID)
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    // Path to our PUT request Eg: http://localhost:4050/books/1 (1 is book ID)
    @PutMapping("/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId().equals(id)) {
                books.set(i, updatedBook);
                return;
            }
        }
    }
}
