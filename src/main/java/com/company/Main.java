package com.company;

import com.company.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Executor exec = annotationConfigApplicationContext.getBean(Executor.class);
        exec.execute();
        annotationConfigApplicationContext.close();
    }
}
