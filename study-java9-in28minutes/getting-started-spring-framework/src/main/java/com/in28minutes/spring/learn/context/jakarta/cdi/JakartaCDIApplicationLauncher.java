package com.in28minutes.spring.learn.context.jakarta.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Example classes to show Spring's compatibility with
 * Jakarta CDI (Context Dependency Injection), using jakarta annotations
 * to do the same injection as with Spring ones.
 */

//@Component //replaced by Jakarta cdi
@Named
class ServiceClass {
    @Inject
    DependencyClass dependencyClass;

    public ServiceClass(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
        System.out.println("All dependencies are ready.");
    }

    public DependencyClass getDependencyClass() {
        return dependencyClass;
    }
}

//@Component
@Named
class DependencyClass {
    public void someTask() {
        System.out.println("Running task to initialize other class.");
    }
}

@Configuration
@ComponentScan
public class JakartaCDIApplicationLauncher {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(JakartaCDIApplicationLauncher.class)
        ) {
            //Just to test that Normal Class remains as Singleton
            System.out.println(context.getBean(ServiceClass.class));
            //Prototype creates different instances for the same class
            System.out.println(context.getBean(DependencyClass.class));
            context.getBean(ServiceClass.class).getDependencyClass().someTask();
        }
    }
}
