package com.struggle.ojbackendjudgeservice.rabbitmq;

import com.rabbitmq.client.Channel;
import com.struggle.ojbackendjudgeservice.judge.JudgeService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Mr.Chen
 */

@Component
@Slf4j
public class MyMessageConsumer {
    @Resource
    private JudgeService judgeService;
    /**
     * 指定程序监听的消息队列和监听机制
     *
     * @param message
     * @param channel
     * @param deliveryTag
     */
    @SneakyThrows
    @RabbitListener(queues = {"code_queue"}, ackMode = "MANUAL")
    public void receiveMessage(String message, Channel channel, @Header(AmqpHeaders.CONSUMER_TAG) long deliveryTag) {
        log.info("receiveMessage message = {}", message);
        long questionSubmitId = Long.parseLong(message);
        try {
            judgeService.doJudge(questionSubmitId);
//            channel.basicAck(deliveryTag, false);

        }catch (Exception e){
            channel.basicNack(deliveryTag,false,false);
        }
    }
}
