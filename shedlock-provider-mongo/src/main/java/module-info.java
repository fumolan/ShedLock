module shedlock.provider.mongo {
    requires transitive shedlock.core;
    requires org.slf4j;
    requires mongo.java.driver;
    exports net.javacrumbs.shedlock.provider.mongo;
}