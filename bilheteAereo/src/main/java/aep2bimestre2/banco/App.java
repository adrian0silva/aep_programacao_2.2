package aep2bimestre2.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

import aep2bimestre2.repository.BilheteAereo;
import aep2bimestre2.repository.BilheteAereoJDBC;

public class App {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:1252/aep2bimestre",
					"postgres",
					"adriano");
			BilheteAereoJDBC bilheteAereoJDBC = new BilheteAereoJDBC();
			
			criarTabelaVoo(conn);

			Calendar calendar = Calendar.getInstance();
			calendar.set(calendar.DAY_OF_MONTH, 1);
			calendar.set(calendar.MONTH, 0);
			calendar.set(calendar.YEAR, 2019);
			bilheteAereoJDBC.inserir(conn ,new BilheteAereo(1, "Curitiba", "londrina", calendar.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim.");
	}
	public static void criarTabelaVoo(Connection conexão) throws Exception {
		String sql = "create table if not exists voo ("
				+ "voo integer not null primary key,"
				+ "origem varchar(255) not null,"
				+ "destino varchar(255) not null,"
				+ "data date not null"
				+ ")";
		
		Statement statement = conexão.createStatement();
		statement.execute(sql);
		statement.close();		
	}

}
