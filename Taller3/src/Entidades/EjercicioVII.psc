
// 7.	El parqueadero "El guardi�n" presta sus servicios de parqueadero nocturno para los 
// usuarios del barrio y requiere una aplicaci�n que permita registrar los veh�culos que se 
// cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del 
// veh�culo como son, placa y marca, y los datos del cliente como son nombre completo y n�mero 
// de tel�fono. Para cada veh�culo se debe permitir la opci�n de ingresar al parqueadero, 
// retirar del parqueadero y consultar si un veh�culo se encuentra en el parqueadero. 
// Recuerde que el sistema debe terminar cuando el usuario as� lo indique. 
// Tenga en presente que el parqueadero solo puede almacenar m�ximo 5 veh�culos.


Proceso EjercicioVII
	
	Definir placai, marcai, nombrei, telefonoi, placaii, marcaii, nombreii, telefonoii, placaiii, marcaiii, nombreiii, telefonoiii, placaiv, marcaiv, nombreiv, telefonoiv, placav, marcav, nombrev, telefonov  Como Caracter;
	Definir placabuscar, retiroi, retiroii, retiroiii,retiroiv, retirov, busquedai, busquedaii, busquedaiii, busquedaiv, busquedav Como Caracter;

	Definir opcionMenu, opcionIngresar Como Entero;
	Definir i Como Entero;
	
	Repetir
		Escribir "";
		Escribir "                Parqueadero El Guardian  ";
		Escribir "Seleccione la opcion a realizar";
		Escribir " 1. Ingresar vehiculo";
		Escribir " 2. Retirar vehiculo";
		Escribir " 3. Consultar vehiculo";
		Escribir " 4. Salir del sistema";
		
		Leer opcionMenu;
		
		segun opcionMenu Hacer
			
			1:
				
				Para i<-0 Hasta 4 Con Paso 1 Hacer
					si (i = 0) Entonces
						Escribir "Por favor, diligencie la siguiente informaci�n: ";
						Escribir " ";
							Escribir "             Vehiculo 1 ";
							Escribir "Placa del vehiculo: ";
							leer placai;
							Escribir "Marca del vehiculo";
							Leer marcai;
							Escribir "Nombre del propietario: ";
							Leer nombrei;
							Escribir "Telefono: ";
							Leer telefonoi;
						FinSi
						
						si (i = 1) Entonces
							Escribir "             Vehiculo 2 ";
							Escribir "Placa del vehiculo: ";
							leer placaii;
							Escribir "Marca del vehiculo";
							Leer marcaii;
							Escribir "Nombre del propietario: ";
							Leer nombreii;
							Escribir "Telefono: ";
							Leer telefonoii;
						FinSi
						
						si (i = 2) Entonces
							Escribir "             Vehiculo 3 ";
							Escribir "Placa del vehiculo: ";
							leer placaiii;
							Escribir "Marca del vehiculo";
							Leer marcaiii;
							Escribir "Nombre del propietario: ";
							Leer nombreiii;
							Escribir "Telefono: ";
							Leer telefonoiii;
						FinSi
						
						si (i = 3) Entonces
							Escribir "             Vehiculo 4 ";
							Escribir "Placa del vehiculo: ";
							leer placaiv;
							Escribir "Marca del vehiculo";
							Leer marcaiv;
							Escribir "Nombre del propietario: ";
							Leer nombreiv;
							Escribir "Telefono: ";
							Leer telefonoiv;
						FinSi
						
						si (i = 4) Entonces
							Escribir "             Vehiculo 5 ";
							Escribir "Placa del vehiculo: ";
							leer placav;
							Escribir "Marca del vehiculo";
							Leer marcav;
							Escribir "Nombre del propietario: ";
							Leer nombrev;
							Escribir "Telefono: ";
							Leer telefonov;
						FinSi
						Escribir " ";
					FinPara
			2:
				Escribir "Escriba la placa del vehiculo a retirar";
				Leer placabuscar;
				
					si (placabuscar <> placai y placabuscar <> placaii y placabuscar <> placaiii y placabuscar <> placaiv y placabuscar <> placav) Entonces
						Escribir "El vehiculo no se encuetra en el parqueadero ";
					FinSi
				
					si placabuscar = placai Entonces
						Escribir "";
						Escribir "Se retirar� el siguiente vehiculo ";
						Escribir "Placa: ", placai, "  Marca: ",marcai,"  Propietario: ", nombrei,"  Telefono: ", telefonoi;
						placai<-"";
						marcai<-"";
						nombrei<-"";
						telefonoi<-"";
						Escribir "Vehiculo retirado"; 
					FinSi
					
					si placabuscar = placaii Entonces
						Escribir "";
						Escribir "Se retirar� el siguiente vehiculo ";
						Escribir "Placa: ", placaii, "  Marca: ",marcaii,"  Propietario: ", nombreii,"  Telefono: ", telefonoii;
						placaii<-"";
						marcaii<-"";
						nombreii<-"";
						telefonoii<-"";
						Escribir "Vehiculo retirado"; 
					FinSi
					
					si placabuscar = placaiii Entonces
						Escribir "";
						Escribir "Se retirar� el siguiente vehiculo ";
						Escribir "Placa: ", placaiii, "  Marca: ",marcaiii,"  Propietario: ", nombreiii,"  Telefono: ", telefonoiii;
						placaiii<-"";
						marcaiii<-"";
						nombreiii<-"";
						telefonoiii<-"";
						Escribir "Vehiculo retirado"; 
					FinSi
					
					si placabuscar = placaiv Entonces
						Escribir "";
						Escribir "Se retirar� el siguiente vehiculo ";
						Escribir "Placa: ", placaiv, "  Marca: ",marcaiv,"  Propietario: ", nombreiv,"  Telefono: ", telefonoiv;
						placaiv<-"";
						marcaiv<-"";
						nombreiv<-"";
						telefonoiv<-"";
						Escribir "Vehiculo retirado"; 
					FinSi
					
					si placabuscar = placav Entonces
						Escribir "";
						Escribir "Se retirar� el siguiente vehiculo ";
						Escribir "Placa: ", placav, "  Marca: ",marcav,"  Propietario: ", nombrev,"  Telefono: ", telefonov;
						placav<-"";
						marcav<-"";
						nombrev<-"";
						telefonov<-"";
						Escribir "Vehiculo retirado"; 
					FinSi
				
			3:
					Escribir "Escriba la placa del vehiculo a consultar: ";
					Leer placabuscar;
				
					si (placabuscar <> placai y placabuscar <> placaii y placabuscar <> placaiii y placabuscar <> placaiv y placabuscar <> placav) Entonces
						Escribir "";
						Escribir "El vehiculo no se encuetra en el parqueadero ";
					FinSi
					
					si placabuscar = placai Entonces
						Escribir "  Informacion del vehiculo cosultado ";
						Escribir "Placa: ", placai, "  Marca: ",marcai,"  Propietario: ", nombrei,"  Telefono: ", telefonoi;
					FinSi
					
					si placabuscar = placaii Entonces
						Escribir "  Informacion del vehiculo cosultado ";
						Escribir "Placa: ", placaii, "  Marca: ",marcaii,"  Propietario: ", nombreii,"  Telefono: ", telefonoii;
					FinSi
					
					si placabuscar = placaiii Entonces
						Escribir "  Informacion del vehiculo cosultado ";
						Escribir "Placa: ", placaiii, "  Marca: ",marcaiii,"  Propietario: ", nombreiii,"  Telefono: ", telefonoiii;
					FinSi
					
					si placabuscar = placaiv Entonces
						Escribir "  Informacion del vehiculo cosultado ";
						Escribir "Placa: ", placaiv, "  Marca: ",marcaiv,"  Propietario: ", nombreiv,"  Telefono: ", telefonoiv;
					FinSi
					
					si placabuscar = placav Entonces
						Escribir "  Informacion del vehiculo cosultado ";
						Escribir "Placa: ", placav, "  Marca: ",marcav,"  Propietario: ", nombrev,"  Telefono: ", telefonov;
					FinSi
					
		FinSegun
	Hasta Que opcionMenu=4

	Escribir "";
	Escribir "                  Vuelva pronto";
FinProceso
