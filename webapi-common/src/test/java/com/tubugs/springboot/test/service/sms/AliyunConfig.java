package com.tubugs.springboot.test.service.sms;

import com.tubugs.springboot.service.log.LogService;
import com.tubugs.springboot.service.log.LogServiceLogbackImpl;
import com.tubugs.springboot.service.sms.SMSServcie;
import com.tubugs.springboot.service.sms.SMSServiceAliyunImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by xuzhang on 2017/8/31.
 */
@TestConfiguration
public class AliyunConfig {
    @Bean
    public LogService log() {
        return new LogServiceLogbackImpl();
    }

    @Bean
    public SMSServcie sms() {
        return new SMSServiceAliyunImpl();
    }
}
