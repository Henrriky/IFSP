package br.edu.ifsp.lpl2.persistence;

import javax.persistence.EntityManager;

public class Main {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		manager.close();
	}
}
