package main.java.jwmoon.studyManager.domain;

public class ForeignWeeklyStudyResult extends WeeklyStudyResult {
	
	private int en_cnt;
	private int jp_cnt;
	private int sp_cnt;
	private int fr_cnt;
	private int de_cnt;
	private int sum_cnt;
	
	public int getSum_cnt() {
		return sum_cnt;
	}
	public void setSum_cnt(int sum_cnt) {
		this.sum_cnt = sum_cnt;
	}
	public int getEn_cnt() {
		return en_cnt;
	}
	public void setEn_cnt(int en_cnt) {
		this.en_cnt = en_cnt;
	}
	public int getJp_cnt() {
		return jp_cnt;
	}
	public void setJp_cnt(int jp_cnt) {
		this.jp_cnt = jp_cnt;
	}
	public int getSp_cnt() {
		return sp_cnt;
	}
	public void setSp_cnt(int sp_cnt) {
		this.sp_cnt = sp_cnt;
	}
	public int getFr_cnt() {
		return fr_cnt;
	}
	public void setFr_cnt(int fr_cnt) {
		this.fr_cnt = fr_cnt;
	}
	public int getDe_cnt() {
		return de_cnt;
	}
	public void setDe_cnt(int de_cnt) {
		this.de_cnt = de_cnt;
	}
	
	
}
