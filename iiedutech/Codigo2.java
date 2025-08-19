import java.util.Arrays;
import java.util.TreeMap;

public class Codigo2 {
	public static void main(String[] args) {
		// Produtos e seus respectivos preços: Xuxu:4.99 ... Maçã:3.99
		TreeMap<String, Float> produtos_dict = new TreeMap<>();
		produtos_dict.put("Xuxu", 4.99f);
		produtos_dict.put("Melão", 2.99f);
		produtos_dict.put("Goiaba", 1.99f);
		produtos_dict.put("Maçã", 3.99f);

		// BubbleSort
		// for (int x = 0; x < produtos.length - 1; x++) {
		// for (int y = 1; y < produtos.length; y++) {
		// if (produtos[x].compareTo(produtos[y]) > 0) {
		// String aux = produtos[x];
		// produtos[x] = produtos[y];
		// produtos[y] = aux;
		// }
		// }
		// }

		for (String produto : produtos_dict.keySet()) {
			System.out.println(produto + ": " + produtos_dict.get(produto));
		}
	}
}

/*
 * Fazer com que o código anterior exiba os Produtos em ordem alfabética com
 * seus respectivos preços.
 */
