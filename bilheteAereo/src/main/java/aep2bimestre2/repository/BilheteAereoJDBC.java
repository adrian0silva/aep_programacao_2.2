package aep2bimestre2.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BilheteAereoJDBC implements BilheteAereoRepository{

	public void inserir(Connection conn,BilheteAereo bilhete) throws Exception {
		String sql = "insert into voo (voo, origem, destino, data) values (?,?,?)";
		
		PreparedStatement statement = conn.prepareStatement(sql);		
		statement.setInt(1, bilhete.getVoo());
		statement.setString(2, bilhete.getOrigem());
		statement.setString(3, bilhete.getDestino());
		statement.setDate(4, (Date) bilhete.getData());
		
		statement.execute();
		statement.close();
	}

	public List<BilheteAereo> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void alterar(BilheteAereo bilhete) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(Integer voo) {
		// TODO Auto-generated method stub
		
	}

	



}
