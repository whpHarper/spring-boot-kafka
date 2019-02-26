package io.ymq.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * 描述:消息消费者
 *
 * @author yanpenglei
 * @create 2017-10-16 18:33
 **/


@Component
public class MsgConsumer {
    private static final Logger log = LoggerFactory.getLogger(MsgConsumer.class);

    @KafkaListener(topics = {"hdfs_audit_log"})
    public void processMessage(String content) {
        log.info("====kafka消费数据:"+content);
    }

}
