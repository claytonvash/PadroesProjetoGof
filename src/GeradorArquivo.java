

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorArquivo {
public abstract class GeradorArquivo {

	public final void gerarArquivo(String nome, Map<String,Object> propriedades, String tipo) throws IOException {
		byte[] bytes = null;
	public final void gerarArquivo(String nome, Map<String,Object> propriedades) throws IOException {
	
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes= processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}

	protected abstract String gerarConteudo(Map<String,Object> propriedades);


	protected byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}

}