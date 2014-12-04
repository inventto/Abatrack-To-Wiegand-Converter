package invent.to;

import java.util.HashMap;
import java.util.Map;

public class Test {

	static Map<Long, Long> chaves = new HashMap<Long, Long>();

	public static void main(String[] args) {
		realizarTeste();
	}

	private static void realizarTeste() {
		popularHash();
		boolean passou = true;
		for (Long key : chaves.keySet()) {
			if (!WiegandConverter.convert(key).equals(chaves.get(key))) {
				System.out.println("Erro na chave: " + key);
				passou = false;
			}
		}
		if (passou)
			System.out.println("Passou no teste");
		else
			System.out.println("Nao passou no teste");
	}

	public static void popularHash() {
		chaves.put(2502291L, 3811923L);
		chaves.put(3558443L, 5419499L);
		chaves.put(2511530L, 3821162L);
		chaves.put(3581735L, 5442791L);
		chaves.put(2514504L, 3824136L);
		chaves.put(2486000L, 3761168L);
		chaves.put(3786178L, 5750626L);
		chaves.put(2498456L, 3808088L);
		chaves.put(2495078L, 3804710L);
		chaves.put(3572904L, 5433960L);
		chaves.put(7090990L, 10813102L);
		chaves.put(2268198L, 3439974L);
		chaves.put(25100471L, 12700183L);
		chaves.put(25100471L, 12700183L);
		chaves.put(436414L, 643198L);
	}
}
