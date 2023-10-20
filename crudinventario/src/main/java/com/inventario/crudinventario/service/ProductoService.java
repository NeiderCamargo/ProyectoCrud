package com.inventario.crudinventario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.crudinventario.entity.Producto;
import com.inventario.crudinventario.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    /* Creamos una lista de productos a devolver */
    public List<Producto> getProducto() {
        return productoRepository.findAll();/* Busca los elementos y los retorna */
    }

    /* Buscar producto por un ID */
    public Optional<Producto> getProductoID(Long id) {
        return productoRepository.findById(id);/* Busca los elementos y los retorna */
    }

    /* GUARDAR Y ACTUALIZAR */
    public void saveOrUpgrade(Producto producto) {
        productoRepository.save(producto);
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    public Producto getProducto(Long productoID) {
        return null;
    }
}
