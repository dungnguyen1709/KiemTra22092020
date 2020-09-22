package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Page <User> findAllByusernameContaining(String username, Pageable pageable);
    Iterable<User> findAllByCategory(Category category);
}
