module shedlock.provider.jedis {
    requires shedlock.core;
    requires org.slf4j;
    requires jedis;
    exports net.javacrumbs.shedlock.provider.jedis;
}