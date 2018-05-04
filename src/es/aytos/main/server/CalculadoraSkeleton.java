
/**
 * CalculadoraSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

/**
 * CalculadoraSkeleton java skeleton for the axisService
 */
public class CalculadoraSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param restar
	 */

	public es.aytos.main.RestarResponse restar(es.aytos.main.Restar restar) {
		es.aytos.main.RestarResponse response = new es.aytos.main.RestarResponse();
		response.set_return(restar.getArgs0() - restar.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param multiplicacion
	 */

	public es.aytos.main.MultiplicacionResponse multiplicacion(es.aytos.main.Multiplicacion multiplicacion) {
		es.aytos.main.MultiplicacionResponse response = new es.aytos.main.MultiplicacionResponse();
		response.set_return(multiplicacion.getArgs0() * multiplicacion.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param division
	 */

	public es.aytos.main.DivisionResponse division(es.aytos.main.Division division) {
		es.aytos.main.DivisionResponse response = new es.aytos.main.DivisionResponse();
		response.set_return(division.getArgs0() / division.getArgs1());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param sumar
	 */

	public es.aytos.main.SumarResponse sumar(es.aytos.main.Sumar sumar) {
		es.aytos.main.SumarResponse response = new es.aytos.main.SumarResponse();
		response.set_return(sumar.getArgs0() + sumar.getArgs1());
		return response;
	}

}
