package conexionssh;

import java.util.Scanner;

public class MenuPatologias {

	public static int MostrarMenu(){
		int opcionMenu = 0;
		Scanner scan = new Scanner(System.in);
		
		while (opcionMenu !=5)
	
	{
		System.out.println("1.Buscar patologias por nombre");
		System.out.println("2.Buscar sintomas por nombre");
		System.out.println("3.Listar patologias");
		System.out.println("4.Buscar lista patologia por sintomas");

		opcionMenu = scan.nextInt();
		
		
	}
		return opcionMenu;
	}	
		public static void RealizarConsultas(int opcionMenu) throws Throwable{
	
			
			
		switch (opcionMenu) {
		case 1:
		  Conexion.conexion_base(Consultas.BUSCAR_PAT_NOMBRE);
		break;
		case 2:
			Conexion.conexion_base(Consultas.BUSCAR_SINTOMA); 
		break;
		case 3:
		Conexion.conexion_base(Consultas.LISTAR_PATOLOGIA);
		break;
		case 4:
		Conexion.conexion_base(Consultas.BUSCAR_PAT_SINTOMA);
		break;
		default:
		System.out.println("Se ha introducido un numero erroneo, prueba otra vez");
		break;
		}
		
		
	
	}
}
