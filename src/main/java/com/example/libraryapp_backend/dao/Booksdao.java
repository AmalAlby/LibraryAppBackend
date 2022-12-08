package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.BooksModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Booksdao extends CrudRepository<BooksModel,Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `name`, `price`, `publisher`, `year` FROM `bookslist` WHERE `name` =:name",nativeQuery = true)
    List<BooksModel> SearchBooks(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `bookslist` WHERE `id` =:id",nativeQuery = true)
    void DeleteBook(@Param("id") Integer id);
}
