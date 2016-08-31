package br.com.systemplus.meuemprego.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.MediaType;

@Configuration
public class SpringRepositoryRestConfigurationAdpeter extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("meuemprego-api");
		config.setDefaultMediaType(MediaType.APPLICATION_JSON);
		config.setMaxPageSize(3);
		super.configureRepositoryRestConfiguration(config);
	}
	
	
}
