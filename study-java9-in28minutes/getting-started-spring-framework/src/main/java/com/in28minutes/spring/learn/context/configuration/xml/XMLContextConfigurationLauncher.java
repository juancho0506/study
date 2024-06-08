package com.in28minutes.spring.learn.context.configuration.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Example application using XML configuration file, to replace configuration,
 * component scan and bean initialization.
 */
//No configuration or component scan needed when using XML configuration.
public class XMLContextConfigurationLauncher {
    public static void main(String[] args) {
        try (
                //Init the context:
                var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            //Testing simple beans defined in the XML:
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(ServiceClass.class).getDependencyClass().someTask();
        }
    }
}

/**
 * No annotation Needed if you are going to crete beans
 * through XML config.
 */
class ServiceClass {
    DependencyClass dependencyClass;

    public ServiceClass(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
        System.out.println("All dependencies are ready.");
    }

    public DependencyClass getDependencyClass() {
        return dependencyClass;
    }
}


class DependencyClass {
    public void someTask() {
        System.out.println("Running task to initialize other class.");
    }
}