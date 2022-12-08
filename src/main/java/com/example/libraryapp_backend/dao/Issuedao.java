package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.IssueModel;
import org.springframework.data.repository.CrudRepository;

public interface Issuedao extends CrudRepository<IssueModel,Integer> {
}
