package es.miw.upm.persistence.models.daos.jpa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import es.miw.upm.persistence.jpa.JpaFactory;
import es.miw.upm.persistence.models.dao.jdbc.DaoJdbcFactory;
import es.miw.upm.persistence.models.dao.jpa.DaoJpaFactory;
import es.miw.upm.persistence.models.daos.DaoFactory;
import es.miw.upm.persistence.models.daos.TemaDao;
import es.miw.upm.persistence.models.entities.TemaE;
import es.miw.upm.persistence.models.entities.VotoE;
import es.miw.upm.persistence.models.utils.NivelEstudios;

public class TemaDaoJpaTest {
	
    private TemaDao temadao;

    private TemaE tema;
    
    
    @BeforeClass
    public static void beforeClass() {
    	 //Inicializar DAO
    	DaoFactory.setFactory(new DaoJpaFactory());
    	JpaFactory.dropAndCreateTables();

    }
    
    @Before
    public void init(){
    	
    	//temadao = DaoFactory.getFactory().getTemaDao();
    	tema = new TemaE(1, "Baloncesto", "Tema dedicado a dicha actividad deportiva.", "¿Cómo valorarías tu pasión por este deporte?");
    	temadao.create(tema);
    	
    	/*       List<VotoE> votos = new ArrayList<VotoE>();
        votos.add(new VotoE(001, "138.100.152.01", NivelEstudios.MEDIOS, tema));
        votos.add(new VotoE(002, "138.100.152.02", NivelEstudios.SUPERIORES, tema));
        tema.setVotos(votos);*/
        
    }
    
    @Test
    public void testCreate() {
    	TemaE tema2 = new TemaE(2, "Fútbol", "Tema dedicado a dicha actividad deportiva.", "¿Cómo valorarías tu pasión por este deporte?");
    	temadao.create(tema2);
        assertEquals(tema2, temadao.read(tema2.getId()));
    }

	@Test
    public void testRead() {
        assertEquals(this.tema, temadao.read(tema.getId()));
    }
	
	@Test
	public void testUpdate(){
		tema.setTitulo("Lectura");
		tema.setPregunta("¿Te gusta leer?");
		temadao.update(tema);
		TemaE tema1 = temadao.read(tema.getId());
		assertEquals(tema1.getTitulo(),"Lectura");
		assertEquals(tema1.getTitulo(),"¿Te gusta leer?");
	}
	
	   @Test
	   public void testDeleteByID() {
		   TemaE t = new TemaE();
	        temadao.create(t);
	        temadao.deleteById(t.getId());
	        assertNull(temadao.read(t.getId()));
	    }
	   
	   
	   @Test
	    public void testFindAll() {
	        assertEquals(1, temadao.findAll().size());
	    }
	   
	   @After
	    public void after() {
		   JpaFactory.dropAndCreateTables();
	    } 

}
