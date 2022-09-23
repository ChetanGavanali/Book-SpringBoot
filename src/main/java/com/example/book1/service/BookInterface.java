package com.example.book1.service;

import com.example.book1.dto.BookDTO;
import com.example.book1.model.Book;

import java.util.List;

public interface BookInterface {

    String insertBookDetails(BookDTO bookDTO);

    List<Book> getall();

    Book FindById(int id);

    Book getByBook(String bookName);

    void getBookbyId(int id);

    String editById(int id, BookDTO bookDTO);

    List<Book> sortPriceLowToHigh();

    List<Book> sortPriceHighToLow();


    Book changeBookQty(int id, int quantity);
}
