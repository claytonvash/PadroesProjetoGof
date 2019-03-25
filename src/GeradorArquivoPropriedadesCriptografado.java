import java.util.Map;

public class GeradorArquivoPropriedadesCriptografado {
	public byte[]processaPropriedadesCriptografado(Map<String,Object> propriedades){
		String conteudo = geraConteudoPropriedades(propriedades);
		return processaCriptografado(conteudo.getBytes());
	}
public class GeradorArquivoPropriedadesCriptografado extends GeradorArquivo {

	private String geraConteudoPropriedades(Map<String,Object> propriedades) {
	@Override
	protected String gerarConteudo(Map<String,Object> propriedades) {
		//responsável por gerar properties
				StringBuilder propFileBuilder = new StringBuilder();
				for (String prop: propriedades.keySet()) {
					propFileBuilder.append(prop+"m"+propriedades.get(prop)+"\n");
				}
				return propFileBuilder.toString();
	}

	private byte[] processaCriptografado(byte[] bytes) {
	@Override
	protected byte[] processaConteudo(byte[] bytes) {
		//responsável por criptografar
				byte[] newBytes = new byte[bytes.length];
				for (int i = 0; i<bytes.length;i++) {
					newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
				}
				return newBytes;
	}
}