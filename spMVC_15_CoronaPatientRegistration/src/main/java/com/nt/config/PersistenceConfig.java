package com.nt.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.nt.repository")
@EnableTransactionManagement
public class PersistenceConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds) {
		LocalContainerEntityManagerFactoryBean fb = new LocalContainerEntityManagerFactoryBean();

		fb.setDataSource(ds);
		fb.setPackagesToScan("com.nt.entity");
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		jpaVendorAdapter.setGenerateDdl(true);
		jpaVendorAdapter.setShowSql(true);
		fb.setJpaVendorAdapter(jpaVendorAdapter);

		return fb;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/dsldb");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean
 public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
	 JpaTransactionManager tm=new JpaTransactionManager();
	 tm.setEntityManagerFactory(emf);
	 return tm;
 }
}
