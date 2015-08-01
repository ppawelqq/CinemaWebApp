/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sevenative.context;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Paweł
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sevenative.controllers"})
@EnableTransactionManagement
@EnableJpaRepositories("com.sevenative.repositories")
public class ApplicationContext extends WebMvcConfigurerAdapter{
  
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
    configurer.enable();
    
    }   
   
    /* Data Source */
        
    /* JPAVendorAdapter 
      1. JDBC
    ` 2. ORM
         - EJB -> Java/JPQL
         *EclipseLink   
         *Hibernate
         *Spring Data JPA
    */
      /* 
    *
     EntityManagerFactory
      Extities to SQL / SQL to Entities 
    *
    *
    */
    
    
    
    /*
    @Bean
    public DataSource dataSource(){
    
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sevenativeCinema");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        
        return dataSource;
        
    }


    @Bean
    public JpaVendorAdapter  jpaVendorAdapter() {
    
         HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
         jpaVendorAdapter.setShowSql(true);
         jpaVendorAdapter.setGenerateDdl(false);
         jpaVendorAdapter.setDatabase(Database.MYSQL);
         return jpaVendorAdapter;
    }
    
    
  
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,  JpaVendorAdapter jpaVendorAdapter){
      
         LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
         lef.setDataSource(dataSource);
         lef.setJpaVendorAdapter(jpaVendorAdapter);
         lef.setPackagesToScan("com.sevenative.model");
         return lef;
 
    }
    
    */
    
}
