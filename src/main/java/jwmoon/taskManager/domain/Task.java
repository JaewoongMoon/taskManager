package jwmoon.taskManager.domain;

public class Task {

	private Integer taskId;
	
	private String category1;
	
	private String category2;
	
	private String category3;
	
	private String taskDesc;
	
	private int priority;
	
	private Double origEst;
	
	private Double currEst;
	
	private Double elapsed;
	
	private Double remain;

	public Task(String cate1, String cate2, String cate3, String taskDesc, int priority, Double origEst, Double currEst, Double elapsed, Double remain) {
		this.category1 = cate1;
		this.category2 = cate2;
		this.category3 = cate3;
		this.taskDesc = taskDesc;
		this.priority = priority;
		this.origEst = origEst;
		this.currEst = currEst;
		this.elapsed = elapsed;
		this.remain = remain;
	}
	
	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

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


	public Double getOrigEst() {
		return origEst;
	}


	public void setOrigEst(Double origEst) {
		this.origEst = origEst;
	}


	public Double getCurrEst() {
		return currEst;
	}


	public void setCurrEst(Double currEst) {
		this.currEst = currEst;
	}


	public Double getElapsed() {
		return elapsed;
	}


	public void setElapsed(Double elapsed) {
		this.elapsed = elapsed;
	}


	public Double getRemain() {
		return remain;
	}


	public void setRemain(Double remain) {
		this.remain = remain;
	}

	
	
	
	
	
}
