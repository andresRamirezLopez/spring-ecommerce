package com.springboot.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecommerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
