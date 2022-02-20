package jp.co.itfllc.officesystemaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * アプリケーションコンフィグ
 */
@Configuration
@MapperScan("jp.co.itfllc.officesystemaccount.mappers")
public class AppConfig implements WebMvcConfigurer {
    /**
     * コンストラクター
     */
    public AppConfig() {}
}
