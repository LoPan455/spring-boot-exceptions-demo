package io.tjohander.exceptiondemo.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@EnableWebMvc
@Configuration
class WebConfig(val objectMapper: ObjectMapper) : WebMvcConfigurer {

    // credit: https://gdpotter.com/2017/05/24/custom-spring-mvc-jackson/
    @Override
    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        val webObjectMapper: ObjectMapper = objectMapper.copy()
        webObjectMapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
        converters.add(MappingJackson2HttpMessageConverter(webObjectMapper))
        super.configureMessageConverters(converters)
    }
}
