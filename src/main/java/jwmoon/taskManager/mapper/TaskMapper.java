package jwmoon.taskManager.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import jwmoon.taskManager.domain.Task;

/**
 * TaskMapper
 * 
 * @author jwmoon
 */
@Repository
public interface TaskMapper {

	public boolean insertTask(Task task);
	
	public List<Task> selectTasks();
	
	public Task getTask(int taskId);
}
