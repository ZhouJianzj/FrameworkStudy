package cn.itcast.mq.configuration;


import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutExchangeConfig {


    /**
     * 
     * 声明fanout交换机
     * @return 
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        return  new FanoutExchange("fanoutExchange");
    }

    /**
     * 声明队列
     * @return 
     */
    @Bean
    public Queue fanoutQueue1(){
        return new Queue("queue1");
    }
    @Bean
    public Queue fanoutQueue2(){
        return new Queue("queue2");
    }


    /**
     * 队列绑定交换机
     * @return
     */
    @Bean
    public Binding fanoutBind1(@Qualifier("fanoutQueue1") Queue queue, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
    @Bean
    public Binding fanoutBind2(@Qualifier("fanoutQueue2") Queue queue, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
}
