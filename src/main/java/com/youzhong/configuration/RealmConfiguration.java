package com.youzhong.configuration;

import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RealmConfiguration {
	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Bean
//	public Realm createRealm() {
//		JdbcRealm realm = new JdbcRealm();
//		realm.setDataSource(dataSource);
//		realm.setAuthenticationQuery("select password from j_user where username = ?");
//		return realm;
//	}

	@Bean
	public ShiroFilterChainDefinition createShiroFilterChain() {
		DefaultShiroFilterChainDefinition filterChainDefinition = new DefaultShiroFilterChainDefinition();
		filterChainDefinition.addPathDefinition("/favicon.ico", "anon");
		filterChainDefinition.addPathDefinition("/js/**", "anon");
		filterChainDefinition.addPathDefinition("/bootstrap/**", "anon");
		filterChainDefinition.addPathDefinition("/select2/**", "anon");
		filterChainDefinition.addPathDefinition("/**", "authc");
//		filterChainDefinition.addPathDefinition("/user/**", "roles,perms");
//		filterChainDefinition.addPathDefinition("/role/**", "roles,perms");
		return filterChainDefinition;
	}
}
