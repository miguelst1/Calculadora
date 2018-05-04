package es.aytos.example;

import es.aytos.main.client.CalculadoraStub;
import es.aytos.main.client.CalculadoraStub.Division;
import es.aytos.main.client.CalculadoraStub.DivisionResponse;
import es.aytos.main.client.CalculadoraStub.Multiplicacion;
import es.aytos.main.client.CalculadoraStub.MultiplicacionResponse;
import es.aytos.main.client.CalculadoraStub.Restar;
import es.aytos.main.client.CalculadoraStub.RestarResponse;
import es.aytos.main.client.CalculadoraStub.Sumar;
import es.aytos.main.client.CalculadoraStub.SumarResponse;

public class Main {
	public static void main(String[] args) throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Sumar operacion = new Sumar();
		SumarResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(100);
		operacion.setArgs1(200);
		// Invocamos el WS
		response = stub.sumar(operacion);
		// Mostramos el resultado
		System.out.println(response.get_return());

		Restar operacion1 = new Restar();
		RestarResponse response1 = null;
		// Establecemos los parámetros de la operación
		operacion1.setArgs0(200);
		operacion1.setArgs1(100);
		// Invocamos el WS
		response1 = stub.restar(operacion1);
		// Mostramos el resultado
		System.out.println(response1.get_return());

		Multiplicacion operacion2 = new Multiplicacion();
		MultiplicacionResponse response2 = null;
		// Establecemos los parámetros de la operación
		operacion2.setArgs0(3);
		operacion2.setArgs1(2);
		// Invocamos el WS
		response2 = stub.multiplicacion(operacion2);
		// Mostramos el resultado
		System.out.println(response2.get_return());

		Division operacion3 = new Division();
		DivisionResponse response3 = null;
		// Establecemos los parámetros de la operación
		operacion3.setArgs0(200);
		operacion3.setArgs1(200);
		// Invocamos el WS
		response3 = stub.division(operacion3);
		// Mostramos el resultado
		System.out.println(response3.get_return());
	}
}
