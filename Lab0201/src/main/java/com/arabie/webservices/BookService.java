package com.arabie.webservices;

import com.arabie.domain.Book;
import jakarta.jws.*;
@WebService
public interface BookService {
    
    Book getBook(int id);

    Book updateBook(int id, String name);

    boolean deleteBook(int id);

    Book addBook(String title, int totalPAges, double rating, String type);

   
}