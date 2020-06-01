package com.backendvue.backendvue;

import com.backendvue.backendvue.features.FeaturesEnttiy;
import com.backendvue.backendvue.features.FeaturesRepository;
import com.backendvue.backendvue.product.ProductEntity;
import com.backendvue.backendvue.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendvueApplication {
     @Autowired
	ProductRepository productRepository;
     @Autowired
	FeaturesRepository featuresRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendvueApplication.class, args);
	}

}
