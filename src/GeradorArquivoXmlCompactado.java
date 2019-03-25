import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorArquivoXmlCompactado {
	public byte[] processaXmlCompactado(Map<String,Object> propriedades) throws IOException {
		String conteudo = geraConteudoXml(propriedades);
		return processaCompactacao(conteudo.getBytes());

	}
public class GeradorArquivoXmlCompactado extends GeradorArquivo{



	private String geraConteudoXml(Map<String,Object> propriedades) {
	@Override	
	protected String gerarConteudo(Map<String,Object> propriedades) {
		//respons�vel por gerar xml
				StringBuilder propFileBuilder = new StringBuilder();
				propFileBuilder.append("<properties>");
				for (String prop: propriedades.keySet()) {
					propFileBuilder.append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
				}
				propFileBuilder.append("</propriedades>");
				return propFileBuilder.toString();
	}




	private byte[] processaCompactacao(byte[] bytes) throws IOException {
	@Override
	protected byte[] processaConteudo(byte[] bytes) throws IOException {
		// respons�vel por compactar
				ByteArrayOutputStream byteout = new ByteArrayOutputStream();
				ZipOutputStream out = new ZipOutputStream(byteout);
				out.putNextEntry(new ZipEntry("internal"));
				out.write(bytes);
				out.closeEntry();
				out.close();
				return byteout.toByteArray();
	}
}