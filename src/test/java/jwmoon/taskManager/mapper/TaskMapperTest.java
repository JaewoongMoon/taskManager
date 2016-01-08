package jwmoon.taskManager.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jwmoon.taskManager.domain.Task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-datasource.xml")
public class TaskMapperTest {

	@Autowired 
	TaskMapper taskMapper;
	
	private static Logger log = (Logger) LoggerFactory.getLogger(TaskMapperTest.class);
	
	private Task task1;
	
	@Before
	public void setUp(){
		task1 = new Task();
		task1.setCategory1("研究、教育");
		task1.setCategory2("製品　STUDY");
		task1.setCategory3("資料読み");
	}
	
	
	@Test
	public void loadTest(){
		
		boolean isLoad = taskMapper != null;
		assertThat(isLoad, is(true));
	}
	
	@Test
	public void selectTasks(){
		List<Task> list = taskMapper.selectTasks();
		log.info("size : " + list.size());
		for(Task t : list){
			log.info(t.getTaskDesc());
		}
	}
	
	@Test
	public void insertTask(){
		boolean result = taskMapper.insertTask(task1);
		assertThat(result, is(true));
	}
	
}
