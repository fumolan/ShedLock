module shedlock.provider.zookeeper.curator {
    requires shedlock.core;
    requires org.slf4j;
    requires curator.framework;
    requires curator.client;
    requires zookeeper;
    exports net.javacrumbs.shedlock.provider.zookeeper.curator;
}