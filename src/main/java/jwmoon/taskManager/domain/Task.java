package jwmoon.taskManager.domain;

public class Task {

	private String category1;
	
	private String category2;
	
	private String category3;
	
	private String taskDesc;
	
	private int priority;
	
	private int origEst;
	
	private int currEst;
	
	private int elapsed;
	
	private int remain;

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getCategory3() {
		return category3;
	}

	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getOrigEst() {
		return origEst;
	}

	public void setOrigEst(int origEst) {
		this.origEst = origEst;
	}

	public int getCurrEst() {
		return currEst;
	}

	public void setCurrEst(int currEst) {
		this.currEst = currEst;
	}

	public int getElapsed() {
		return elapsed;
	}

	public void setElapsed(int elapsed) {
		this.elapsed = elapsed;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	
	
	
}
