package com.icodeap.productos.service;

import com.icodeap.productos.entity.Producto;

import java.util.List;

public interface IProducto {
    Producto save (Producto producto);
    List<Producto> findAll();

    Producto findById(Integer id);
    void deleteById(Integer id);
    Producto update(Producto producto);
}
