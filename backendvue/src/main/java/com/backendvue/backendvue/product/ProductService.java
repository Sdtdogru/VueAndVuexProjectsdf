package com.backendvue.backendvue.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAllProduct(){
        return productRepository.findAll();
    }
    public List<ProductEntity> getProductId(Long id){
        return productRepository.getAllByAndCategoryId(id);
    }
    public List<ProductEntity> getId(Long id){
        return productRepository.getAllByAndId(id);
    }

    public ProductEntity findByProductId(Long id) {
        final Optional<ProductEntity> productoptional = productRepository.findById(id);
        if(productoptional.isPresent()){
            return productoptional.get();
        }

        return null;
    }


    public ProductEntity saveProduct(ProductEntity productEntity){
        return productRepository.save(productEntity);
    }

    public ProductEntity updateProduct(ProductEntity productEntity){
        return productRepository.save(productEntity);
    }

    public void deleteProduct(long id){
        productRepository.deleteById(id);

    }
}
