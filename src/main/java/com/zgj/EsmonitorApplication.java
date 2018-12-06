package com.zgj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * target,@Target({ElementType.TYPE})
 Retention(RetentionPolicy.RUNTIME)
 Documented
 Inherited
 SpringBootConfiguration
 EnableAutoConfiguration
 ComponentSca
 SpringBootApplication是这些注解组合而成的一个注解
 */
@SpringBootApplication
//@ImportResource({"classpath:test.xml","classpath:spring.xml"})
public class EsmonitorApplication {

	Logger gog  = LoggerFactory.getLogger(EsmonitorApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(EsmonitorApplication.class, args);
	}
}
