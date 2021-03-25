package com.services.company;

import com.services.company.Entities.Company;
import com.services.company.dao.CompanyRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompanyRepository companyRepository) {

        return args -> {
            Stream.of("A", "B", "C").forEach(cn -> {companyRepository.save(new Company(null, cn, 100*Math.random()*999));
            });
            companyRepository.findAll().forEach(System.out::println);
        };
    }
}
