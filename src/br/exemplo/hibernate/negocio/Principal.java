package br.exemplo.hibernate.negocio;

import com.exemplo.hibernate.model.dao.BaseDAO;
import com.exemplo.hibernate.model.entity.RegistroEntity;

public class Principal {

	
	public static void main(String[] args) {
		BaseDAO baseDAO = new BaseDAO();
		
		RegistroEntity registro = new RegistroEntity();
		registro.setNome("Registro Dois");
		
		baseDAO.save(registro);
		
		
		System.out.println("Registro Salvo.");
	}
}
