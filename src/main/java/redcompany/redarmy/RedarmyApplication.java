package redcompany.redarmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedarmyApplication {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(RedarmyApplication.class, args);
        DisneyContestBot bot = new DisneyContestBot();
        for(int x =0; x < 1000; x++) {
            bot.executeScript();
            System.out.println("ENVIO NO. =>" + x);
        }
    }

}
