package com.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


/**
 * The InternationalizationConfig class is use to support Internationalization.
 * @author 2068574
 *
 */
@Configuration
public class InternationalizationConfig implements WebMvcConfigurer {

	/**
	 * The localResolver method is use to set the default locale to English.
	 * This method is annotated with Bean annotation
	 * @return localeResolver
	 */
	@Bean
   public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
   }
   
	/**
	 * The localeChangeInterceptor method set the parameter name as language.
	 * This method is annotated with Bean annotation
	 * @return interceptor
	 */
   @Bean
   public LocaleChangeInterceptor localeChangeInterceptor() {
	   LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
	   interceptor.setParamName("language");
	   return interceptor;

   }
   
   @Bean
   public MessageSource messageSource() {
	   ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	   messageSource.setBasename("classpath:messages");
	   messageSource.setDefaultEncoding("UTF-8");
	   return messageSource;
   }
   
   @Bean
   public LocalValidatorFactoryBean getValidator() {
	   LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
	   bean.setValidationMessageSource(messageSource());
	   return bean;
   }
   
   
   /**
    * The addInterceptors method is use to register the LocaleChangeInterceptor
    */
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
	   registry.addInterceptor(localeChangeInterceptor());	  
      
   }
}