package BuisnesLogikLayer;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class Deposit implements IAcount {
	static float percent = (float) 0.15;
	private static float[] arrays;

	public boolean open(Hashtable credit, Hashtable deposit,
			Hashtable savingsAcount) {
		// if the number of credits+deposits+savings accounts <10, that allow
		// create deposit
		if (credit.size() + deposit.size() + savingsAcount.size() < 10) {
			return true;
		}
		return false;
	}

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