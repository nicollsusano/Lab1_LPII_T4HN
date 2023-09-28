package controllers;
import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
		
		SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		// Registro de Empleado
		public String createEmpleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		
		try {
			
			Empleado empleado = new Empleado(apellidos, nombres, edad, sexo, salario);
			
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Empleado creado";
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		return "Error al registrar empleado";
		
	
	}
		
		// Eliminar Empleado
		public String deleteEmpleado(int idempleado) {
		
		try {
				
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class,idempleado);
			session.delete(empleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Empleado eliminado Correctamente";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Error al Eliminar Empleado";
	}
		
		// Actualizar Empleado
		public String UpdateEmpleado(int idempleado,String apellidos,String nombres) {
			
		try {
			
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class,idempleado);			
			empleado.setApellidos(apellidos);
			empleado.setNombres(nombres);			
			session.update(empleado);
			session.getTransaction().commit();			
			sessionFactory.close();
			
			return "Empleado actualizado Correctamente";
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return "Error al actualizar Empleado";
	}
		
		// Lectura o Leer Empleado
		public String getEmpleado(int idempleado) {
			
		try {
				
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class,idempleado);
			session.getTransaction().commit();
			sessionFactory.close();
				
		    return "Empleado Encontrado";
				
		}
		catch(Exception e) {
			
				e.printStackTrace();
				
		}
			
			return "Empleado no Encontrado";
	}
		

}


