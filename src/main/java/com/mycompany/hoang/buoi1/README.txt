- Terminologies:
    + Configuration XML file: configures objects information,
    its value and its dependencies in an XML file.
    + IOC (Inversion of Control): you don't need to create
    objects (new Object()), IOC container will create objects
    for you, you just get and use it.
    + IOC container: contains objects, creates objects, manages
    objects and manages its dependencies by reading the XML file.
    + Bean: An object in an IOC container.
    + Dependency Inversion Principle / Loose Coupling: Classes
    should depend on interfaces instead of concrete classes.
    + DI (Dependency Injection): Objects should get their
    dependencies from outside world, dependencies should be
    injected from outside rather than be declared inside classes.
    -> Classes should provide ways to inject dependencies from
    outside such as declaring Arguments Constructor or Setter method.
    -> Benefit: Changing objects at run time.

- Coding:
    1. Add Jar Files for Spring Core
    2. Configure Java object in an XML file or with annotations
    3. Use Spring IOC Container, eg: BeanFactory or ApplicationContext,
    use getBean() method to get the object constructed by them

- Examples:
    + IOC Container will create an instance of BookwormOracle class
    which implements Oracle interface
    + Example 1: Using only XML FILE to configure
    + Example 2: Using ANNOTATIONs to configure and adding a little line
    in XML file (@Component, @Service)
    + Example 3: Using only an JAVA CLASS to configure (@Configuration,
    @Bean)


