package kr.hs.dgsw.calc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abcd {

    @GetMapping
    public  String sayAbcd() {
        return "ABCD";
    }

}
//cf1526fb166aaf00d3f6631f54eba26ef72889cc