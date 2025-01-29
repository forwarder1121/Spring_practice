package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sample.service.DiscountService;

@SpringBootApplication
public class SampleApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SampleApplication.class, args);

        DiscountService discountService = context.getBean(DiscountService.class);
        int beforeDiscount = 10000;
        System.out.println("할인 전 금액=" + beforeDiscount);
        int finalPrice = discountService.calculateDiscountPrice(beforeDiscount);
        System.out.println("할인된 금액=" + finalPrice);
    }
}
