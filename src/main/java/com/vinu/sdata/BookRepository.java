package com.vinu.sdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinu.sdata.data.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
