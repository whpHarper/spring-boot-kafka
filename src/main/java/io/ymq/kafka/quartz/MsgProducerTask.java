package io.ymq.kafka.quartz;

import io.ymq.kafka.MsgProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MsgProducerTask {
    private static final Logger log = LoggerFactory.getLogger(MsgProducerTask.class);
    @Autowired
    private MsgProducer msgProducer;
    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){
        msgProducer.sendMessage("hdfs_audit_log", "2019-02-26 20:34:32,766 INFO FSNamesystem.audit: allowed=true\tugi=hbase (auth:SIMPLE)\tip=/10.26.164.40\tcmd=listStatus\tsrc=/hbase/WALs/hadoop4,60020,1551164301215\tdst=null\tperm=null\tproto=rpc");
        log.info("=====>>>>>使用cron{}",new Date());
    }
}
