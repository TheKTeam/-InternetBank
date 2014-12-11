package BuisnesLogikLayer;

import java.util.Enumeration;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import com.sun.org.apache.xpath.internal.operations.String;

public class Credit implements IAcount {

	float creditSume = 0;
	float depositSume = 0;
	float savingsAcountSume = 0;
	static float percent = (float) 0.15;
	String str;
	Enumeration<String> names;
	private static float[] arrays;

	//open new credit
	public boolean open(Hashtable credit, Hashtable deposit,
			Hashtable savingsAcount) {
		// check the amount of credits
		names = credit.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			creditSume -= (float) credit.get(str);
		}
		// check the amount of deposits
		names = deposit.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			depositSume += (float) credit.get(str);
		}
		// check the amount of savingsAcouns
		names = savingsAcount.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			savingsAcountSume += (float) credit.get(str);
		}
		// if the number of credits+deposits+savings accounts <10 and sum of
		// credits is not greater than the sum of deposits+savings accounts to
		// 1.5 times, that allow create credit
		if (credit.size() + deposit.size() + savingsAcount.size() < 10
				&& (creditSume * (-1)) / (depositSume + savingsAcountSume) < 1.5) {
			return true;
		}

		return false;
	}
	
	//closing of credit
	public boolean close(float money) {
		if (money == 0) {
			return true;
		}
		return false;
	}

	public float moneyCome(float money, float moneyCome) {
		money += moneyCome;
		return money;
	}

	public float moneyGone(float money, float moneyGone) {
		money -= moneyGone;
		return money;
	}

	public float calculatinPercent(float money) {
		money += money * percent;
		return money;
	}

	public float[] transferMoney(float money1, float money2, float change) {
		money1 -= change;
		money2 += change;
		arrays = null;
		arrays[0] = money1;
		arrays[1] = money2;
		return arrays;
	}
}