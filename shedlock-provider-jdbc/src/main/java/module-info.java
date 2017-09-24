module shedlock.provider.jdbc {
    requires java.sql;
    requires shedlock.core;
    requires shedlock.provider.jdbc.internal;
    requires org.slf4j;
    exports net.javacrumbs.shedlock.provider.jdbc;
}