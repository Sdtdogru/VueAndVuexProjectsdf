package com.backendvue.backendvue.product;

import com.backendvue.backendvue.dto.Deneme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://192.168.1.22:8081","file://",  "http://localhost:8081"})
public class productController {
     @Autowired
    private ProductService productService;

     @GetMapping("products")
    public List<ProductEntity> findAllProduct(){
         return productService.findAllProduct();
     }

     @GetMapping("categoryId={id}")
    public List<ProductEntity> getProductId(@PathVariable Long id){
         return productService.getProductId(id);
     }
     @GetMapping("productId={id}")
    public List<ProductEntity> getId(@PathVariable Long id){
        return productService.getId(id);
    }

     @GetMapping("product={id}")
    public ProductEntity findByProductId(@PathVariable Long id){
         return productService.findByProductId(id);
     }

     @PostMapping("public/product")
    public ProductEntity saveProduct(@RequestBody ProductEntity p){
         return productService.saveProduct(p);
     }

     @PutMapping("private/product")
     public ProductEntity updateProduct(@RequestBody ProductEntity p){
         return productService.updateProduct(p);
     }

     @DeleteMapping("private/product/{id}")
    public void deleteProduct(@PathVariable Long id){
         productService.deleteProduct(id);
     }

}
