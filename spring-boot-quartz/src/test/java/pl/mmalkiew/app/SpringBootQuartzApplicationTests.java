package pl.mmalkiew.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mmalkiew.quartz.SpringBootQuartzApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootQuartzApplication.class)
public class SpringBootQuartzApplicationTests {

	@Test
	public void contextLoads() {
	}

}
