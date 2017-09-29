module shedlock.springboot.test {
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;
    requires net.javacrumbs.shedlock.core;
    requires net.javacrumbs.shedlock.spring;
    requires java.sql;
    requires net.javacrumbs.shedlock.provider.jdbctemplate;
    requires HikariCP;
}