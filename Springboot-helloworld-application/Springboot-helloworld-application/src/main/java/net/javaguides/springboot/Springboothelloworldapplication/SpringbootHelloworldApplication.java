package net.javaguides.springboot.Springboothelloworldapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication是一個方便的annotation 他會幫我們加入以下兩個annotation
//@Configuration(標註這個claass是一個bean用來碩為application context的資源
//以及 @EnableAutoConfiguration(告訴spring boot要開始從classpath setting, other beans以及 其他各樣的路徑加入beans based
@SpringBootApplication
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}

}
