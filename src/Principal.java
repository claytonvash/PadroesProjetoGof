import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args)throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Clayton");
		mapa.put("idade",38);

		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.text", mapa, "PROPRIEDADE_CRIPTOGRAFADO");

		GeradorArquivo gerador1 = new GeradorArquivo();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa, "XML_COMPACTADO");

	}

}