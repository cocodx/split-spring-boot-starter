package com.qingclean.springboot.config;

import com.qingclean.springboot.service.ISplitService;
import com.qingclean.springboot.service.ISplitServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author amazfit
 * @date 2022-06-06 上午7:16
 **/
@Configuration
@ConditionalOnClass(value = {ISplitService.class, ISplitServiceImpl.class})
public class SplitAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    ISplitService starterService(){
        return new ISplitServiceImpl();
    }
}
