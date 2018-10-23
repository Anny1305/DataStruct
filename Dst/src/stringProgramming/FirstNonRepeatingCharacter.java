package stringProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	private static int firstNonRepeat(String inputString) {
		char[] ch = inputString.toCharArray();
		int outCh = -1;
		Map<Character, Integer> mp = new LinkedHashMap();
		for (int i = 0; i < ch.length; i++) {
			if (mp.containsKey(ch[i]) == true)
				mp.put(ch[i], mp.get(ch[i]) + 1);
			else
				mp.put(ch[i], 1);
		}
		System.out.println(mp);

		for (Map.Entry<Character, Integer> m : mp.entrySet()) {
			if (m.getValue() == 1) {
				outCh = m.getKey();
				break;
			}
		}
		return outCh;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();

		int output = firstNonRepeat(inputString);

		if (output == -1)
			System.out.println(output);
		else
			System.out.println((char) output);

	}

}
