package search.switchboard;

/**
 * Created by shinkook_mac on 2017. 7. 9..
 */
public class Switchboard {
	public int[] cache;

	public Switchboard() {
		//int 는 32bit 이기 때문에
		cache = new int[(10 * 1000 * 1000) / 32];
	}

	public void store(String phoneNumber) {
		int phoneInt = Integer.parseInt(phoneNumber);
		int arrayIndex = phoneInt / 32;
		int byteIndex = phoneInt % 32;
		cache[arrayIndex] = cache[arrayIndex] | (1 << byteIndex);
	}

	public boolean exit(String phoneNumber) {
		int phoneInt = Integer.parseInt(phoneNumber);
		int arrayIndex = phoneInt / 32;
		int byteIndex = phoneInt % 32;
		return (cache[arrayIndex] & (1 << byteIndex)) != 0;
	}
}

