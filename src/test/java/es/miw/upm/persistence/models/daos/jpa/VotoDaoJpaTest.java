package es.miw.upm.persistence.models.daos.jpa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import es.miw.upm.persistence.models.dao.jpa.DaoJpaFactory;
import es.miw.upm.persistence.models.daos.DaoFactory;
import es.miw.upm.persistence.models.daos.TemaDao;
import es.miw.upm.persistence.models.daos.VotoDao;
import es.miw.upm.persistence.models.entities.TemaE;
import es.miw.upm.persistence.models.entities.VotoE;
import es.miw.upm.persistence.models.utils.NivelEstudios;

public class VotoDaoJpaTest {
	
	private VotoDao votodao;

    private VotoE voto;
    
    @Before
    public void before(){
    	
        //Inicializar DAO
    	DaoFactory.setFactory(new DaoJpaFactory());
    	votodao = DaoFactory.getFactory().getVotoDao();
        
    }
    

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
