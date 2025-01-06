package redcompany.redarmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedarmyApplication {

    public static void main(String[] args) {

        SpringApplication.run(RedarmyApplication.class, args);
        DisneyContestBot bot = new DisneyContestBot();
        bot.executeScript();
    }

}
