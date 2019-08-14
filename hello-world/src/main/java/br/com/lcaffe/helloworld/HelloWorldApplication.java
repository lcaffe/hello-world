package br.com.lcaffe.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import com.samskivert.mustache.Mustache;

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.lcaffe.helloworld" })
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Bean
	public Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader templateLoader, Environment environment) {

		MustacheEnvironmentCollector collector = new MustacheEnvironmentCollector();
		collector.setEnvironment(environment);

		return Mustache.compiler().defaultValue("").withLoader(templateLoader)
				.withCollector(collector);

	}

}
