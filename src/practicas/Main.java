package practicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static final String Ap = null;

	private static final String Am = null;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int opcion = 0;

		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

		do {

			System.out.println("1. agregar alumno");

			System.out.println("2. ver alumnos");

			System.out.println("3. salir");

			opcion = in.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Numero de control");

				String NumControl = in.nextLine();

				System.out.println("Nombre ");

				String Nombre = in.nextLine();

				System.out.println("Ap");

				String ap = in.nextLine();

				System.out.println("Am");

				String am = in.nextLine();

				System.out.println("grupo");

				String grupo = in.nextLine();

				System.out.println("carrera");

				String carrera = in.nextLine();

				System.out.println("turno");

				String turno = in.nextLine();

				Alumno x = new Alumno();

				x.setNumControl(NumControl);

				x.setNombre(Nombre);

				x.setAp(Ap);

				x.setAm(Am);

				x.setGrupo(grupo);

				x.setCarrera(carrera);

				x.setTurno(turno);

				listaAlumnos.add(x);

				break;

			case 2:

				System.out.println("NUMCON\tNOMBRE\t\t\tGRUPO\tCARRERA\tTURNO");

				for (Alumno a : listaAlumnos) {

					a.tuString();

				}

				break;
			case 3:
				System.out.println("ADIOS");
				default:
					System.out.println("ERROR");
					break;
					
					

			}

		} while (opcion != 3);

	}

}
