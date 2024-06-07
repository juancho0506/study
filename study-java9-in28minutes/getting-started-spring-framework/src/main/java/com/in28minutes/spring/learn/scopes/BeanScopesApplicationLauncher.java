package com.in28minutes.spring.learn.scopes;

import com.in28minutes.spring.learn.business.calculation.service.BusinessCalculatorService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Normal Class by default is a Singleton in Spring.
 */
@Component
class NormalClass{
    PrototypeClass prototypeClass;

    public NormalClass(PrototypeClass prototypeClass) {
        this.prototypeClass = prototypeClass;
        System.out.println("All dependencies are ready.");
    }

    /**
     * Example to use PostConstruct methods to initialize or run a task
     * after the bean is created and dependencies injected.
     */
    @PostConstruct
    public void init(){
        this.prototypeClass.someTask();
    }
    //Annotation to release resources before the bean is
    @PreDestroy
    public void cleanup(){
        System.out.println("Releasing resources" );
    }
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
    public void someTask(){
        System.out.println("Running task to initialize other class.");
    }
}

@Configuration
@ComponentScan
public class BeanScopesApplicationLauncher {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(BeanScopesApplicationLauncher.class)
        ) {
            //Just to test that Normal Class remains as Singleton
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            //Protoype creates different instances for the same class
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
