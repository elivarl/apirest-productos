package com.icodeap.productos.controller;

import com.icodeap.productos.entity.Producto;
import com.icodeap.productos.service.IProducto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    private IProducto iProducto;

    public ProductoController(IProducto iProducto) {
        this.iProducto = iProducto;
    }

    //POST
    //http://localhost:8080
    @PostMapping
    public Producto save(@RequestBody Producto producto){
        return iProducto.save(producto);
    }
    //GET
    //http://localhost:8080
    @GetMapping
    public List<Producto>  findAll(){
        return iProducto.findAll();
    }

    //GET
    //http://localhost:8080/1
    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id){
        return iProducto.findById(id);
    }

    //DELETE
    //http://localhost:8080/1
    @DeleteMapping("/{idProducto}")
    public void deleteById(@PathVariable("idProducto") Integer id){
        iProducto.deleteById(id);
    }

    //PUT
    //http://localhost:8080
    @PutMapping
    public Producto update (@RequestBody Producto producto){
        return iProducto.update(producto);
    }


}
