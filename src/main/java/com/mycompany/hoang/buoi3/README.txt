- Topic: BEAN NAMING AND BEAN INSTANTIATION MODE

- Knowledge:
    + By default, all beans in Spring are singletons. This means Spring
    maintains a single instance of the bean, all dependent objects use
    the same instance
    + Spring can still create a new instance of the bean to satisfy every
    dependency and every call to getBean()
    + The following bean scopes are supported as of version 4:
        _ Singleton: The default scope
        _ Prototype: A new instance will be created by Spring when requested

- Examples:
    + IOC Container will create an instance of BookwormOracle class
    which implements Oracle interface
    + Example 1: Understanding bean naming (id and name attribute in <bean>)
    + Example 2: Understanding bean instantiation mode (singleton, prototype)



