package ec.edu.upse.tics.s2021_1.poo.pokemon.execution;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import ec.edu.upse.tics.s2021_1.poo.pokemon.model.Pokemon;
import ec.edu.upse.tics.s2021_1.poo.pokemon.model.PokemonAgua;
import ec.edu.upse.tics.s2021_1.poo.pokemon.model.PokemonElectrico;
import ec.edu.upse.tics.s2021_1.poo.pokemon.model.PokemonFactoryMethod;
import ec.edu.upse.tics.s2021_1.poo.pokemon.model.PokemonFuego;
import ec.edu.upse.tics.s2021_1.poo.pokemon.model.Tipo_Pokemon;


public class TesterPokemon {
	static Scanner inputConsola=new Scanner(System.in);
	public static ArrayList<Pokemon>pokemon=new ArrayList<Pokemon>();
	
	public static void main(String[] args) {
		
		Pokemon pokemonElectrico = registroDePokemonPikachu();
		pokemon.add(pokemonElectrico);
		Pokemon pokemonElectrico0 = registroDePokemonVoltorb();
		pokemon.add(pokemonElectrico0);
		Pokemon pokemonFuego = registroDePokemonCharmander();
		pokemon.add(pokemonFuego);
		Pokemon pokemonFuego0 =registroDePokemonVulpix();
		pokemon.add(pokemonFuego0);
		Pokemon pokemonAgua = registroDePokemonSquirtle();
		pokemon.add(pokemonAgua);
		Pokemon pokemonAgua0 =registroDePokemonPsyduck();
		pokemon.add(pokemonAgua0);
		
		int op;
		do{
			op=menu();
			operaciones(op);
			System.out.println("\nDesea realizar otra operacion si(1)-no(otro): ");
			op=inputConsola.nextInt();
		}while(op==1);
		
	}
	
