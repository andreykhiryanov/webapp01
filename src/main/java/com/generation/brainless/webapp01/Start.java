package com.generation.brainless.webapp01;

import com.generation.brainless.webapp01.config.SpringConfig;
import com.generation.brainless.webapp01.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean testBean = context.getBean(TestBean.class);

        System.out.println(testBean.getName());

    }

}