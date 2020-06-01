package com.backendvue.backendvue.features;

import com.backendvue.backendvue.product.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeaturesController {
    @Autowired
    FeaturesService featuresService;

    @GetMapping("features")
    public List<FeaturesEnttiy> findAllFeature(){
        return featuresService.findAllFeature();
    }

    @PostMapping("features")
    public FeaturesEnttiy saveFeature(@RequestBody FeaturesEnttiy p){
        return featuresService.saveFeature(p);
    }
}
