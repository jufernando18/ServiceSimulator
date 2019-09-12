package co.com.ies;

import java.time.ZoneId;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSimulatorApplication.class, args);
	}

	@PostConstruct
	public void setTimeZone(){
		TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("America/Bogota")));
	}
}
