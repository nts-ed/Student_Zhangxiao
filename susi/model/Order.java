package susi.model;

import java.io.Serializable;

public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] names = {"まぐろ","サーモン","エビ","タコ","イカ","いくら"};//メニュー
	private String[] counts;//それぞれの個数
	private int totalCount;//合計
	private int totalFee;//合計金額
	private String msg;//注文情報
	public Order() {
		this.counts=new String[names.length];
		for(int i=0;i<this.counts.length;i++) {
			this.counts[i]="0";
		}
	}
	/**
	 * @return the names
	 */
	public String[] getNames() {
		return names;
	}
	/**
	 * @param names the names to set
	 */
	public void setNames(String[] names) {
		this.names = names;
	}
	/**
	 * @return the counts
	 */
	public String[] getCounts() {
		return counts;
	}
	/**
	 * @param counts the counts to set
	 */
	public void setCounts(String[] counts) {
		this.counts = counts;
	}
	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the totalFee
	 */
	public int getTotalFee() {
		return totalFee;
	}
	/**
	 * @param totalFee the totalFee to set
	 */
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
