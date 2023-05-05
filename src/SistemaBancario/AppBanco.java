package SistemaBancario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AppBanco {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DESENVOLVIMENTO");
	public static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

	}
}