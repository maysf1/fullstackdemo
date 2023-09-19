package com.example.FULLSTACKBOOKDEMO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BooksController {

	@Autowired
	BookRepository bookRepository;
	
	// home page landing
	@GetMapping
	public String home(Model model) {
		model.addAttribute("homepage", "This is the the homepage for my fullstack book project :)");
		return "Home";
	}
	
	// search for all books
	@GetMapping("/books")
	public String getAllBooks(Model model) {
		model.addAttribute("allbooks", bookRepository.findAll());
		return "books";
	}
	// search for books by id
	@GetMapping("/books/id/{id}")
	public String getBooksById(@PathVariable(name="id") Integer id, Model model) {
		model.addAttribute("allbooks", bookRepository.getBooksById(id));
		return "books";
	}
	
	// search for books by author
	@GetMapping("/books/{author}")
	public String getBooksByAuthor(@PathVariable(name="author") String author, Model model) {
		model.addAttribute("allbooks", bookRepository.getBooksByAuthor(author));
		return "books";
	}
	// search for books by title
	@GetMapping("/books/title/{title}")
	public String getBooksByTitle(@PathVariable(name="title") String title, Model model) {
		model.addAttribute("allbooks", bookRepository.getBooksByTitle(title));
		return "books";
	}
	// search for books by isbn
	@GetMapping("/books/isbn/{isbn}")
	public String getBooksByISBN(@PathVariable(name="isbn") String isbn, Model model) {
		model.addAttribute("allbooks", bookRepository.getBooksByISBN(isbn));
		return "books";
	}
	// search for books by genre
	@GetMapping("/books/genre/{genre}")
	public String getBooksByGenre(@PathVariable(name="genre") String genre, Model model) {
		model.addAttribute("allbooks", bookRepository.getBooksByGenre(genre));
		return "books";
	}
}
