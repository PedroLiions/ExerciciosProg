import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	static int id = 0;
	
//	@Test
//	public void testCarregar() {
//		System.out.println("carregar");
//		pais = new Pais(1, "", 0, 0);
//		copia = new Pais(1, "China", 1372470000, 9596961);
//		pais.carregar();
//		System.out.println(pais + "\n" + copia);
//		assertEquals("testa carregar", pais, copia);
//	}
//
//	@Test
//	public void testCriar() {
//		System.out.println("criar");
//		pais = new Pais(id, "Holanda", 41543, 17100475.00);
//		copia = new Pais(10, "Holanda", 41543, 17100475.00);
//		pais.criar();
//		System.out.println(pais + "\n" + copia);
//		assertEquals("testa criacao", pais, copia);
//	}
//	
//	@Test
//	public void testAtualizar() {
//		System.out.println("atualizar");
//		pais = new Pais(1, "", 0, 0);
//		pais.carregar();
//		pais.setPopulacao(25000);
//		pais.atualizar();
//		copia = new Pais(1, "", 0, 0);
//		copia.carregar();
//		copia.setPopulacao(25000);
//		copia.atualizar();
//		System.out.println(pais + "\n" + copia);
//		assertEquals("testa atualizacao", pais, copia);
//	}
//	
//	@Test
//	public void testExcluir() {
//		System.out.println("excluir");
//		pais = new Pais(1, "", 0, 0);
//		pais.excluir();
//		copia = new Pais(1, "", 0, 0);
//		copia.setId(-1);
//		copia.setNome(null);
//		copia.setPopulacao(0);
//		copia.setArea(0);
//		pais.carregar();
//		System.out.println(pais + "\n" + copia);
//		assertEquals("testa exclusao", pais, copia);
//	}
	
//	@Test
//	public void testeMaiorPopulacao() {
//		pais = new Pais();
//		pais.getMaiorPopulacao();
//		copia = new Pais(1, "", 0, 0);
//		copia.carregar();
//		System.out.println(pais + "\n" + copia);
//		assertEquals("testa maior populacao", pais, copia);
//	}
	
	@Test
	public void testeMenorArea() {
		pais = new Pais();
		pais.getMenorArea();
		copia = new Pais(4, "", 0, 0);
		copia.carregar();
		System.out.println(pais + "\n" + copia);
		assertEquals("testa menor area", pais, copia);
	}
}
