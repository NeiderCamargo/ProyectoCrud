package com.inventario.crudinventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.crudinventario.entity.Producto;
import com.inventario.crudinventario.service.ProductoService;

@RestController
@RequestMapping(path = "api/v1/productos")
public class ProductoController {

    @Autowired
    /* Traemos los servicios */
    private ProductoService productoService;

    /* se enlista los productos */
    @GetMapping
    public List<Producto> getAll() {
        return productoService.getProducto();
    }

    /* consultar con ID */
    @GetMapping("/{productoID}")
    public Producto getBiId(@PathVariable("productoID") Long productoID) {
        return productoService.getProducto(productoID);
    }

    /* Se carga un producto */
    @PostMapping
    public void saveUpdate(@RequestBody Producto producto) {
        productoService.saveOrUpgrade(producto);
    }

    /* Se elimina un prodcuto */
    @DeleteMapping("/{productoID}")
    public void saveUpdate(@PathVariable("productoID") Long productoID) {
        productoService.delete(productoID);
    }
}
