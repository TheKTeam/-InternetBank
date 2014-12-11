package BuisnesLogikLayer;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public interface IAcount {

	public static boolean open(Hashtable credit, Hashtable deposit,
			Hashtable savingsAcount){
		return false;
	}
	
	public static boolean close(float money){
		return false;
	}
	
	public static float calculatinPercent(float money){
		return money;	
	}
	
	public static  float moneyCome(float money, float moneyCome){
		return money;
	}
	
	public static float monayGone(float money, float moneyGone){
		return money;	
	}
	
	public static float[] transferMoney(float money1, float money2, float change){
		return null;
	}
}