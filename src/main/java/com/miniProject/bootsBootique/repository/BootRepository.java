package com.miniProject.bootsBootique.repository;

import com.miniProject.bootsBootique.entity.Boot;
import com.miniProject.bootsBootique.enums.BootType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BootRepository extends CrudRepository<Boot, Integer> {
//    public List<Boot> findByMaterialAndTypeAndQuantityGreaterThan(String material, BootType type, Float size, Integer minQuantity);
//
//    public List<Boot> findByMaterialAndQuantityGreaterThan(String material, Integer minQuantity);
//
//    public List<Boot> findByMaterialAndSizeAndQuantityGreaterThan(String material, Float size, Integer minQuantity);
//
//    public List<Boot> findByTypeAndSizeAndQuantityGreaterThan(BootType type, Float size, Integer minQuantity);
//
//    public List<Boot> findByTypeAndQuantityGreaterThan(BootType type, Integer minQuantity);
}
