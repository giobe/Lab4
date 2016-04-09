package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParolaDAO {
	
	public String read(String parola){
		Connection con = DBConnect.getConnection();
		
		try {
			Statement st = con.createStatement();
			String sql = "select nome from parola where nome=\""+parola+"\"";
		    ResultSet res= st.executeQuery(sql);
		    
		    if(res.next()){
		    	return res.getString("nome");
		    }else{
		    	return null;
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
