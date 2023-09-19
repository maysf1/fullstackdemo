package com.example.FULLSTACKBOOKDEMO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface BookRepository extends JpaRepository<Books, Integer> {
	
	@Query(value = "SELECT * FROM books WHERE id = ?1", nativeQuery = true)
	List<Books> getBooksById(Integer id);

	@Query(value = "SELECT * FROM books WHERE author = ?1", nativeQuery = true)
	List<Books> getBooksByAuthor(String author);
	
	@Query(value = "SELECT * FROM books WHERE title = ?1", nativeQuery = true)
	List<Books >getBooksByTitle(String title);
	
	@Query(value = "SELECT * FROM books WHERE genre = ?1", nativeQuery = true)
	List<Books >getBooksByGenre(String genre);
	
	@Query(value = "SELECT * FROM books WHERE isbn = ?1", nativeQuery = true)
	List<Books >getBooksByISBN(String isbn);
}
