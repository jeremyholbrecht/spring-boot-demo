package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sandy = new Student(
                    "Sandy",
                    "Sandy@gmail.com",
                    LocalDate.of(2004, Month.JULY, 4),
                    18
            );

            Student jere = new Student(
                    "Jere",
                    "Jere@outlook.com",
                    LocalDate.of(1995, Month.MARCH, 13),
                    27
            );

            repository.saveAll(
                    List.of(sandy, jere)
            );

        };
    }
}
