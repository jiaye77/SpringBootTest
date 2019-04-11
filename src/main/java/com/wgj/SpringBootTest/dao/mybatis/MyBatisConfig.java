package com.wgj.SpringBootTest.dao.mybatis;

import com.github.pagehelper.PageHelper;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class MyBatisConfig {
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setTypeAliasesPackage("com.wgj.SpringBootTest.bean");
		
		//分页插件设置
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
	    properties.setProperty("supportMethodsArguments", "true");
	    properties.setProperty("returnPageInfo", "check");
	    properties.setProperty("params", "count=countSql");
	    pageHelper.setProperties(properties);
	    
	    //添加分页插件
	    bean.setPlugins(new Interceptor[]{pageHelper});
	    
	    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	    try {
			//基于注解扫描Mapper，不需配置xml路径
	    	return bean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
