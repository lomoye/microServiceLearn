package demo.msa.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lomoye on 2017/9/14.
 *
 */
@RestController
@SpringBootApplication(scanBasePackages = "demo.msa")
public class SimpleApplication {

    @RequestMapping(name = "HelloService", method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }
}
