

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.foxdd.dubbo.dubbo_interface.People;
import com.foxdd.dubbo.dubbo_interface.SpeakInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath*:/META-INF/spring/spring-dubbo-consumer.xml"})
public class BaseTest {

	@Resource
	private SpeakInterface speakInterface2;
	
	@Test
	public void test(){
		People people = new People();
		people.setAge(18);
		people.setName("dubboTest1");
		System.out.println(speakInterface2.speak(people));  
	}
	
	public void test1(){
		System.out.println("hello-world");
	}
	
}
