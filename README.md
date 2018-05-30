# SpringBootMySQL
Simple demo to integrate SpringBoot with MySQL and Hibernate


application.properties
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url= jdbc:mysql://${mysqlurl}:3306/$mysqlDB
spring.datasource.username=$mysqlusername
spring.datasource.password=$mysqlpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true // to hide or see the hibernate based sql queries
