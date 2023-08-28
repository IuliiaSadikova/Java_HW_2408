package com.example.hw_2408;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Создайте проект Spring с помощью start.spring.io
Создайте POJO класс Student с полями имя и возраст
Настройте bean-компонент Student в файле beans.xml
Сделайте студента сначала синглтоном.
Получите двух студентов из контекста, присвойте
характеристики первому студенту, а затем выведите
в консоль характеристики второго студента.
Затем поменяйте singleton на prototype в конфигурации
и посмотрите, как изменится поведение приложения.
 */
@SpringBootApplication
public class Hw2408Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw2408Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Student studentTsoi = (Student) context.getBean("student");
		studentTsoi.setName("Victor Tsoi");
		studentTsoi.setAge(20);

		Student studentGorshenev = (Student) context.getBean("student");
		studentGorshenev.setName("Mikhail Gorshenev");
		studentGorshenev.setAge(18);

		System.out.println(studentTsoi.getName() + " " + studentTsoi.getAge());
		System.out.println(studentGorshenev.getName() + " " + studentGorshenev.getAge());

	}




}
