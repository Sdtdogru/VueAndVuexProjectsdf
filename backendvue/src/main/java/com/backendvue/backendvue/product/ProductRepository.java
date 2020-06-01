package com.backendvue.backendvue.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("select c from ProductEntity as c where c.categoryId=?1")
    List<ProductEntity> getAllByAndCategoryId(Long id);

    @Query("select c from ProductEntity as c where c.id=?1")
    List<ProductEntity> getAllByAndId(Long id);

}
