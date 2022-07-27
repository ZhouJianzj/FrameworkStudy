package cn.itcast.mq.listeners;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 队列监听器
 * @author zhoujian
 */
@Component
public class MQListener {


    @RabbitListener(queues = "simple.queue")
    public void receiveMessageOne(String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(20);
    }

    @RabbitListener(queues = "simple.queue")
    public void receiveMessageTwo(String message) throws InterruptedException {
        System.err.println(message);
        Thread.sleep(200);
    }



    @RabbitListener(queues = "queue1")
    public void receiveMessageQueue1(String message) throws InterruptedException {
        System.out.println(message);
    }

    @RabbitListener(queues = "queue2")
    public void receiveMessageQueue2(String message) throws InterruptedException {
        System.err.println(message);

    }
}
