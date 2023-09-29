package practicas;

public class Alumno {
	
	String NumControl;
	String Nombre;
	String Grupo;
	String Ap;
	String Am;
	String Carrera;
	String Turno;
	public Alumno() {
		super();
	}
	public Alumno(String numControl, String grupo, String ap, String am, String carrera, String turno) {
		super();
		NumControl = numControl;
		Grupo = grupo;
		Ap = ap;
		Am = am;
		Carrera = carrera;
		Turno = turno;
	}
	public String getNumControl() {
		return NumControl;
	}
	public void setNumControl(String numControl) {
		NumControl = numControl;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String grupo) {
		Grupo = grupo;
	}
	public String getAp() {
		return Ap;
	}
	public void setAp(String ap) {
		Ap = ap;
	}
	public String getAm() {
		return Am;
	}
	public void setAm(String am) {
		Am = am;
	}
	public String getCarrera() {
		return Carrera;
	}
	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	public String getTurno() {
		return Turno;
	}
	public void setTurno(String turno) {
		Turno = turno;
	}
	
	public void tuString() {
		System.out.println("Numero de Control: "+NumControl);
		System.out.println("Nombre: "+Nombre);
		System.out.println("Apellido Parteno: "+Ap);
		System.out.println("Apelido Materno: "+Am);
		System.out.println("Grupo: "+Grupo);
		System.out.println("Carrera: "+Carrera);
		System.out.println("Turno: "+Turno);
		
	}
	public void setNombre(String nombre2) {
		
		
	}
	

}
