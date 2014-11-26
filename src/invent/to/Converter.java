package invent.to;

public class Converter {

	public static Long convert(Long key) {
		String abatrackHexa = Long.toHexString(key);

		int abaLength = abatrackHexa.length();
		String abatrackLast4 = abatrackHexa.substring(abaLength - 4);
		String abatrackRest = abatrackHexa.substring(abaLength - 6, abaLength - 4);

		Long wiegandBegin = Long.parseLong(abatrackRest, 16);
		Long wiegandEnd = Long.parseLong(abatrackLast4, 16);
		
		String wiegandString = wiegandBegin.toString() + wiegandEnd.toString();

		return Long.parseLong(wiegandString);
	}
}
