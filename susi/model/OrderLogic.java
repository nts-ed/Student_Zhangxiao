package susi.model;

public class OrderLogic {
	public void execute(Order order) {
		String[] names = order.getCounts();
		String[] counts = order.getCounts();
		int countTotal = 0;
		String msg="";
		
		for(int i= 0;i<names.length;i++) {
			int count = Integer.valueOf(counts[i]);
			if(count>0) {
				countTotal +=count;
				msg+=String.format("%sが%d皿", names[i],count);
			}
		}
		order.setTotalCount(countTotal);
		order.setTotalFee(countTotal*110);
		order.setMsg(msg);
	}

}
