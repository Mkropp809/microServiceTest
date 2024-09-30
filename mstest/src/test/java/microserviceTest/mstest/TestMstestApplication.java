package microserviceTest.mstest;

import org.springframework.boot.SpringApplication;

public class TestMstestApplication {

	public static void main(String[] args) {
		SpringApplication.from(MstestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
