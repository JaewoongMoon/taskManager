package jwmoon.taskManager.dao;

import org.springframework.stereotype.Repository;

import jwmoon.taskManager.domain.Task;

/**
 * TaskDao
 * 
 * @author jwmoon
 */
@Repository
public interface TaskDao {

	public boolean insertTask(Task task);
}
