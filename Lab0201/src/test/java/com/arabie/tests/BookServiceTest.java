package com.arabie.tests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.arabie.myservice.Book;
import com.arabie.myservice.BookService;
import com.arabie.myservice.BookServiceImplService;

import org.junit.jupiter.api.BeforeAll;

public class BookServiceTest{
    private static BookServiceImplService bookServiceService;
    private static Book book;
    @BeforeAll
    public static void init(){
        bookServiceService = new BookServiceImplService();
    }

    @DisplayName("Test select")
    @Test
    public void testSelect(){
        BookService bookService = bookServiceService.getBookServiceImplPort();
        // assertEquals("HeadFirst",bookService.getBook(6).getTitle());
        assertEquals("aaaa",bookService.getBook(9).getTitle());
        // assertEquals("plaPla",bookService.getBook(6).getTitle());
    }

    @DisplayName("Test insert")
    @Test
    public void testInsert(){
        BookService bookService = bookServiceService.getBookServiceImplPort();
        assertEquals("pla",bookService.addBook("pla", 10, 8.5, "aaaa").getTitle());
    }    

    @DisplayName("Test update")
    @Test
    public void testUpdate(){
        BookService bookService = bookServiceService.getBookServiceImplPort();
        assertEquals("OCP3",bookService.updateBook(11,"OCP3").getTitle());
    }

    @DisplayName("Test delete")
    @Test
    public void testDelete(){
        BookService bookService = bookServiceService.getBookServiceImplPort();
        assertTrue(bookService.deleteBook(16));
    }
    
}