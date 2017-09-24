module shedlock.provider.hazelcast {
    requires shedlock.core;
    requires org.slf4j;
    requires hazelcast;
    exports net.javacrumbs.shedlock.provider.hazelcast;
}