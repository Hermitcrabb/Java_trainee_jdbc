//package com.jdbc.jdbcDemo;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class PersonRepository {
//    public JdbcTemplate jdbcTemplate;
//
//    public PersonRepository(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public void createTable() {
//
//        String sql = """
//            CREATE TABLE IF NOT EXISTS employees (
//                id SERIAL PRIMARY KEY,
//                name VARCHAR(100) NOT NULL,
//                age INTEGER NOT NULL,
//                department VARCHAR(50) NOT NULL,
//                email VARCHAR(150) UNIQUE NOT NULL
//            )
//            """;
//
//        jdbcTemplate.execute(sql);
//    }
//    public int save(Person person) {
//
//        String sql = """
//            INSERT INTO employees (name, age, department, email)
//            VALUES (?, ?, ?, ?)
//            """;
//
//        return jdbcTemplate.update(
//                sql,
//                person.getName(),
//                person.getAge(),
//                person.getDepartment(),
//                person.getEmail()
//        );
//    }
//    public List<Person> findAll(){
//        String sql = """
//            SELECT id, name, age, department, email
//            FROM employees
//            """;
//        return jdbcTemplate.query(sql, (rs, rowNum) ->
//                new Person(
//                        rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getInt("age"),
//                        rs.getString("department"),
//                        rs.getString("email")
//                ));
//    }
//
//    public Person findById(int id) {
//
//        String sql = """
//            SELECT id, name, age, department, email
//            FROM employees
//            WHERE id = ?
//            """;
//
//        return jdbcTemplate.queryForObject(
//                sql,
//                (rs, rowNum) ->
//                        new Person(
//                                rs.getInt("id"),
//                                rs.getString("name"),
//                                rs.getInt("age"),
//                                rs.getString("department"),
//                                rs.getString("email")
//                        ),
//                id
//        );
//    }
//
//    // UPDATE
//    public int update(Person person) {
//
//        String sql = """
//            UPDATE employees
//            SET name = ?,
//                age = ?,
//                department = ?,
//                email = ?
//            WHERE id = ?
//            """;
//
//        return jdbcTemplate.update(
//                sql,
//                person.getName(),
//                person.getAge(),
//                person.getEmail(),
//                person.getId()
//        );
//    }
//
//    // DELETE
//    public int deleteById(int id) {
//
//        String sql = """
//            DELETE FROM employees
//            WHERE id = ?
//            """;
//
//        return jdbcTemplate.update(sql, id);
//    }
//}
