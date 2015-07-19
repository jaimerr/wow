package jrr.wow.characterservice;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/character")
    public Character character(@RequestParam(value="LIProfile", defaultValue="None") String liProfile) {
    	if (liProfile=="None"){
    		return new Character("22","Glinda","Fairy Queen",85,60000,2);
    	}else{
    		return new Character("11","Eldara","Wicked Witch",90,80000,1);
    	}
    }
}
