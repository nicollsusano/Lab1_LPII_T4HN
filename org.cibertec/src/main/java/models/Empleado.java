package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	//Declaracion de Propiedades
	@Id
	@Column(name="idempleado")
	private int idempleado;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="salario")
	private Double salario;
	
	
	
	
	public Empleado() {
		
	}

	//Declaracion de un Constructor
	public Empleado(String apellidos, String nombres, int edad, String sexo, Double salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	//Declaracion de los accesos a las propiedades

	public int getIdempleado() {
		return idempleado;
	}
	
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//Declaracion del metodo para mostrar los datos
	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	

}
