package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    void save (User user);

    void remove (Long id);

    Page <User> findAllByusernameContaining(String username, Pageable pageable);

    Page<User> findAll(Pageable pageable);

    Iterable<User> findAllByCategory(Category category);
}
