import java.util.ArrayList;

public class lunch {
	static int[] price = {6,11,15}; //3楼面 noodle = 6,二楼一荤一素 = 11,煲仔饭 = 15;
	static int PRICE_PERMONTH = 200;//每个月饭钱
	static int DATE_PERMONTH = 23;//想吃多少天

	
	static int remainingPrice = 130;//剩余卡钱
	static int remainingDate = 10;//剩余天数
	static int wucha = 1;//误差
//	static ArrayList<Object> arraylist = new ArrayList<Object>();
	
	
	public static void main(String[] args) {
		
//		printList(remainingDate,remainingPrice);
		printList(DATE_PERMONTH,PRICE_PERMONTH);
		
	}
	
	
	public static void printList(int remainingDate,int remainingPrice) {
		System.out.println("6块的面"+"\t"+"11块的饭"+"\t"+"15的套餐"+"\t"+"可吃天数"+"\t"+"剩余饭钱");
		for(int x=0,y=0,z=0;x*price[0]+y*price[1]+z*price[2]<remainingPrice;x++,y=0,z=0) {
			for(;x*price[0]+y*price[1]+z*price[2]<remainingPrice;y++,z=0) {
				for(;x*price[0]+y*price[1]+z*price[2]<remainingPrice;z++) {
					if((Math.abs((x+y+z)-remainingDate))<=wucha) {
						String resultString = x+"\t"+y+"\t"+z+"\t"+(x+y+z)+"\t"+(remainingPrice-x*price[0]-y*price[1]-z*price[2]);
//						arraylist.add(resultString);
						System.out.println(resultString);
					}
				}
				
			}
			
		}
	}
}
