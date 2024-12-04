package com.liyuwang.weblog.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author liyuwang
 * @description Knife4j 配置
 */
@Configuration
@EnableSwagger2WebMvc
@Profile("dev")
public class Knife4jConfig {

    @Bean("webApi")
    public Docket createApiDoc() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .groupName("Web前台接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.liyuwang.weblog.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("Weblog 博客前台接口文档") // 标题
                .description("Weblog 是一款由 Spring Boot + Vue 3.2 + Vite 4.3 开发的前后端分离博客。") // 描述
                .termsOfServiceUrl("https://www.yuan.com/") // API 服务条款
                .contact(new Contact("宇安", "https://www.yuan.com", "3217345380@qq.com")) // 联系人
                .version("1.0") // 版本号
                .build();
    }
}
