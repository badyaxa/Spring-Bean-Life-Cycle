# Spring-Bean-Life-Cycle

## console log below

- ================================ MAIN -------before CONTEXT =================================================
- Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@43738a82
- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
- Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
- Creating shared instance of singleton bean 'customBeanFactoryPostProcessor'
- Creating shared instance of singleton bean 'beansConfigManual'
- @Bean method BeansConfigManual.getCustomBeanFactoryPostProcessor is non-static and returns an object assignable to Spring's BeanFactoryPostProcessor interface. This will result in a failure to process annotations such as @Autowired, @Resource and @PostConstruct within the method's declaring @Configuration class. Add the 'static' modifier to this method to avoid these container lifecycle issues; see @Bean javadoc for complete details.
- Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
-     ---- CustomBeanFactoryPostProcessor.postProcessBeanFactory(BEFORE)customInitMethodB
-     ---- CustomBeanFactoryPostProcessor.postProcessBeanFactory(AFTER)initMethodChangedInCustomBeanFactoryPostProcessorClass
- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
- Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
- Creating shared instance of singleton bean 'customBeanPostProcessor'
- Creating shared instance of singleton bean 'com.badyaxa.spring.config.BeansConfigFromProperties'
- Found key 'prefixBeanB.name' in PropertySource 'class path resource [application.properties]' with value of type String
- Found key 'prefixBeanB.value' in PropertySource 'class path resource [application.properties]' with value of type String
- Found key 'prefixBeanC.name' in PropertySource 'class path resource [application.properties]' with value of type String
- Found key 'prefixBeanC.value' in PropertySource 'class path resource [application.properties]' with value of type String
- Found key 'prefixBeanD.name' in PropertySource 'class path resource [application.properties]' with value of type String
- Found key 'prefixBeanD.value' in PropertySource 'class path resource [application.properties]' with value of type String
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
- Creating shared instance of singleton bean 'beanD'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassD(FieldName-ValueObtainedFromPropertyFile-D, 4)
-     ---- BeanD.this.getClass().getSimpleName() = BeanClassD(FieldName-ValueObtainedFromPropertyFile-D, 4)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- START -----------D-------- customInitMethodD()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanD Validator(BEFORE)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-D', value=4}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanD Validator(AFTER)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-D', value=4}
- Creating shared instance of singleton bean 'beanB'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassB(FieldName-ValueObtainedFromPropertyFile-B, 2)
-     ---- BeanB.this.getClass().getSimpleName() = BeanClassB(FieldName-ValueObtainedFromPropertyFile-B, 2)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- START -----B-------------- initMethodChangedInCustomBeanFactoryPostProcessorClass()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanB Validator(BEFORE)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-B', value=2}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanB Validator(AFTER)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-B', value=2}
- Creating shared instance of singleton bean 'beanC'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassC(FieldName-ValueObtainedFromPropertyFile-C, 3)
-     ---- BeanC.this.getClass().getSimpleName() = BeanClassC(FieldName-ValueObtainedFromPropertyFile-C, 3)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- START --------C----------- customInitMethodC()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanC Validator(BEFORE)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-C', value=3}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanC Validator(AFTER)toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-C', value=3}
- Creating shared instance of singleton bean 'beanA'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassA(nameFieldClasA, 1)
-     ---- BeanA.this.getClass().getSimpleName() = BeanClassA(nameFieldClasA, 1)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- START --A----------------- InitializingBean.afterPropertiesSet()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanA Validator(BEFORE)toString.BeanFather{name='nameFieldClasA', value=1}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanA Validator(AFTER)toString.BeanFather{name='nameFieldClasA', value=1}
- Creating shared instance of singleton bean 'beanE'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassE(nameFieldClasE, 5)
-     ---- BeanE.this.getClass().getSimpleName() = BeanClassE(nameFieldClasE, 5)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- START --------------E----- @PostConstruct.customPostConstruct()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanE Validator(BEFORE)toString.BeanFather{name='nameFieldClasE', value=5}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanE Validator(AFTER)toString.BeanFather{name='nameFieldClasE', value=5}
- ================================ MAIN --------after CONTEXT =================================================
-
- -------------------------------- BEFORE ============= FOREACH ------------------------------------------------
-     ---- org.springframework.context.annotation.internalConfigurationAnnotationProcessor -- context.getBean(name) = org.springframework.context.annotation.ConfigurationClassPostProcessor@59e2d8e3
-     ---- org.springframework.context.annotation.internalAutowiredAnnotationProcessor -- context.getBean(name) = org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@2b72cb8a
-     ---- org.springframework.context.annotation.internalCommonAnnotationProcessor -- context.getBean(name) = org.springframework.context.annotation.CommonAnnotationBeanPostProcessor@7f8a9499
-     ---- org.springframework.context.event.internalEventListenerProcessor -- context.getBean(name) = org.springframework.context.event.EventListenerMethodProcessor@5d43661b
-     ---- org.springframework.context.event.internalEventListenerFactory -- context.getBean(name) = org.springframework.context.event.DefaultEventListenerFactory@12299890
-     ---- beansConfigManual -- context.getBean(name) = com.badyaxa.spring.config.BeansConfigManual$$EnhancerBySpringCGLIB$$21ad0220@2fba3fc4
-     ---- com.badyaxa.spring.config.BeansConfigFromProperties -- context.getBean(name) = com.badyaxa.spring.config.BeansConfigFromProperties$$EnhancerBySpringCGLIB$$6fa3e5b7@4bf48f6
-     ---- beanB -- context.getBean(name) = toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-B', value=2}
-     ---- beanC -- context.getBean(name) = toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-C', value=3}
-     ---- beanD -- context.getBean(name) = toString.BeanFather{name='FieldName-ValueObtainedFromPropertyFile-D', value=4}
-     ---- beanA -- context.getBean(name) = toString.BeanFather{name='nameFieldClasA', value=1}
-     ---- beanE -- context.getBean(name) = toString.BeanFather{name='nameFieldClasE', value=5}
- Creating shared instance of singleton bean 'beanF'
-     ---- BeanFather.this.getClass().getSimpleName() = BeanClassF(nameFieldClasF, 6)
-     ---- BeanF.this.getClass().getSimpleName() = BeanClassF(nameFieldClasF, 6)
-     ---- CustomBeanPostProcessor.postProcessBeforeInitialization()
-     ---- CustomBeanPostProcessor.postProcessAfterInitialization()
-     ---- beanF Validator(BEFORE)toString.BeanFather{name='nameFieldClasF', value=6}
-     ---- CustomBeanValidator >>>> not valid
-     ---- beanF Validator(AFTER)toString.BeanFather{name='nameFieldClasF', value=6}
-     ---- beanF -- context.getBean(name) = toString.BeanFather{name='nameFieldClasF', value=6}
-     ---- customBeanFactoryPostProcessor -- context.getBean(name) = com.badyaxa.spring.beans.CustomBeanFactoryPostProcessor@a82c5f1
-     ---- customBeanPostProcessor -- context.getBean(name) = com.badyaxa.spring.beans.CustomBeanPostProcessor@7b7fdc8
- ------------------------------- AFTER =================== FOREACH --------------------------------------------
-
- Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@43738a82, started on ..
-     ---- START --------------E----- @PreDestroy.customPreDestroy()
-     ---- START --A----------------- DisposableBean.destroy()
-     ---- START --------C----------- customDestroyMethodC()
-     ---- START -----B-------------- customDestroyMethodB()
-     ---- START -----------D-------- customDestroyMethodD()
-     ---- context.close() invoked
