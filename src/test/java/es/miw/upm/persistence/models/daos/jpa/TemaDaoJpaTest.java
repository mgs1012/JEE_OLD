package es.miw.upm.persistence.models.daos.jpa;

import es.miw.upm.persistence.models.daos.TemaDao;
import es.miw.upm.persistence.models.entities.TemaE;

public class TemaDaoJpaTest {
	
    private TemaDao dao;

    private TemaE tema;
    
    

   /* @BeforeClass
    public static void beforeClass() {
        DaoFactory.setFactory(new DaoJdbcFactory());
        DaoJdbcFactory.dropAndCreateTables();
    }

    @Before
    public void before() {
        this.tema = new User("tema", "pass", new Address("city", "street"));
        this.tema.setCategory(new Category(666, "666", "666"));
        dao = DaoFactory.getFactory().getUserDao();
        dao.create(tema);
    }


	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
    @Test
    public void testRead() {
        assertEquals(user, dao.read(user.getId()));
    }

    @Test
    public void testUpdateCategory() {
    	tema.setName("other");
    	tema.setPassword("other");
    	tema.getAddress().setCity("other");
    	tema.getAddress().setStreet("other");
    	tema.getCategory().setName("other");
        dao.update(tema);
        assertEquals(tema, dao.read(tema.getId()));
    }

    @Test
    public void testDeleteByID() {
        dao.deleteById(tema.getId());
        assertNull(dao.read(tema.getId()));
        assertNull(DaoFactory.getFactory().getCategoryDao().read(tema.getCategory().getId()));
    }

    @Test
    public void testFindAll() {
        this.user = new User("user", "pass", new Address("city", "street"));
        this.user.setCategory(new Category(333, "333", "333"));
        dao = DaoFactory.getFactory().getUserDao();
        dao.create(user);
        assertEquals(2, dao.findAll().size());
    }

    @After
    public void after() {
        DaoJdbcFactory.dropAndCreateTables();
    } */


}
