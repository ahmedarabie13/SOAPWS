package com.arabie.repos;

import com.arabie.domain.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookRepo{
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookShop");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    private static BookRepo instance= null;
    public static BookRepo getInstance(){
        if(instance==null){
            synchronized(BookRepo.class){
                if(instance==null){
                    instance = new BookRepo();
                }
            }
        }
        return instance;
    }

    public Book insert(String title, int totalPAges, double rating, String type){
        entityManager.getTransaction().begin();
        Book book = new Book(title, totalPAges, rating, type);
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        // entityManager.clear();
        System.out.println("Book Inserted");
        return book;
    }
    
    public Book select(int id){
        entityManager.getTransaction().begin();
        Book book = (Book) entityManager.find(Book.class,id);
        entityManager.getTransaction().commit();
        // entityManager.flush();
        // entityManager.clear();
        return book; 
    }
    public Book updateBookName(int id,String title){
        entityManager.getTransaction().begin();
        Book book = (Book) entityManager.find(Book.class,id);
        book.setTitle(title);
        entityManager.merge(book);
        entityManager.getTransaction().commit();
        
        // entityManager.flush();
        // entityManager.clear();
        return book;
    } 
    public boolean removeBook(int id){
        entityManager.getTransaction().begin();
        Book book = (Book) entityManager.find(Book.class,id);
        entityManager.remove(book);
        entityManager.getTransaction().commit();
        // entityManager.flush();
        // entityManager.clear();
        return true;       
        
    }
}