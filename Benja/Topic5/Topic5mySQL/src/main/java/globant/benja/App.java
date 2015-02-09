package globant.benja;

import java.sql.SQLException;

import globant.benja.persistencia.DBAccess;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	DBAccess dao = new DBAccess();
    	dao.conectar();
    	dao.listarCurso();
    	
    	dao.listarCurso(2);
    }
}
