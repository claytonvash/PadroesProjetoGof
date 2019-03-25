mapa.put("nome", "Clayton");
		mapa.put("idade", 38);

		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa, "PROPRIEDADES_CRIPTOGRAFADO");
		GeradorArquivo gerador = new GeradorArquivoPropriedadesCriptografado();
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);

		GeradorArquivo gerador1 = new GeradorArquivo();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa, "XML_COMPACTADO");		
		GeradorArquivo gerador1 = new GeradorArquivoXmlCompactado();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);	

	}

}