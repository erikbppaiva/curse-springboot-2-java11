package com.educandoweb.curse.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
