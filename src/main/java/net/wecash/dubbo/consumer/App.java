package net.wecash.dubbo.consumer;

import net.wecash.dubbo.provider.inter.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liu on 2016/7/12.
 */
public class App {
    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
            context.start();
            IDemoService demoService = (IDemoService)context.getBean("demoService");
            String result = demoService.sayHello("xiaoming");
            System.out.println("result:"+result);
            System.in.read();
           /* ConsumerService service = (ConsumerService)context.getBean("consumerService");
            service.init();*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
