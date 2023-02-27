package com.example.mylibrary;

import com.example.mylibrary.autoconfigure.LibAutoConfiguration;
import com.example.mylibrary.service.FirstService;
import com.example.mylibrary.service.ReplaceableService;
import com.example.mylibrary.service.ReplaceableServiceFinal;
import com.example.mylibrary.service.SecondService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

public class LibAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner =
        new ApplicationContextRunner().withConfiguration(AutoConfigurations.of(LibAutoConfiguration.class));

    @Test
    public void serviceNameCanBeConfigured() {
        this.contextRunner.run((context) -> {
            context.assertThat().hasSingleBean(FirstService.class);
            context.assertThat().hasSingleBean(SecondService.class);
            context.assertThat().hasSingleBean(ReplaceableService.class);
            context.assertThat().hasSingleBean(ReplaceableServiceFinal.class);
        });
    }

    @Test
    public void runTest() {
        String goodResult = "Bad connection";
        this.contextRunner.run((context) -> {
            var bean = context.getBean(FirstService.class);
            Assertions.assertEquals(bean.callQuestionableMethod(),goodResult);
            Assertions.assertEquals(bean.callQuestionableMethodFinal(),goodResult);
        });
    }
}
