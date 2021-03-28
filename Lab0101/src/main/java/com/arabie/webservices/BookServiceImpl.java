package com.arabie.webservices;

import com.arabie.domain.Book;
import com.arabie.repos.BookRepo;
import jakarta.jws.*;
@WebService(endpointInterface = "com.arabie.webservices.BookService")
public class BookServiceImpl implements BookService{
    public Book getBook(int id){
        return BookRepo.getInstance().select(id);
    }

    public Book updateBook(int id, String name){
        return BookRepo.getInstance().updateBookName(id, name);
    }

    public boolean deleteBook(int id){
        return BookRepo.getInstance().removeBook(id);
    }

    public Book addBook(String title, int totalPAges, double rating, String type){
        return BookRepo.getInstance().insert(title, totalPAges, rating, type);
    }
}