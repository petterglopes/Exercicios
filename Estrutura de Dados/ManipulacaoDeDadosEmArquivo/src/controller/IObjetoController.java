package controller;

import java.io.IOException;
import java.math.BigInteger;

public interface IObjetoController {
	public void create(String path, String arquivo)throws IOException;
	public void read(String path, String arquivo)throws IOException;
	public void update(Producao producao, String path, String arquivo)throws IOException;
	public void delete(BigInteger id, String path, String arquivo)throws IOException;

}
