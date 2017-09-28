module shedlock.provider.hazelcast {
    requires transitive shedlock.core;
    requires org.slf4j;
    requires hazelcast;
    exports net.javacrumbs.shedlock.provider.hazelcast;
}