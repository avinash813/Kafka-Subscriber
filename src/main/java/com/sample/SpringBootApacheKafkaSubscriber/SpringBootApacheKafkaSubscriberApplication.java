package com.sample.SpringBootApacheKafkaSubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.sample.SpringBootApacheKafkaSubscriber.util.AppConstants;

@SpringBootApplication
public class SpringBootApacheKafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaSubscriberApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId="group_sample_customer")
	public void subscribeMsg(String cusData) {
			System.out.print("* Msg Recieved From Kafka server* :: ");
			System.out.println(cusData);
		
	}

}
