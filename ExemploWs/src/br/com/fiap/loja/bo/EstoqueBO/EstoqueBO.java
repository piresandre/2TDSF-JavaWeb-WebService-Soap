package br.com.fiap.loja.bo.EstoqueBO;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import br.com.fiap.beans.EstoqueLoja;

public class EstoqueBO {

	
	private static Logger log = Logger.getLogger(EstoqueBO.class);

	public static EstoqueLoja ConsultarProduto(int codProduto) throws AxisFault {
		// TODO Auto-generated method stub
		
		if(codProduto == 401) {
			log.debug(codProduto+" - "+ "camiseta branca");
			 return new EstoqueLoja(401, 0, "camiseta branca", 250);
		 }else if(codProduto == 402) {
			 log.debug(codProduto+" - "+ "camiseta preta");
			 return new EstoqueLoja(402, 0, "camiseta preta", 250);
		 }else if (codProduto == 403) {
			 log.debug(codProduto+" - "+ "camiseta rose");
			 return new EstoqueLoja(403, 0, "camiseta rosa", 250); 
		 }else {
			 log.error(codProduto+" - "+ "produto nao encontrado");
			 throw new AxisFault("Produto n�o encontrado");
		 }	
	}	
}
