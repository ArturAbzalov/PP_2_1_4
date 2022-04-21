package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Ocean1 ocean1() {
        return new Ocean1();
    }

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Wood3 wood3(Rabbit4 rabbit4) {
        return new Wood3(rabbit4);
    }

    @Bean
    public Rabbit4 rabbit4(Duck5 duck5) {
        return new Rabbit4(duck5);
    }

    @Bean
    public Duck5 duck5(Egg6 egg6) {
        return new Duck5(egg6);
    }

    @Bean
    public Egg6 egg6(Needle7 needle7) {
        return new Egg6(needle7);
    }

    @Bean
    public Needle7 needle7(Deth8 deth8) {
        return new Needle7(deth8);
    }

    @Bean
    public Deth8 deth8() {
        return new Deth8();
    }

    @Bean
    public KoscheiTheDeathless koscheiTheDeathless() {
        KoscheiTheDeathless koscheiTheDeathless =
                new KoscheiTheDeathless();
        koscheiTheDeathless.setOcean(ocean1());
        return koscheiTheDeathless;
    }

}
