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
	private Task task2;
	private Task task3;
	
	@Before
	public void setUp(){
		task1 = new Task("Maintenance", "WEB Report", "Bug修正, 改善", "AEGISWALL-416", 1, 0.5, 0.5, 0.5, 0.0);  
		task2 = new Task("Project", "조사 프로젝트", "Aegis Wall DBスキーマ分析", "계획 (범위, 일정, 조사 방법) 작성", 1, 5.0, 5.5, 5.5, 0.0);  
		task3 = new Task("協業", "技術関連", "오라클마스킹버그 패킷 덤프", "AEGISWALL-416", 1, 0.5, 0.5, 0.5, 0.0);  
		
	}
	
	
	@Test
	public void loadTest(){
		
		boolean isLoad = taskMapper != null;
		assertThat(isLoad, is(true));
	}
	
	@Test
	public void selectAll(){
		List<Task> list = taskMapper.selectAll();
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
	
	@Test
	public void deleteAll(){
		boolean result = taskMapper.deleteAll();
		assertThat(result, is(true));
		List<Task> list = taskMapper.selectAll();
		assertThat(list.size(), is(0));
	}
	
	
}
