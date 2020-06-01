package com.backendvue.backendvue.features;

import com.backendvue.backendvue.product.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeaturesService {
    @Autowired
    FeaturesRepository featuresRepository;

    public List<FeaturesEnttiy> findAllFeature(){
        return featuresRepository.findAll();
    }
    public FeaturesEnttiy saveFeature(FeaturesEnttiy featuresEnttiy){
        return featuresRepository.save(featuresEnttiy);
    }
}
