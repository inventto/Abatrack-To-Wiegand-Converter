package invent.to;

public class Converter {

	public static Long convert(Long key) {
		String abatrackHexa = Long.toHexString(key);

		int abaLength = abatrackHexa.length();
		String abatrackLast4 = abatrackHexa.substring(abaLength - 4);
		String abatrackRest = abatrackHexa.substring(abaLength - 6, abaLength - 4);

		int numberOfZeros = 0;

		for (int i = 0; i < abatrackLast4.length(); i++) {
			if (abatrackLast4.charAt(i) == '0') {
				numberOfZeros++;
			} else {
				break;
			}
		}
		System.out.println(numberOfZeros);

		Long wiegandEnd = Long.parseLong(abatrackLast4, 16);
		if (wiegandEnd.toString().length() < 5 && numberOfZeros == 0) {
			numberOfZeros += 5 - wiegandEnd.toString().length();
		}
		Long wiegandBegin = Long.parseLong(abatrackRest, 16);
		String wiegandEndZeros = "";
		for (int i = 0; i < numberOfZeros; i++) {
			wiegandEndZeros += "0";
		}

		String wiegandString = wiegandBegin.toString() + wiegandEndZeros + wiegandEnd.toString();

		return Long.parseLong(wiegandString);
	}
}
