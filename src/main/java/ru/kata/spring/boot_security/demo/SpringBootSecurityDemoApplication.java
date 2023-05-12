package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

}

/*INSERT INTO roles(id, name) VALUES (1, 'ROLE_USER'), (2, 'ROLE_ADMIN');

INSERT INTO users(id, age, email, first_name, last_name, password)
VALUES (1, 45, 'admin@mail.ru', 'Admin', 'Adminov', '$2a$12$xP/1sbbo.GlHNyyniYkJIuUWEMP3qWgUVqo77vpvC5WQHYVQI4cAu'), (2, 45, 'user@mail.ru', 'User', 'Userov', '$2a$12$xP/1sbbo.GlHNyyniYkJIuUWEMP3qWgUVqo77vpvC5WQHYVQI4cAu');

INSERT INTO users_roles(users_id, roles_id) VALUES (1, 2), (1, 1), (2, 1);*/

