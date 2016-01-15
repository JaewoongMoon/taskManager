package main.java.jwmoon.studyManager.domain;

public class TechnicalWeeklyStudyResult extends WeeklyStudyResult {

	private String bookName;
	private String studyDesc;
	private int pageCnt;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getStudyDesc() {
		return studyDesc;
	}
	public void setStudyDesc(String studyDesc) {
		this.studyDesc = studyDesc;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
	
	
	
}
