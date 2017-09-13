package demo.msa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lomoye on 2017/9/13.
 *
 */
@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "HELLO";
    }
}
