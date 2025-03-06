package com.restapi.restapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.restapi.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
