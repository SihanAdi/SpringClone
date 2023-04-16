### The Life cycle of Bean
- Creating
  - Class --> Inferring construction methods --> Instantiation(Using reflect) --> Object --> Properties set(Dependency injection) --> Initial (Using afterPropertiesSet() method) (Not executed if there is no tangent or cut point.)(--> AOP --> Proxy) --> Bean Object
- Destroy