	private static void operaciones(int op) {
		switch(op){
		case 1:
			operacionesPokemon();
			break;
		case 2:
			jugarAleatorio();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getNivel()>=1 && pokemonlis.getNivel()<=24) {
					pokemonlis.setHpTotal(100);
		        }else if(pokemonlis.getNivel()>=25 && pokemonlis.getNivel()<=49) {
		        	pokemonlis.setHpTotal(125);
		        }else if(pokemonlis.getNivel()>=50 && pokemonlis.getNivel()<=74) {
		        	pokemonlis.setHpTotal(150);
		        }else {
		        	pokemonlis.setHpTotal(200);
		        }
			}
			break;
		case 3:
			jugarConAmigo();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getNivel()>=1 && pokemonlis.getNivel()<=24) {
					pokemonlis.setHpTotal(100);
		        }else if(pokemonlis.getNivel()>=25 && pokemonlis.getNivel()<=49) {
		        	pokemonlis.setHpTotal(125);
		        }else if(pokemonlis.getNivel()>=50 && pokemonlis.getNivel()<=74) {
		        	pokemonlis.setHpTotal(150);
		        }else {
		        	pokemonlis.setHpTotal(200);
		        }
			}
			break;
		case 4:
			jugarCon3PokemonesAleatorios();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getNivel()>=1 && pokemonlis.getNivel()<=24) {
					pokemonlis.setHpTotal(100);
		        }else if(pokemonlis.getNivel()>=25 && pokemonlis.getNivel()<=49) {
		        	pokemonlis.setHpTotal(125);
		        }else if(pokemonlis.getNivel()>=50 && pokemonlis.getNivel()<=74) {
		        	pokemonlis.setHpTotal(150);
		        }else {
		        	pokemonlis.setHpTotal(200);
		        }
			}
			break;
		case 5:
			modificarPokemon();
			break;
		case 6:
			mostrarUnPokemon();
			break;
		case 7:
			listadoDePokemon();
			break;
		case 8:
			mostrarPokemonTipo();
			break;
		}
	}
	
	private static void operacionesPokemon() {
		int op =menu1();
		switch(op){
		case 1:
			registroDeTipoAgua();
			break;
		case 2: 
			registroDeTipoFuego();
			break;
		case 3:
			registroDeTipoElectrico();
			break;
		}
	}
	
	private static void jugarCon3PokemonesAleatorios() {
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int cont=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(cont+"- "+pokemonlis.getNombre());
			cont=cont+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo1 = 1;
		int num;
		String nom1 = null;
		do {
			System.out.println("ELIJA SU PRIMER POKEMON SEGUN SU NUMERO: ");
			num = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num) {
					nom1=pokemonlis1.getNombre();
					oppo1=0;
				}
				dt=dt+1;
			}
		}while(oppo1==1);
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int conta=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(conta+"- "+pokemonlis.getNombre());
			conta=conta+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo13 = 1;
		int num1;
		String nom2 = null;
		do {
			System.out.println("ELIJA SU SEGUNDO POKEMON SEGUN SU NUMERO: ");
			num1 = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num1) {
					if(pokemonlis1.getNombre()!=nom1) {
						nom2=pokemonlis1.getNombre();
						oppo13=0;
						break;
					}
				}
				dt=dt+1;
			}
		}while(oppo13==1);
		
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int contaa=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(contaa+"- "+pokemonlis.getNombre());
			contaa=contaa+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo131 = 1;
		int num11;
		String nom3 = null;
		do {
			System.out.println("ELIJA SU TERCER POKEMON SEGUN SU NUMERO: ");
			num11 = inputConsola.nextInt();
			int dt=1;
			int dtt=1;
			int dttt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(pokemonlis1.getNombre().equals(nom1)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nom2)) {
							for (Pokemon pokemonlis3:pokemon) {
								if(dt!=num11 && dtt!=num11 && dttt==num11) {
									nom3=pokemonlis3.getNombre();
									oppo131=0;
									break;
								}
								dttt++;
							}
						}
						dtt++;
					}
				}
				dt++;
			}
		}while(oppo131==1);
		
		String nomal1 = null;
		int oppo2=1;
		do {
			int aleatorio = ThreadLocalRandom.current().nextInt(1, cont + 1);
			int dt=1;
			int dtt=1;
			int dttt=1;
			int dtttt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(pokemonlis1.getNombre().equals(nom1)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nom2)) {
							for (Pokemon pokemonlis3:pokemon) {
								if(pokemonlis3.getNombre().equals(nom3)) {
									for (Pokemon pokemonlis4:pokemon) {
										if(dt!=aleatorio && dtt!=aleatorio && dttt!=aleatorio && dtttt==aleatorio) {
											nomal1=pokemonlis4.getNombre();
											oppo2=0;
											break;
										}
										dtttt++;
									}
								}
								dttt++;
							}
						}
						dtt++;
					}
				}
				dt++;
			}
		}while(oppo2==1);
		
		String nomal2 = null;
		int oppo111=1;
		do {
			int aleatorio = ThreadLocalRandom.current().nextInt(1, cont + 1);
			int dt=1;
			int dtt=1;
			int dttt=1;
			int dtttt=1;
			int dttttt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(pokemonlis1.getNombre().equals(nom1)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nom2)) {
							for (Pokemon pokemonlis3:pokemon) {
								if(pokemonlis3.getNombre().equals(nom3)) {
									for (Pokemon pokemonlis4:pokemon) {
										if(pokemonlis4.getNombre().equals(nomal1)) {
											for (Pokemon pokemonlis5:pokemon) {
												if(dt!=aleatorio && dtt!=aleatorio && dttt!=aleatorio && dtttt!=aleatorio && dttttt==aleatorio) {
													nomal2=pokemonlis5.getNombre();
													oppo111=0;
													break;
												}
												dttttt++;
											}
										}
										dtttt++;
									}
								}
								dttt++;
							}
						}
						dtt++;
					}
				}
				dt++;
			}
		}while(oppo111==1);
		
		String nomal3 = null;
		int oppo1113=1;
		do {
			int aleatorio = ThreadLocalRandom.current().nextInt(1, cont + 1);
			int dt=1;
			int dtt=1;
			int dttt=1;
			int dtttt=1;
			int dttttt=1;
			int dtttttt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(pokemonlis1.getNombre().equals(nom1)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nom2)) {
							for (Pokemon pokemonlis3:pokemon) {
								if(pokemonlis3.getNombre().equals(nom3)) {
									for (Pokemon pokemonlis4:pokemon) {
										if(pokemonlis4.getNombre().equals(nomal1)) {
											for (Pokemon pokemonlis5:pokemon) {
												if(pokemonlis5.getNombre().equals(nomal2)) {
													for (Pokemon pokemonlis6:pokemon) {
														if(dt!=aleatorio && dtt!=aleatorio && dttt!=aleatorio && dtttt!=aleatorio && dttttt!=aleatorio && dtttttt==aleatorio) {
															nomal3=pokemonlis6.getNombre();
															oppo1113=0;
															break;
														}
														dtttttt++;
													}
												}
												dttttt++;
											}
										}
										dtttt++;
									}
								}
								dttt++;
							}
						}
						dtt++;
					}
				}
				dt++;
			}
		}while(oppo1113==1);
		System.out.println("\n\n******************************************************************************************");
		System.out.println("\t("+nom1+" - "+nom2+" - "+nom3+") VS ("+nomal1+" - "+nomal2+" - "+nomal3+")");
		System.out.println("******************************************************************************************");
		int salir=0;
		for(int i = 0; i <= 30; i = i + 1){
	    	inputConsola.nextLine();
	    	System.out.println("DESEA HUIR DE LA PARTIDA SI(1)-NO(OTRO NUMERO): ");
	    	int hu=inputConsola.nextInt();
	    	if (hu==1) {
	    		for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nom1)) {
						for (Pokemon pokemonlis2:pokemon) {
							if(pokemonlis2.getNombre().equals(nom2)) {
								for (Pokemon pokemonlis3:pokemon) {
									if(pokemonlis3.getNombre().equals(nom3)) {
										for (Pokemon pokemonlis4:pokemon) {
											if(pokemonlis4.getNombre().equals(nomal1)) {
												for (Pokemon pokemonlis5:pokemon) {
													if(pokemonlis5.getNombre().equals(nomal2)) {
														for (Pokemon pokemonlis6:pokemon) {
															if(pokemonlis6.getNombre().equals(nomal3)) {
																System.out.println("+- "+pokemonlis1.getNombre()+" no aumenta nada de experiencia por que huyo");
																System.out.println("+- "+pokemonlis2.getNombre()+" no aumenta nada de experiencia por que huyo");
																System.out.println("+- "+pokemonlis3.getNombre()+" no aumenta nada de experiencia por que huyo");
																pokemonlis4.setExperiencia(pokemonlis4.getExperiencia()+10);
																System.out.println("+- "+pokemonlis4.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis4.getExperiencia());
																pokemonlis5.setExperiencia(pokemonlis5.getExperiencia()+10);
																System.out.println("+- "+pokemonlis5.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis5.getExperiencia());
																pokemonlis6.setExperiencia(pokemonlis6.getExperiencia()+10);
																System.out.println("+- "+pokemonlis6.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis6.getExperiencia());
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
	    		return;
	    	}
	    	
	    	System.out.println("*************************************");
			System.out.println("         POKEMONES REGISTRADOS");
			System.out.println("*************************************");
			System.out.println("1.- "+nom1);
			System.out.println("2.- "+nom2);
			System.out.println("3.- "+nom3);
			System.out.println("*************************************");
			inputConsola.nextLine();
			int ataque;
			String nomataque1 = null;
			do {
				System.out.println("CON QUE POKEMON DESEA ATACAR SEGUN SU NUMERO: ");
				ataque = inputConsola.nextInt();
				if (ataque==1) {
					for (Pokemon pokemonlis1:pokemon) {
						if(pokemonlis1.getNombre().equals(nom1)) {
							if(pokemonlis1.getHpTotal()<=0) {
								System.out.println(nom1+" esta desmayado elija otro ");
								ataque=8;
							}else {
								nomataque1=pokemonlis1.getNombre();
							}
						}
					}
				}
				if (ataque==2) {
					for (Pokemon pokemonlis2:pokemon) {
						if(pokemonlis2.getNombre().equals(nom2)) {
							if(pokemonlis2.getHpTotal()<=0) {
								System.out.println(nom2+" esta desmayado elija otro ");
								ataque=8;
							}else {
								nomataque1=pokemonlis2.getNombre();
							}
						}
					}
				}
				if (ataque==3) {
					for (Pokemon pokemonlis3:pokemon) {
						if(pokemonlis3.getNombre().equals(nom3)) {
							if(pokemonlis3.getHpTotal()<=0) {
								System.out.println(nom3+" esta desmayado elija otro ");
								ataque=8;
							}else {
								nomataque1=pokemonlis3.getNombre();
							}
						}
					}
				}
				
			}while(ataque<1 || ataque>3);
			
			System.out.println("*************************************");
			System.out.println("         POKEMONES REGISTRADOS");
			System.out.println("*************************************");
			System.out.println("1.- "+nomal1);
			System.out.println("2.- "+nomal2);
			System.out.println("3.- "+nomal3);
			System.out.println("*************************************");
			inputConsola.nextLine();
			int recibir;
			String nomrec = null;
			do {
				System.out.println("A QUE POKEMON DESEA HACERLE DAÑO SEGUN SU NUMERO: ");
				recibir = inputConsola.nextInt();
				if (recibir==1) {
					for (Pokemon pokemonlis1:pokemon) {
						if(pokemonlis1.getNombre().equals(nomal1)) {
							if(pokemonlis1.getHpTotal()<=0) {
								System.out.println(nomal1+" esta desmayado elija otro ");
								recibir=8;
							}else {
								nomrec=pokemonlis1.getNombre();
							}
						}
					}
				}
				if (recibir==2) {
					for (Pokemon pokemonlis2:pokemon) {
						if(pokemonlis2.getNombre().equals(nomal2)) {
							if(pokemonlis2.getHpTotal()<=0) {
								System.out.println(nomal2+" esta desmayado elija otro ");
								recibir=8;
							}else {
								nomrec=pokemonlis2.getNombre();
							}
						}
					}
				}
				if (recibir==3) {
					for (Pokemon pokemonlis3:pokemon) {
						if(pokemonlis3.getNombre().equals(nomal3)) {
							if(pokemonlis3.getHpTotal()<=0) {
								System.out.println(nomal3+" esta desmayado elija otro ");
								recibir=8;
							}else {
								nomrec=pokemonlis3.getNombre();
							}
						}
					}
				}
				
			}while(recibir<1 || recibir>3);
	    	
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nomataque1);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomataque1)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			int eli = 1;
			do {
				System.out.println("ELIJA EL ATAQUE SEGUN EL NUMERO: ");
				int ataque1=inputConsola.nextInt();
				int dt=1;
				for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nomataque1)) {
						for(int o = 0; o < pokemonlis1.getListaAtaque().size(); o++) {
							if(dt==ataque1) {
								for (Pokemon pokemonlis22:pokemon) {
									if(pokemonlis22.getNombre().equals(nomrec)) {
										System.out.println("*************************************");
										System.out.println(nomataque1+" ataco a "+nomrec);
										System.out.println("*************************************");
										pokemonlis1.atacar(pokemonlis22);
										mostrarTotalesP1VsAleatorio(nom1,nom2,nom3,nomal1,nomal2,nomal3);
										salir=salirPorDerrota(nom1,nom2,nom3,nomal1,nomal2,nomal3);
										
										eli=0;
									}
								}
							}
							dt=dt+1;
						}
					}
				}
			}while(eli==1);
			
			if (salir==1) {
				return;
			}
			
			inputConsola.nextLine();
			String nomataquePc = null;
			int des;
			do {
				des = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				if (des==1) {
					for (Pokemon pokemonlis1:pokemon) {
						if(pokemonlis1.getNombre().equals(nomal1)) {
							if(pokemonlis1.getHpTotal()<=0) {
								System.out.println(nomal1+" esta desmayado elija otro ");
								des=8;
							}else {
								nomataquePc=pokemonlis1.getNombre();
							}
						}
					}
				}
				if (des==2) {
					for (Pokemon pokemonlis2:pokemon) {
						if(pokemonlis2.getNombre().equals(nomal2)) {
							if(pokemonlis2.getHpTotal()<=0) {
								System.out.println(nomal2+" esta desmayado elija otro ");
								des=8;
							}else {
								nomataquePc=pokemonlis2.getNombre();
							}
						}
					}
				}
				if (des==3) {
					for (Pokemon pokemonlis3:pokemon) {
						if(pokemonlis3.getNombre().equals(nomal3)) {
							if(pokemonlis3.getHpTotal()<=0) {
								System.out.println(nomal3+" esta desmayado elija otro ");
								des=8;
							}else {
								nomataquePc=pokemonlis3.getNombre();
							}
						}
					}
				}
				
			}while(des<1 || des>3);
			
			int des1;
			String nomrecPc = null;
			do {
				des1 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				if (des1==1) {
					for (Pokemon pokemonlis1:pokemon) {
						if(pokemonlis1.getNombre().equals(nom1)) {
							if(pokemonlis1.getHpTotal()<=0) {
								System.out.println(nomal1+" esta desmayado elija otro ");
								des1=8;
							}else {
								nomrecPc=pokemonlis1.getNombre();
							}
						}
					}
				}
				if (des1==2) {
					for (Pokemon pokemonlis2:pokemon) {
						if(pokemonlis2.getNombre().equals(nom2)) {
							if(pokemonlis2.getHpTotal()<=0) {
								System.out.println(nom2+" esta desmayado elija otro ");
								des1=8;
							}else {
								nomrecPc=pokemonlis2.getNombre();
							}
						}
					}
				}
				if (des1==3) {
					for (Pokemon pokemonlis3:pokemon) {
						if(pokemonlis3.getNombre().equals(nom3)) {
							if(pokemonlis3.getHpTotal()<=0) {
								System.out.println(nom3+" esta desmayado elija otro ");
								des1=8;
							}else {
								nomrecPc=pokemonlis3.getNombre();
							}
						}
					}
				}
				
			}while(des1<1 || des1>3);
			
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nomataquePc);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomataquePc)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomataquePc)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nomrecPc)) {
							System.out.println("*************************************");
							System.out.println(nomataquePc+" ataco a "+nomrecPc);
							System.out.println("*************************************");
							pokemonlis12.atacar(pokemonlis22);
							mostrarTotalesP1VsAleatorio(nom1,nom2,nom3,nomal1,nomal2,nomal3);
							if (salir==0) {
								salir=salirPorDerrota(nom1,nom2,nom3,nomal1,nomal2,nomal3);
							}
						}
					}
				}
			}
			if (salir==1) {
				return;
			}
		}
		
		
	}

	private static int salirPorDerrota(String nom1, String nom2, String nom3, String nomal1, String nomal2,String nomal3) {
		for (Pokemon pokemonlis1:pokemon) {
			if(pokemonlis1.getNombre().equals(nom1)) {
				for (Pokemon pokemonlis2:pokemon) {
					if(pokemonlis2.getNombre().equals(nom2)) {
						for (Pokemon pokemonlis3:pokemon) {
							if(pokemonlis3.getNombre().equals(nom3)) {
								for (Pokemon pokemonlis4:pokemon) {
									if(pokemonlis4.getNombre().equals(nomal1)) {
										for (Pokemon pokemonlis5:pokemon) {
											if(pokemonlis5.getNombre().equals(nomal2)) {
												for (Pokemon pokemonlis6:pokemon) {
													if(pokemonlis6.getNombre().equals(nomal3)) {
														if (pokemonlis4.getHpTotal()<=0 && pokemonlis5.getHpTotal()<=0 && pokemonlis6.getHpTotal()<=0) {
															System.out.println("FELICIDADES GANASTE P1.............!!");
															pokemonlis1.setExperiencia(pokemonlis1.getExperiencia()+35);
															System.out.println("+- "+pokemonlis1.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis1.getExperiencia());
															pokemonlis2.setExperiencia(pokemonlis2.getExperiencia()+35);
															System.out.println("+- "+pokemonlis2.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis2.getExperiencia());
															pokemonlis3.setExperiencia(pokemonlis3.getExperiencia()+35);
															System.out.println("+- "+pokemonlis3.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis3.getExperiencia());
															pokemonlis4.setExperiencia(pokemonlis4.getExperiencia()+15);
															System.out.println("+- "+pokemonlis4.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis4.getExperiencia());
															pokemonlis5.setExperiencia(pokemonlis5.getExperiencia()+15);
															System.out.println("+- "+pokemonlis5.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis5.getExperiencia());
															pokemonlis6.setExperiencia(pokemonlis6.getExperiencia()+15);
															System.out.println("+- "+pokemonlis6.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis6.getExperiencia());
															pokemonlis1.cambioDeNombre(pokemonlis1);
															pokemonlis2.cambioDeNombre(pokemonlis2);
															pokemonlis3.cambioDeNombre(pokemonlis3);
															pokemonlis4.cambioDeNombre(pokemonlis4);
															pokemonlis5.cambioDeNombre(pokemonlis5);
															pokemonlis6.cambioDeNombre(pokemonlis6);
															return 1;
														}
														if (pokemonlis1.getHpTotal()<=0 && pokemonlis2.getHpTotal()<=0 && pokemonlis3.getHpTotal()<=0) {
															System.out.println("GAME OVER.............!!");
															pokemonlis4.setExperiencia(pokemonlis4.getExperiencia()+35);
															System.out.println("+- "+pokemonlis4.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis4.getExperiencia());
															pokemonlis5.setExperiencia(pokemonlis5.getExperiencia()+35);
															System.out.println("+- "+pokemonlis5.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis5.getExperiencia());
															pokemonlis6.setExperiencia(pokemonlis6.getExperiencia()+35);
															System.out.println("+- "+pokemonlis6.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis6.getExperiencia());
															pokemonlis1.setExperiencia(pokemonlis1.getExperiencia()+15);
															System.out.println("+- "+pokemonlis1.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis1.getExperiencia());
															pokemonlis2.setExperiencia(pokemonlis2.getExperiencia()+15);
															System.out.println("+- "+pokemonlis2.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis2.getExperiencia());
															pokemonlis3.setExperiencia(pokemonlis3.getExperiencia()+15);
															System.out.println("+- "+pokemonlis3.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis3.getExperiencia());
															pokemonlis1.cambioDeNombre(pokemonlis1);
															pokemonlis2.cambioDeNombre(pokemonlis2);
															pokemonlis3.cambioDeNombre(pokemonlis3);
															pokemonlis4.cambioDeNombre(pokemonlis4);
															pokemonlis5.cambioDeNombre(pokemonlis5);
															pokemonlis6.cambioDeNombre(pokemonlis6);
															return 1;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}

	private static void mostrarTotalesP1VsAleatorio(String nom1, String nom2, String nom3, String nomal1, String nomal2,String nomal3) {
		for (Pokemon pokemonlis1:pokemon) {
			if(pokemonlis1.getNombre().equals(nom1)) {
				for (Pokemon pokemonlis2:pokemon) {
					if(pokemonlis2.getNombre().equals(nom2)) {
						for (Pokemon pokemonlis3:pokemon) {
							if(pokemonlis3.getNombre().equals(nom3)) {
								for (Pokemon pokemonlis4:pokemon) {
									if(pokemonlis4.getNombre().equals(nomal1)) {
										for (Pokemon pokemonlis5:pokemon) {
											if(pokemonlis5.getNombre().equals(nomal2)) {
												for (Pokemon pokemonlis6:pokemon) {
													if(pokemonlis6.getNombre().equals(nomal3)) {
														System.out.println("*************************************");
														System.out.println("       LISTA DE POKEMONES P1");
														System.out.println("*************************************");
														System.out.println("+- "+pokemonlis1.getNombre()+" HP TOTAL :"+pokemonlis1.getHpTotal());
														System.out.println("+- "+pokemonlis2.getNombre()+" HP TOTAL :"+pokemonlis2.getHpTotal());
														System.out.println("+- "+pokemonlis3.getNombre()+" HP TOTAL :"+pokemonlis3.getHpTotal());
														System.out.println("*************************************");
														System.out.println("*************************************");
														System.out.println("    LISTA DE POKEMONES ALEATORIO");
														System.out.println("*************************************");
														System.out.println("+- "+pokemonlis4.getNombre()+" HP TOTAL :"+pokemonlis4.getHpTotal());
														System.out.println("+- "+pokemonlis5.getNombre()+" HP TOTAL :"+pokemonlis5.getHpTotal());
														System.out.println("+- "+pokemonlis6.getNombre()+" HP TOTAL :"+pokemonlis6.getHpTotal());
														System.out.println("*************************************");
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}

	private static void mostrarUnPokemon() {
		System.out.println("*************************************");
		System.out.println("         MOSTRAR POKEMON");
		System.out.println("*************************************");
		int cont=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(cont+"- "+pokemonlis.getNombre());
			cont=cont+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo1 = 1;
		int num;
		String nombreM = null;
		do {
			System.out.println("ELIJA EL POKEMON SEGUN SU NUMERO: ");
			num = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num) {
					nombreM=pokemonlis1.getNombre();
					oppo1=0;
				}
				dt=dt+1;
			}
		}while(oppo1==1);
		for (Pokemon pokemonlis:pokemon) {
			if(pokemonlis.getNombre().equals(nombreM)) {
					System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
					System.out.println("Exp: "+pokemonlis.getExperiencia());
					System.out.println("Hp total: "+pokemonlis.getHpTotal());
					System.out.println("Nivel: "+pokemonlis.getNivel());
					System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
					System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
					System.out.println("Altura: "+pokemonlis.getAltura()+" m");
					System.out.println("\n--- LISTADO DE ATAQUE ---");
					int contt=1;
					for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
				        System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
				        contt=contt+1;
				    }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE FORTALEZA ---");
					int conte=1;
					for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
				        System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
				        conte=conte+1;
				    }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE DEBILIDAD ---");
					int contr=1;
					for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
				        System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
				        contr=contr+1;
				    }
			}
		}
	}

	private static void modificarPokemon() {
		System.out.println("*************************************");
		System.out.println("         MODIFICAR POKEMON");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("         MOSTRAR POKEMON");
		System.out.println("*************************************");
		int cont=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(cont+"- "+pokemonlis.getNombre());
			cont=cont+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo1 = 1;
		int num;
		String nom = null;
		do {
			System.out.println("ELIJA EL POKEMON SEGUN SU NUMERO: ");
			num = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num) {
					nom=pokemonlis1.getNombre();
					oppo1=0;
				}
				dt=dt+1;
			}
		}while(oppo1==1);
		for (Pokemon pokemonlis:pokemon) {
			if(pokemonlis.getNombre().equals(nom)) {
			System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
			System.out.println("Exp: "+pokemonlis.getExperiencia());
			System.out.println("Hp total: "+pokemonlis.getHpTotal());
			System.out.println("Nivel: "+pokemonlis.getNivel());
			System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
			System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
			System.out.println("Altura: "+pokemonlis.getAltura()+" m");
			System.out.println("\n--- LISTADO DE ATAQUE ---");
			int contt=1;
			for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
		        System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
		        contt=contt+1;
		    }
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE FORTALEZA ---");
			int conte=1;
			for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
		        System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
		        conte=conte+1;
		    }
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE DEBILIDAD ---");
			int contr=1;
			for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
		        System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
		        contr=contr+1;
		    }
			System.out.println("----------------------------");
			System.out.println("*************************************");
			inputConsola.nextLine();
			System.out.println("*************************************");
			System.out.println("        DATOS NUEVOS");
			System.out.println("*************************************");
			System.out.println("Ingrese nuevo nombre del pokemon: ");
			String nombrePo = inputConsola.nextLine();
			pokemonlis.setNombre(nombrePo);
			System.out.println("Exp: ");
			int expe = inputConsola.nextInt();
			pokemonlis.setExperiencia(expe);
			System.out.println("Hp total: "+pokemonlis.getHpTotal());
			System.out.println("Nivel: ");
			int nivel = inputConsola.nextInt();
			pokemonlis.setNivel(nivel);
			System.out.println("Nivel maximo de evolucion: ");
			int nivelEvolucion = inputConsola.nextInt();
			pokemonlis.setNivelEvolucion(nivelEvolucion);
			System.out.println("Peso: ");
			double peso = inputConsola.nextDouble();  
			pokemonlis.setPeso(peso);
			System.out.println(" Kg");
			System.out.println("Altura: ");
			double altura1 = inputConsola.nextDouble(); 
			pokemonlis.setAltura(altura1);
			System.out.println(" m");
			System.out.println("");
			
			
			int resp=1;
			while(resp==1) {
				System.out.println("--- LISTADO DE ATAQUE ---");
				System.out.println("*- ");
				int liscont=1;
				for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
		            System.out.println(liscont+"- "+pokemonlis.getListaAtaque().get(o));
		            liscont=liscont+1;
		        }	
			System.out.println("Desea cambiar el listado de ataque si(1)-no(otro)");
			resp=inputConsola.nextInt();
			System.out.println("*************************************");
			if (resp==1) {
				int resp1=1;
		    	ArrayList<String> listadoAtaque = new ArrayList<String>();
		    	while(resp1==1) {
		    		inputConsola.nextLine();
		    		System.out.println("INGRESE EL ATAQUE DEL POKEMON: ");
		    		String ataque1=inputConsola.nextLine();
		    		listadoAtaque.add(ataque1);
		    		pokemonlis.setListaAtaque(listadoAtaque);
		    		System.out.println("DESEA REGISTRAR OTRO ATAQUE SI(1)-NO(OTRO NUMERO): ");
		    		resp1=inputConsola.nextInt();
		    	}
			}
			}
			
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE FORTALEZA ---");
			int contw=1;
			for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
		        System.out.println(contw+"- "+pokemonlis.getFortaleza().get(u));
		        contw=contw+1;
		    }
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE DEBILIDAD ---");
			int contq=1;
			for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
		        System.out.println(contq+"- "+pokemonlis.getDebilidad().get(t));
		        contq=contq+1;
		    }
			System.out.println("*************************************");
			}
		}
	}

	private static void listadoDePokemon() {
		System.out.println("*************************************");
		System.out.println("         LISTADO DE POKEMON");
		System.out.println("*************************************");
		for (Pokemon pokemonlis:pokemon) {
			System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
			System.out.println("Exp: "+pokemonlis.getExperiencia());
			System.out.println("Hp total: "+pokemonlis.getHpTotal());
			System.out.println("Nivel: "+pokemonlis.getNivel());
			System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
			System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
			System.out.println("Altura: "+pokemonlis.getAltura()+" m");
			System.out.println("\n--- LISTADO DE ATAQUE ---");
			int contt=1;
			for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
	            System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
	            contt=contt+1;
	        }
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE FORTALEZA ---");
			int conte=1;
			for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
	            System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
	            conte=conte+1;
	        }
			System.out.println("----------------------------");
			System.out.println("\n--- LISTADO DE DEBILIDAD ---");
			int contr=1;
			for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
	            System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
	            contr=contr+1;
	        }
			System.out.println("----------------------------");
			System.out.println("*************************************");
		}
	}

	private static void jugarConAmigo() {
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int cont=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(cont+"- "+pokemonlis.getNombre());
			cont=cont+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo1 = 1;
		int num;
		String nom = null;
		do {
			System.out.println("ELIJA EL POKEMON SEGUN SU NUMERO(P1): ");
			num = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num) {
					nom=pokemonlis1.getNombre();
					oppo1=0;
				}
				dt=dt+1;
			}
		}while(oppo1==1);
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int conta=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(conta+"- "+pokemonlis.getNombre());
			conta=conta+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo13 = 1;
		int num1;
		String nomb = null;
		do {
			System.out.println("ELIJA EL POKEMON SEGUN SU NUMERO (P2): ");
			num1 = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num1) {
					if(pokemonlis1.getNombre()!=nom) {
						nomb=pokemonlis1.getNombre();
						oppo13=0;
						break;
					}
				}
				dt=dt+1;
			}
		}while(oppo13==1);
		
		
		System.out.println("\n\n*************************************");
		System.out.println("\t"+nom+" VS "+nomb);
		System.out.println("*************************************");
		for(int i = 0; i <= 10; i = i + 1){
			inputConsola.nextLine();
	    	System.out.println("DESEA HUIR DE LA PARTIDA SI(1)-NO(OTRO NUMERO): ");
	    	int hu=inputConsola.nextInt();
	    	if (hu==1) {
	    		for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nom)) {
						for (Pokemon pokemonlis22:pokemon) {
							if(pokemonlis22.getNombre().equals(nomb)) {
								System.out.println("+- "+pokemonlis1.getNombre()+" no aumenta nada de experiencia por que huyo");
								pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+10);
								System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis22.getExperiencia());
							}
						}
					}
	    		}
	    		return;
	    	}
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nom);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nom)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			int eli = 1;
			do {
				System.out.println("ELIJA EL ATAQUE SEGUN EL NUMERO: ");
				int ataque=inputConsola.nextInt();
				int dt=1;
				for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nom)) {
						for(int o = 0; o < pokemonlis1.getListaAtaque().size(); o++) {
							if(dt==ataque) {
								for (Pokemon pokemonlis22:pokemon) {
									if(pokemonlis22.getNombre().equals(nomb)) {
										pokemonlis1.atacar(pokemonlis22);
										dibujoVS(pokemonlis1,pokemonlis22);
										if (pokemonlis22.getHpTotal()<=0) {
											System.out.println("FELICIDADES GANASTE (P1).............!!");
											pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+15);
											System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis22.getExperiencia());
											pokemonlis1.setExperiencia(pokemonlis1.getExperiencia()+35);
											System.out.println("+- "+pokemonlis1.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis1.getExperiencia());
											pokemonlis1.cambioDeNombre(pokemonlis1);
											pokemonlis22.cambioDeNombre(pokemonlis22);
											eli=0;
											return;
										}
										eli=0;
									}
								}
							}
							dt=dt+1;
						}
					}
				}
			}while(eli==1);
			inputConsola.nextLine();
	    	System.out.println("DESEA HUIR DE LA PARTIDA SI(1)-NO(OTRO NUMERO): ");
	    	int hu1=inputConsola.nextInt();
	    	if (hu1==1) {
	    		for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nomb)) {
						for (Pokemon pokemonlis22:pokemon) {
							if(pokemonlis22.getNombre().equals(nom)) {
								System.out.println("+- "+pokemonlis1.getNombre()+" no aumenta nada de experiencia por que huyo");
								pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+10);
								System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis22.getExperiencia());
							}
						}
					}
	    		}
	    		return;
	    	}
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nomb);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomb)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			
			int eli1 = 1;
			do {
				System.out.println("ELIJA EL ATAQUE SEGUN EL NUMERO: ");
				int ataque=inputConsola.nextInt();
				int dt=1;
				for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nomb)) {
						for(int o = 0; o < pokemonlis1.getListaAtaque().size(); o++) {
							if(dt==ataque) {
								for (Pokemon pokemonlis22:pokemon) {
									if(pokemonlis22.getNombre().equals(nom)) {
										pokemonlis1.atacar(pokemonlis22);
										dibujoVS(pokemonlis1,pokemonlis22);
										if (pokemonlis22.getHpTotal()<=0) {
											System.out.println("FELICIDADES GANASTE (P2).............!!");
											pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+15);
											System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis22.getExperiencia());
											pokemonlis1.setExperiencia(pokemonlis1.getExperiencia()+35);
											System.out.println("+- "+pokemonlis1.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis1.getExperiencia());
											pokemonlis1.cambioDeNombre(pokemonlis1);
											pokemonlis22.cambioDeNombre(pokemonlis22);
											eli1=0;
											return;
										}
										eli1=0;
									}
								}
							}
							dt=dt+1;
						}
					}
				}
			}while(eli1==1);
		}
	}

	private static void dibujoVS(Pokemon pokemonlis1, Pokemon pokemonlis22) {
		if (pokemonlis1.getTipoPokemon()==Tipo_Pokemon.Agua) {
			PokemonAgua.dibujarRepresentacion();
			System.out.println("  +++++++++++++++++++++++++++++++++");
			System.out.println("  - "+pokemonlis1.getNombre()+" su HP total es: "+pokemonlis1.getHpTotal());
			System.out.println("  +++++++++++++++++++++++++++++++++\n");
		}else if(pokemonlis1.getTipoPokemon()==Tipo_Pokemon.Fuego){
			PokemonFuego.dibujarRepresentacion();
			System.out.println("  +++++++++++++++++++++++++++++++++");
			System.out.println("  - "+pokemonlis1.getNombre()+" su HP total es: "+pokemonlis1.getHpTotal());
			System.out.println("  +++++++++++++++++++++++++++++++++\n");
		}else if (pokemonlis1.getTipoPokemon()==Tipo_Pokemon.Eléctrico){
			PokemonElectrico.dibujarRepresentacion();
			System.out.println("  +++++++++++++++++++++++++++++++++");
			System.out.println("  - "+pokemonlis1.getNombre()+" su HP total es: "+pokemonlis1.getHpTotal());
			System.out.println("  +++++++++++++++++++++++++++++++++\n");
		}
		dibujarVS();
		if (pokemonlis22.getTipoPokemon()==Tipo_Pokemon.Agua) {
			PokemonAgua.dibujarRepresentacionConEspacio();
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
			System.out.println("\t\t\t\t\t\t\t\t\t  - "+pokemonlis22.getNombre()+" su HP total es: "+pokemonlis22.getHpTotal());
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
		}else if(pokemonlis22.getTipoPokemon()==Tipo_Pokemon.Fuego){
			PokemonFuego.dibujarRepresentacionConEspacio();
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
			System.out.println("\t\t\t\t\t\t\t\t\t  - "+pokemonlis22.getNombre()+" su HP total es: "+pokemonlis22.getHpTotal());
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
		}else if (pokemonlis22.getTipoPokemon()==Tipo_Pokemon.Eléctrico){
			PokemonElectrico.dibujarRepresentacionConEspacio();
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
			System.out.println("\t\t\t\t\t\t\t\t\t  - "+pokemonlis22.getNombre()+" su HP total es: "+pokemonlis22.getHpTotal());
			System.out.println("\t\t\t\t\t\t\t\t\t  +++++++++++++++++++++++++++++++++");
		}
		
	}

	private static void jugarAleatorio() {
		System.out.println("*************************************");
		System.out.println("         POKEMONES REGISTRADOS");
		System.out.println("*************************************");
		int cont=1;
		for (Pokemon pokemonlis:pokemon) {
			System.out.println(cont+"- "+pokemonlis.getNombre());
			cont=cont+1;
		}
		System.out.println("*************************************");
		inputConsola.nextLine();
		int oppo1 = 1;
		int num;
		String nom = null;
		do {
			System.out.println("ELIJA EL POKEMON SEGUN SU NUMERO: ");
			num = inputConsola.nextInt();
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==num) {
					nom=pokemonlis1.getNombre();
					oppo1=0;
				}
				dt=dt+1;
			}
		}while(oppo1==1);
		 
		String nomb = null;
		int oppo2=1;
		do {
			int aleatorio = ThreadLocalRandom.current().nextInt(1, cont + 1);
			int dt=1;
			for (Pokemon pokemonlis1:pokemon) {
				if(dt==aleatorio ) {
					if(pokemonlis1.getNombre()!=nom) {
						nomb =pokemonlis1.getNombre();
						oppo2=0;
						break;
					}
				}
				dt=dt+1;
			}
		}while(oppo2==1);
		
		System.out.println("\n\n*************************************");
		System.out.println("\t"+nom+" VS "+nomb);
		System.out.println("*************************************");
		for(int i = 0; i <= 10; i = i + 1){
	    	inputConsola.nextLine();
	    	System.out.println("DESEA HUIR DE LA PARTIDA SI(1)-NO(OTRO NUMERO): ");
	    	int hu=inputConsola.nextInt();
	    	if (hu==1) {
	    		for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nom)) {
						for (Pokemon pokemonlis22:pokemon) {
							if(pokemonlis22.getNombre().equals(nomb)) {
								System.out.println("+- "+pokemonlis1.getNombre()+" no aumenta nada de experiencia por que huyo");
								pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+10);
								System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 10 su total es: "+pokemonlis22.getExperiencia());
							}
						}
					}
	    		}
	    		return;
	    	}
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nom);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nom)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			int eli = 1;
			do {
				System.out.println("ELIJA EL ATAQUE SEGUN EL NUMERO: ");
				int ataque=inputConsola.nextInt();
				int dt=1;
				for (Pokemon pokemonlis1:pokemon) {
					if(pokemonlis1.getNombre().equals(nom)) {
						for(int o = 0; o < pokemonlis1.getListaAtaque().size(); o++) {
							if(dt==ataque) {
								for (Pokemon pokemonlis22:pokemon) {
									if(pokemonlis22.getNombre().equals(nomb)) {
										pokemonlis1.atacar(pokemonlis22);
										dibujoVS(pokemonlis1,pokemonlis22);
										if (pokemonlis22.getHpTotal()<=0) {
											System.out.println("FELICIDADES GANASTE .............!!");
											pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+15);
											System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis22.getExperiencia());
											pokemonlis1.setExperiencia(pokemonlis1.getExperiencia()+35);
											System.out.println("+- "+pokemonlis1.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis1.getExperiencia());
											pokemonlis1.cambioDeNombre(pokemonlis1);
											pokemonlis22.cambioDeNombre(pokemonlis22);
											eli=0;
											return;
										}
										eli=0;
									}
								}
							}
							dt=dt+1;
						}
					}
				}
			}while(eli==1);
			System.out.println("*************************************");
			System.out.println("    Lista de ataque => "+nomb);
			System.out.println("*************************************");
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomb)) {
					int contt=1;
					for(int o = 0; o < pokemonlis12.getListaAtaque().size(); o++) {
			            System.out.println(contt+"-"+pokemonlis12.getListaAtaque().get(o));
			            contt++;
			        }
					break;
				}
			}
			System.out.println("*************************************");
			
			for (Pokemon pokemonlis12:pokemon) {
				if(pokemonlis12.getNombre().equals(nomb)) {
					for (Pokemon pokemonlis22:pokemon) {
						if(pokemonlis22.getNombre().equals(nom)) {
							pokemonlis12.atacar(pokemonlis22);
							dibujoVS(pokemonlis12,pokemonlis22);
							if (pokemonlis22.getHpTotal()<=0) {
								System.out.println("GAMER OVER .............!!");
								pokemonlis22.setExperiencia(pokemonlis22.getExperiencia()+15);
								System.out.println("+- "+pokemonlis22.getNombre()+" aumento de experiencia 15 su total es: "+pokemonlis22.getExperiencia());
								pokemonlis12.setExperiencia(pokemonlis12.getExperiencia()+35);
								System.out.println("+- "+pokemonlis12.getNombre()+" aumento de experiencia 35 su total es: "+pokemonlis12.getExperiencia());
								pokemonlis12.cambioDeNombre(pokemonlis12);
								pokemonlis22.cambioDeNombre(pokemonlis22);
								return;
							}
						}
					}
				}
			}
		}
		
		
		
	}
	
	private static void mostrarPokemonTipo() {
		int op =menu1();
		switch(op){
		case 1:	//Agua
			System.out.println("*************************************");
			System.out.println("         POKEMONES TIPO AGUA");
			System.out.println("*************************************");
			PokemonAgua.dibujar();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getTipoPokemon()==Tipo_Pokemon.Agua) {
					System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
					System.out.println("Exp: "+pokemonlis.getExperiencia());
					System.out.println("Hp total: "+pokemonlis.getHpTotal());
					System.out.println("Nivel: "+pokemonlis.getNivel());
					System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
					System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
					System.out.println("Altura: "+pokemonlis.getAltura()+" m");
					System.out.println("\n--- LISTADO DE ATAQUE ---");
					int contt=1;
					for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
			            System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
			            contt=contt+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE FORTALEZA ---");
					int conte=1;
					for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
			            System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
			            conte=conte+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE DEBILIDAD ---");
					int contr=1;
					for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
			            System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
			            contr=contr+1;
			        }
					System.out.println("----------------------------");
					System.out.println("*************************************");
				}
				
			}	
			break;
		case 2: //Fuego
			System.out.println("*************************************");
			System.out.println("         POKEMONES TIPO FUEGO");
			System.out.println("*************************************");
			PokemonFuego.dibujar();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getTipoPokemon()==Tipo_Pokemon.Fuego) {
					System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
					System.out.println("Exp: "+pokemonlis.getExperiencia());
					System.out.println("Hp total: "+pokemonlis.getHpTotal());
					System.out.println("Nivel: "+pokemonlis.getNivel());
					System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
					System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
					System.out.println("Altura: "+pokemonlis.getAltura()+" m");
					System.out.println("\n--- LISTADO DE ATAQUE ---");
					int contt=1;
					for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
			            System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
			            contt=contt+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE FORTALEZA ---");
					int conte=1;
					for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
			            System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
			            conte=conte+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE DEBILIDAD ---");
					int contr=1;
					for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
			            System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
			            contr=contr+1;
			        }
					System.out.println("----------------------------");
					System.out.println("*************************************");
				}
				
			}	
			break;
		case 3: //Electricidad
			System.out.println("*************************************");
			System.out.println("       POKEMONES TIPO ELECTRICO");
			System.out.println("*************************************");
			PokemonElectrico.dibujar();
			for (Pokemon pokemonlis:pokemon) {
				if (pokemonlis.getTipoPokemon()==Tipo_Pokemon.Eléctrico) {
					System.out.println("Nombre del pokemon: "+pokemonlis.getNombre());
					System.out.println("Exp: "+pokemonlis.getExperiencia());
					System.out.println("Hp total: "+pokemonlis.getHpTotal());
					System.out.println("Nivel: "+pokemonlis.getNivel());
					System.out.println("Nivel maximo de volucion: "+pokemonlis.getNivelEvolucion());
					System.out.println("Peso: "+pokemonlis.getPeso()+" Kg");
					System.out.println("Altura: "+pokemonlis.getAltura()+" m");
					System.out.println("\n--- LISTADO DE ATAQUE ---");
					int contt=1;
					for(int o = 0; o < pokemonlis.getListaAtaque().size(); o++) {
			            System.out.println(contt+"- "+pokemonlis.getListaAtaque().get(o));
			            contt=contt+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE FORTALEZA ---");
					int conte=1;
					for(int u = 0; u < pokemonlis.getFortaleza().size(); u++) {
			            System.out.println(conte+"- "+pokemonlis.getFortaleza().get(u));
			            conte=conte+1;
			        }
					System.out.println("----------------------------");
					System.out.println("\n--- LISTADO DE DEBILIDAD ---");
					int contr=1;
					for(int t = 0; t < pokemonlis.getDebilidad().size(); t++) {
			            System.out.println(contr+"- "+pokemonlis.getDebilidad().get(t));
			            contr=contr+1;
			        }
					System.out.println("----------------------------");
					System.out.println("*************************************");
				}
				
			}
			break;
		}
	}
	
	private static Pokemon registroDeTipoElectrico() {
		String nombre ;
		int experiencia;
		int hpTotal = 0;
		int nivel=0;
		int nivelEvolucion=0;
		double peso=0.0;  //metros
		double altura=0.0;  //Kg
		String ataque;
		inputConsola.nextLine();
		System.out.println("INGRESE EL NOMBRE DEL POKEMON: ");
		nombre=inputConsola.nextLine();
    	System.out.println("INGRESE LA EXPERIENCIA: ");
    	experiencia=inputConsola.nextInt();
        do {
        	System.out.println("INGRESE EL NIVEL DEL POKEMON: ");
        	nivel=inputConsola.nextInt();
        }while(nivel<1 || nivel>100);
        if (nivel>=1 && nivel<=24) {
        	hpTotal=100;
        }else if(nivel>=25 && nivel<=49) {
        	hpTotal=125;
        }else if(nivel>=50 && nivel<=74) {
        	hpTotal=150;
        }else {
        	hpTotal=200;
        }
        System.out.println("SU HP TOTAL ES: "+hpTotal);
        do {
        	System.out.println("INGRESE CUANTOS NIVELES DE EVOLUCION TIENE: ");
        	nivelEvolucion=inputConsola.nextInt();
        }while(nivelEvolucion<nivel || nivelEvolucion>100);
        
    	System.out.println("INGRESE EL PESO(kg): ");
    	peso=inputConsola.nextDouble();
    	System.out.println("INGRESE LA ALTURA(m): ");
    	altura=inputConsola.nextDouble();
    	int resp=1;
    	ArrayList<String> listadoAtaque = new ArrayList<String>();
    	while(resp==1) {
    		inputConsola.nextLine();
    		System.out.println("INGRESE EL ATAQUE DEL POKEMON: ");
    		ataque=inputConsola.nextLine();
    		listadoAtaque.add(ataque);
    		System.out.println("DESEA REGISTRAR OTRO ATAQUE SI(1)-NO(OTRO NUMERO): ");
    		resp=inputConsola.nextInt();
    	}
    	ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Eléctrico");
    	debilidad.add("Planta");
    	debilidad.add("Tierra");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Agua");
    	fortaleza.add("Volador");
    	Pokemon electrico = new PokemonFactoryMethod().getTipoP(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,altura,listadoAtaque,Tipo_Pokemon.Eléctrico, debilidad, fortaleza);
		pokemon.add(electrico);
		return electrico;
	}
	
	private static Pokemon registroDeTipoAgua() {
		String nombre ;
		int experiencia;
		int hpTotal = 0;
		int nivel=0;
		int nivelEvolucion=0;
		double peso=0.0;  //metros
		double altura=0.0;  //Kg
		String ataque;
		inputConsola.nextLine();
		System.out.println("INGRESE EL NOMBRE DEL POKEMON: ");
		nombre=inputConsola.nextLine();
    	System.out.println("INGRESE LA EXPERIENCIA: ");
    	experiencia=inputConsola.nextInt();
        do {
        	System.out.println("INGRESE EL NIVEL DEL POKEMON: ");
        	nivel=inputConsola.nextInt();
        }while(nivel<1 || nivel>100);
        if (nivel>=1 && nivel<=24) {
        	hpTotal=100;
        }else if(nivel>=25 && nivel<=49) {
        	hpTotal=125;
        }else if(nivel>=50 && nivel<=74) {
        	hpTotal=150;
        }else {
        	hpTotal=200;
        }
        System.out.println("SU HP TOTAL ES: "+hpTotal);
        do {
        	System.out.println("INGRESE CUANTOS NIVELES DE EVOLUCION TIENE: ");
        	nivelEvolucion=inputConsola.nextInt();
        }while(nivelEvolucion<nivel || nivelEvolucion>100);
        
    	System.out.println("INGRESE EL PESO(kg): ");
    	peso=inputConsola.nextDouble();
    	System.out.println("INGRESE LA ALTURA(m): ");
    	altura=inputConsola.nextDouble();
    	int resp=1;
    	ArrayList<String> listadoAtaque = new ArrayList<String>();
    	while(resp==1) {
    		inputConsola.nextLine();
    		System.out.println("INGRESE EL ATAQUE DEL POKEMON: ");
    		ataque=inputConsola.nextLine();
    		listadoAtaque.add(ataque);
    		System.out.println("DESEA REGISTRAR OTRO ATAQUE SI(1)-NO(OTRO NUMERO): ");
    		resp=inputConsola.nextInt();
    	}
    	ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Planta");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Fuego");
    	fortaleza.add("Roca");
    	fortaleza.add("Tierra");
    	Pokemon Agua = new PokemonFactoryMethod().getTipoP(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,altura,listadoAtaque,Tipo_Pokemon.Agua, debilidad, fortaleza);
    	pokemon.add(Agua);
    	return Agua;
	}
	
	private static Pokemon registroDeTipoFuego() {
		String nombre ;
		int experiencia;
		int hpTotal = 0;
		int nivel=0;
		int nivelEvolucion=0;
		double peso=0.0;  //metros
		double altura=0.0;  //Kg
		String ataque;
		inputConsola.nextLine();
		System.out.println("INGRESE EL NOMBRE DEL POKEMON: ");
		nombre=inputConsola.nextLine();
    	System.out.println("INGRESE LA EXPERIENCIA: ");
    	experiencia=inputConsola.nextInt();
        do {
        	System.out.println("INGRESE EL NIVEL DEL POKEMON: ");
        	nivel=inputConsola.nextInt();
        }while(nivel<1 || nivel>100);
        if (nivel>=1 && nivel<=24) {
        	hpTotal=100;
        }else if(nivel>=25 && nivel<=49) {
        	hpTotal=125;
        }else if(nivel>=50 && nivel<=74) {
        	hpTotal=150;
        }else {
        	hpTotal=200;
        }
        System.out.println("SU HP TOTAL ES: "+hpTotal);
        do {
        	System.out.println("INGRESE CUANTOS NIVELES DE EVOLUCION TIENE: ");
        	nivelEvolucion=inputConsola.nextInt();
        }while(nivelEvolucion<nivel || nivelEvolucion>100);
        
    	System.out.println("INGRESE EL PESO(kg): ");
    	peso=inputConsola.nextDouble();
    	System.out.println("INGRESE LA ALTURA(m): ");
    	altura=inputConsola.nextDouble();
    	int resp=1;
    	ArrayList<String> listadoAtaque = new ArrayList<String>();
    	while(resp==1) {
    		inputConsola.nextLine();
    		System.out.println("INGRESE EL ATAQUE DEL POKEMON: ");
    		ataque=inputConsola.nextLine();
    		listadoAtaque.add(ataque);
    		System.out.println("DESEA REGISTRAR OTRO ATAQUE SI(1)-NO(OTRO NUMERO): ");
    		resp=inputConsola.nextInt();
    	}
    	ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Roca");
    	debilidad.add("Fuego");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Acero");
    	fortaleza.add("Bicho");
    	fortaleza.add("Hielo");
    	fortaleza.add("Planta");
    	Pokemon Fuego = new PokemonFactoryMethod().getTipoP(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,altura,listadoAtaque,Tipo_Pokemon.Fuego, debilidad, fortaleza);
    	pokemon.add(Fuego);
    	return Fuego;
	}
	
	private static Pokemon registroDePokemonPikachu() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Electricidad Estatica");
		listadoAtaque.add("Bola Voltio");
		listadoAtaque.add("Chispa");
		listadoAtaque.add("Chispazo");
		listadoAtaque.add("Electrocanion");
		listadoAtaque.add("Impactrueno");
		listadoAtaque.add("Onda Voltio");
		listadoAtaque.add("Rayo");
		listadoAtaque.add("Trueno");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Eléctrico");
    	debilidad.add("Planta");
    	debilidad.add("Tierra");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Agua");
    	fortaleza.add("Volador");
		//https://www.pokemon.com/es/pokedex/pikachu
		//1. Pichu
		//2. Pikachu
		//3. Raichu
    	Pokemon Pikachu = new PokemonFactoryMethod().getTipoP("Pikachu",10,100,2,3,6,0.4,listadoAtaque,Tipo_Pokemon.Eléctrico, debilidad, fortaleza);
		return Pikachu;
	}

	private static Pokemon registroDePokemonVoltorb() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Electricidad Estatica");
		listadoAtaque.add("Insonorizar");
		listadoAtaque.add("Bola Voltio");
		listadoAtaque.add("Chispa");
		listadoAtaque.add("Chispazo");
		listadoAtaque.add("Electrocanion");
		listadoAtaque.add("Impactrueno");
		listadoAtaque.add("Onda Voltio");
		listadoAtaque.add("Rayo");
		listadoAtaque.add("Trueno");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Eléctrico");
    	debilidad.add("Planta");
    	debilidad.add("Tierra");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Agua");
    	fortaleza.add("Volador");
		//https://www.pokemon.com/es/pokedex/voltorb
		//1. Voltorb
		//2. Electrode
    	Pokemon Voltorb = new PokemonFactoryMethod().getTipoP("Voltorb",10,100,1,2,10.4,0.5,listadoAtaque,Tipo_Pokemon.Eléctrico, debilidad, fortaleza);
		return Voltorb;
	}
	
	private static Pokemon registroDePokemonPsyduck() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Torrente");
		listadoAtaque.add("Pistola de agua");
		listadoAtaque.add("Hidrobomba");
		listadoAtaque.add("Rayo Burbuja");
		listadoAtaque.add("Surf");
		listadoAtaque.add("Hidro Canon");
		listadoAtaque.add("Agua Cola");
		listadoAtaque.add("Cascada");
		listadoAtaque.add("Hidropulso");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Planta");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Fuego");
    	fortaleza.add("Roca");
    	fortaleza.add("Tierra");
		//https://www.pokemon.com/es/pokedex/psyduck
		//1. Psyduck
		//2. Golduck
    	Pokemon Psyduck = new PokemonFactoryMethod().getTipoP("Psyduck",10,100,1,2,19.6,0.8,listadoAtaque,Tipo_Pokemon.Agua, debilidad, fortaleza);
		return Psyduck;
	}
	
	private static Pokemon registroDePokemonSquirtle() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Humedad");
		listadoAtaque.add("Aclimatacion");
		listadoAtaque.add("Pistola de agua");
		listadoAtaque.add("Hidrobomba");
		listadoAtaque.add("Rayo Burbuja");
		listadoAtaque.add("Surf");
		listadoAtaque.add("Hidro Canon");
		listadoAtaque.add("Agua Cola");
		listadoAtaque.add("Cascada");
		listadoAtaque.add("Hidropulso");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Planta");
    	debilidad.add("Electrico");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Fuego");
    	fortaleza.add("Roca");
    	fortaleza.add("Tierra");
		//https://www.pokemon.com/es/pokedex/squirtle
		//1. Squirtle
		//2. Wartortle
		//3. Blastoise
    	Pokemon Squirtle = new PokemonFactoryMethod().getTipoP("Squirtle",10,100,1,3,9.0,0.5,listadoAtaque,Tipo_Pokemon.Agua, debilidad, fortaleza);
		return Squirtle;
	}
	
	private static Pokemon  registroDePokemonCharmander() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Mar Llamas");
		listadoAtaque.add("Ascuas");
		listadoAtaque.add("Giro Fuego");
		listadoAtaque.add("Lanzallamas");
		listadoAtaque.add("Llamarada");
		listadoAtaque.add("Onda Ignea");
		listadoAtaque.add("Rueda Fuego");
		listadoAtaque.add("Humareda");
		listadoAtaque.add("Pirotecnica");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Roca");
    	debilidad.add("Fuego");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Acero");
    	fortaleza.add("Bicho");
    	fortaleza.add("Hielo");
    	fortaleza.add("Planta");
		//https://www.pokemon.com/es/pokedex/charmander
		//1. Charmander
		//2. Charmeleon
		//3. Charizard
    	Pokemon Charmander = new PokemonFactoryMethod().getTipoP("Charmander",10,100,1,3,8.5,0.6,listadoAtaque,Tipo_Pokemon.Fuego, debilidad, fortaleza);
		return Charmander;
	}
	
	private static Pokemon registroDePokemonVulpix() {
		ArrayList<String> listadoAtaque = new ArrayList<String>();
		listadoAtaque.add("Absorbe Fuego");
		listadoAtaque.add("Ascuas");
		listadoAtaque.add("Giro Fuego");
		listadoAtaque.add("Lanzallamas");
		listadoAtaque.add("Llamarada");
		listadoAtaque.add("Onda Ignea");
		listadoAtaque.add("Rueda Fuego");
		listadoAtaque.add("Humareda");
		listadoAtaque.add("Pirotecnica");
		ArrayList<String> debilidad = new ArrayList<String>();
    	debilidad.add("Dragón");
    	debilidad.add("Agua");
    	debilidad.add("Roca");
    	debilidad.add("Fuego");
    	debilidad.add("Tierra");
    	ArrayList<String> fortaleza = new ArrayList<String>();
    	fortaleza.add("Acero");
    	fortaleza.add("Bicho");
    	fortaleza.add("Hielo");
    	fortaleza.add("Planta");
		//https://www.pokemon.com/es/pokedex/vulpix
		//1. Vulpix
		//2. Ninetales
        Pokemon Vulpix = new PokemonFactoryMethod().getTipoP("Vulpix",10,100,1,2,9.9,0.6,listadoAtaque,Tipo_Pokemon.Fuego, debilidad, fortaleza);
		return Vulpix;
	}
	
	private static int menu1(){
		int op;
		do{
			System.out.println("*************************************");
			System.out.println("               POKEMON");
			System.out.println("*************************************");
			System.out.println(" 	1. TIPO AGUA");
			System.out.println(" 	2. TIPO FUEGO");
			System.out.println(" 	3. TIPO ELECTRICIDAD");
			System.out.println("*************************************");
			System.out.println("ELIJA LA OPERACION: ");
	    	op=inputConsola.nextInt();
		}while(op<1 || op>3);
		return op;
	}

	private static int menu(){
		int op;
		do{
			System.out.println("**********************************************************************");
			dibujarTitulo();
			System.out.println("**********************************************************************");
			System.out.println(" 	                          MENU  ");
			System.out.println("**********************************************************************");
			System.out.println(" 	1. REGISTRAR POKEMON");
			System.out.println(" 	2. JUGAR CON UN POKEMON ALEATORIO");
			System.out.println(" 	3. JUGAR CON AMIGO");
			System.out.println(" 	4. JUGAR CON 3 POKEMONES ALEATORIOS");
			System.out.println(" 	5. MODIFICAR POKEMON");
			System.out.println(" 	6. MOSTRAR DATOS DE UN POKEMON");
			System.out.println(" 	7. LISTADO DE POKEMONES");
			System.out.println(" 	8. MOSTRAR LOS POKEMONES QUE ESTA REGISTRADO SEGUN SU TIPO");
			System.out.println("**********************************************************************");
			System.out.println("ELIJA LA OPERACION: ");
	    	op=inputConsola.nextInt();
		}while(op<1 || op>8);
		return op;
	}
	
	private static void dibujarVS() {
		String vs="\t  xxxxxxxx                     xxxxxxxx       xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+ "\t    xxxxxxxx                 xxxxxxxx         xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+ "\t      xxxxxxxx             xxxxxxxx           xxxxxxxxxxx\r\n"
				+ "\t        xxxxxxxx         xxxxxxxx             xxxxxxxxxxx\r\n"
				+ "\t          xxxxxxxx     xxxxxxxx               xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+ "\t            xxxxxxxx xxxxxxxx                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+ "\t              xxxxxxxxxxxxx                                       xxxxxxxxxxx\r\n"
				+ "\t                xxxxxxxxx                                         xxxxxxxxxxx\r\n"
				+ "\t                  xxxxx                       xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+ "\t                    x                         xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\r\n"
				+"";
		System.out.println(vs);
	}
	
	private static void dibujarTitulo() {
		String s = "                                ,'\\\r\n"
				+ "    _.----.        ____         ,'  _\\   ___    ___     ____\r\n"
				+ "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n"
				+ "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n"
				+ " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n"
				+ "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n"
				+ "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n"
				+ "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n"
				+ "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n"
				+ "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n"
				+ "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n"
				+ "                                `'                            '-._|";
		System.out.println(s);
	}

}
