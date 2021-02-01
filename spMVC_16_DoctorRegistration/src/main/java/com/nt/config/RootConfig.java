package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nt.config.PersistenceConfig;

@Configuration
@Import(value = {ServiceConfig.class,PersistenceConfig.class})
public class RootConfig {

}
