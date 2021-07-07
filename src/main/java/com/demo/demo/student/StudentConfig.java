package com.demo.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(1123L, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, AUGUST, 5));
            Student stark = new Student(2543L, "Stark", "stark.jamal@gmail.com", LocalDate.of(2001, APRIL, 10));
            repository.saveAll(
                    List.of(mariam, stark)
            );
        };
    }
}
