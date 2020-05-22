package lupus.in.tabula.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineApplication.class, args);


        System.out.println(
        System.getProperty("org.apache.catalina.STRICT_SERVLET_COMPLIANCE" + ">>>>>>>>>>>>>>>>"));
    }
}
