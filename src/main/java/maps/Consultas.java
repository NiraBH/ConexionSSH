package maps;

public class Consultas {
	
	public static final String BUSCAR_PAT_NOMBRE = "Select nom_patol From Patologias Where id_patol IN (Select id_patol from Patologias Where nom_patol = 'Queratocono');";

	public static final String BUSCAR_SINTOMA = "SELECT des_sint From Sintomas Where id_sint IN (Select id_sint From Sintomas Where id_sint)";
	
	public static final String LISTAR_PATOLOGIA = "SELECT nom_patol From Patologias Where id_patol IN (Select id_patol From Patologias Where id_patol);";
	
	public static final String BUSCAR_PAT_SINTOMA = "SELECT nom_patol FROM Patologias WHERE id_patol IN (SELECT id_patol FROM Causas WHERE id_sint = 3);";
	
	public static final String CONSULTA_SINTOMAS_POR_PATOLOGIA 
	= "SELECT des_sint FROM Sintomas WHERE id_sint IN (SELECT id_sint FROM Causas WHERE id_patol IN (SELECT id_patol FROM Patologias WHERE nom_patol = '";
	
	public static final String PATOLOGIA_ID = "SELECT * FROM Patologias WHERE id_patol = ' '";
	
}
