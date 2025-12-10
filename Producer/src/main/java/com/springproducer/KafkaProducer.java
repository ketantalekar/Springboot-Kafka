package com.springproducer;
/*
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducerStream {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducerStream(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message){
//        kafkaTemplate.send("my-topic", message);
//        System.out.println("Message sent to topic: " + message);
//        return "Message send: " + message;
//    }

    @PostMapping("/send")
    public String sendMessage(){
        RiderLocation riderLocation = new RiderLocation("rider123", 28.61, 77.23);
        kafkaTemplate.send("my-topic", riderLocation);
        System.out.println("Message sent to topic: " + riderLocation.toString());
        return "Message send: " + riderLocation.toString();
    }
}
*/