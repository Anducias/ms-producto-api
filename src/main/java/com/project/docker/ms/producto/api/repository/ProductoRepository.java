package com.project.docker.ms.producto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.docker.ms.producto.api.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
}
