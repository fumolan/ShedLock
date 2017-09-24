module shedlock.provider.jdbc.internal {
    requires java.sql;
    requires shedlock.core;
    exports net.javacrumbs.shedlock.provider.jdbc.internal to
        shedlock.provider.jdbc.template,
        shedlock.provider.jdbc;
}