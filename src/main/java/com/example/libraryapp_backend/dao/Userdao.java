package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.UserModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface Userdao extends CrudRepository<UserModel,Integer> {
}
