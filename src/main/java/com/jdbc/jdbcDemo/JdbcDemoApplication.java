package com.jdbc.jdbcDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;


@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JdbcDemoApplication.class, args);

//		List<Employee> employees = List.of(
//				new Employee("John Smith", "New York", "IT"),
//				new Employee("Alice Johnson", "Los Angeles", "HR"),
//				new Employee("Michael Brown", "Chicago", "Finance"),
//				new Employee("Emma Wilson", "Seattle", "IT"),
//				new Employee("David Miller", "Boston", "Marketing"),
//				new Employee("Sophia Davis", "San Francisco", "HR"),
//				new Employee("James Anderson", "Dallas", "IT"),
//				new Employee("Olivia Thomas", "Miami", "Sales"),
//				new Employee("William Taylor", "Denver", "Finance"),
//				new Employee("Isabella Moore", "Austin", "IT")
//		);
//		EmployeeRepository pr = ac.getBean(EmployeeRepository.class);
//		pr.saveAll(employees);
//
//		int id = 2;
//
//		// READ one
//		Employee emp = pr.findById(id).orElse(null);
//		System.out.println("Found by id " + id + ": " + emp);
//
//		// READ all
//		System.out.println("All employees:");
//		pr.findAll().forEach(System.out::println);
//
//		// UPDATE
//		if (emp != null) {
//			emp.setEmployeeDepartment("Legal");
//			pr.save(emp);
//			System.out.println("Updated: " + pr.findById(id).orElse(null));
//		}
//
//		// DELETE
//		pr.deleteById(id);
//		System.out.println("Deleted id " + id + ". Exists now? " + pr.existsById(id));

	}
}
