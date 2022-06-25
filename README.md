# hello-world
Simple Hello World application using SpringBoot and log4j2

## JVM Args

```text
-Dlog.path=<local directory>
-Dspring.profiles.active=<env-profile>
```

* ***log.path*** The directory in which the log files will be written. When not specified, this will default to `./`
* ***spring.profiles.active*** The spring profile active on the system