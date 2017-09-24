module shedlock.provider.jdbc.template {
    requires shedlock.core;
    requires shedlock.provider.jdbc.internal;
    requires java.sql;
    requires spring.jdbc;
    requires spring.tx;
    requires org.slf4j;
    exports net.javacrumbs.shedlock.provider.jdbctemplate;
}