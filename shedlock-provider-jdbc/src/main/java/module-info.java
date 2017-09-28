module shedlock.provider.jdbc {
    requires transitive shedlock.core;
    requires shedlock.provider.jdbc.internal;
    requires org.slf4j;
    requires java.sql;
    exports net.javacrumbs.shedlock.provider.jdbc;
}