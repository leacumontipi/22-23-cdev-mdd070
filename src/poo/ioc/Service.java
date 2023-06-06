package poo.ioc;

public class Service {

    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public void initUtilisateurAdmin() {
        dao.saveUtilisateur("admin", "admin");
    }
}
