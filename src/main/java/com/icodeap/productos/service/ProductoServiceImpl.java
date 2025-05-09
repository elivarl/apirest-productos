package com.icodeap.productos.service;

import com.icodeap.productos.entity.Producto;
import com.icodeap.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProducto{

    private ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto producto) {
        Producto productoBDD = productoRepository.findById(producto.getId()).get();

        productoBDD.setNombre(producto.getNombre());
        productoBDD.setDetalle(producto.getDetalle());
        productoBDD.setPrecio(producto.getPrecio());

        return productoRepository.save(productoBDD);
    }
}
