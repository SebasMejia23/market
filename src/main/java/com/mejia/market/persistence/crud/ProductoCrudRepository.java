package com.mejia.market.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mejia.market.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findbyCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
