package ec.edu.upse.tics.s2021_1.poo.pokemon.model;

import java.util.ArrayList;

public abstract class Pokemon {
	
	protected String nombre ;
	protected int experiencia;
	protected int hpTotal;
	protected int nivel;
	protected int nivelEvolucion;
	protected double peso;  //metros
	protected double altura;  //Kg
	protected ArrayList<String> listaAtaque;
	protected Tipo_Pokemon tipoPokemon;
	protected ArrayList<String>Debilidad=new ArrayList<String>();
	protected ArrayList<String>Fortaleza=new ArrayList<String>();
	
	
	//Constructor 
	public Pokemon(String nombre, int experiencia, int hpTotal, int nivel, int nivelEvolucion, double peso,
			double altura, ArrayList<String> listaAtaque, Tipo_Pokemon tipoPokemon, ArrayList<String> debilidad,
			ArrayList<String> fortaleza) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.hpTotal = hpTotal;
		this.nivel = nivel;
		this.nivelEvolucion = nivelEvolucion;
		this.peso = peso;
		this.altura = altura;
		this.listaAtaque = listaAtaque;
		this.tipoPokemon = tipoPokemon;
		Debilidad = debilidad;
		Fortaleza = fortaleza;
	}

	//Constructor_de_copia
	public Pokemon(Pokemon otroPokemon)
	{
		this.nombre = otroPokemon.nombre;
		this.experiencia = otroPokemon.experiencia;
		this.hpTotal = otroPokemon.hpTotal;
		this.nivel = otroPokemon.nivel;
		this.nivelEvolucion = otroPokemon.nivelEvolucion;
		this.peso = otroPokemon.peso;
		this.altura = otroPokemon.altura;
		this.listaAtaque = new ArrayList<String>(otroPokemon.listaAtaque);
		
	}
	
	//Metodos
	public void agregarAtaqueDePokemon(String Ataques)
	{
		if(!listaAtaque.contains(Ataques))
		{
			//this.listaAtaque.add(Ataques);
			this.listaAtaque.add(Ataques);
			System.out.println("\nEL ATAQUE AGREGADO A LA LISTA ES: " + Ataques);
		}else {
			System.err.println("\nATAQUE REPETIDO: "+ Ataques);
		}
		
	}
	
	public abstract void atacar(Pokemon otroPokemon);
	
	public void cambioDeNombre(Pokemon miPokemon){
		if(miPokemon.getNombre()=="Charmander"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Charmeleon");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Charmander aumento de  nivel ahora se llama Charmeleon");
			}
		}else if(miPokemon.getNombre()=="Charmeleon"){
			if(miPokemon.getExperiencia()>=201 && miPokemon.getExperiencia()<=300) {
				miPokemon.setNombre("Charizard");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Charmeleon aumento de  nivel ahora se llama Charizard");
			}
		}else if (miPokemon.getNombre()=="Vulpix"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Ninetales");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Vulpix aumento de  nivel ahora se llama Ninetales");
			}
		}else if(miPokemon.getNombre()=="Pichu") {
			if(miPokemon.getExperiencia()>=1 && miPokemon.getExperiencia()<=10) {
				miPokemon.setNombre("Pikachu");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Pichu aumento de  nivel ahora se llama Pikachu");
			}
		}else if(miPokemon.getNombre()=="Pikachu"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Raichu");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Pikachu aumento de  nivel ahora se llama Raichu");
			}
		}else if(miPokemon.getNombre()=="Voltorb"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Electrode");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Voltorb aumento de  nivel ahora se llama Electrode");
			}
		}if(miPokemon.getNombre()=="Psyduck"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Golduck");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Psyduck aumento de  nivel ahora se llama Golduck");
			}
		}else if (miPokemon.getNombre()=="Squirtle"){
			if(miPokemon.getExperiencia()>=101 && miPokemon.getExperiencia()<=200) {
				miPokemon.setNombre("Wartortle");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Squirtle aumento de  nivel ahora se llama Wartortle");
			}
		}else if(miPokemon.getNombre()=="Wartortle"){
			if(miPokemon.getExperiencia()>=201 && miPokemon.getExperiencia()<=300) {
				miPokemon.setNombre("Blastoise");
				miPokemon.setNivel(miPokemon.getNivel()+1);
				System.out.println("Wartortle aumento de  nivel ahora se llama Blastoise");
			}
		}	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHpTotal() {
		return hpTotal;
	}

	public void setHpTotal(int hpTotal) {
		this.hpTotal = hpTotal;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getNivelEvolucion() {
		return nivelEvolucion;
	}

	public void setNivelEvolucion(int nivelEvolucion) {
		this.nivelEvolucion = nivelEvolucion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public ArrayList<String> getListaAtaque() {
		return this.listaAtaque;
	}

	public void setListaAtaque(ArrayList<String> listaAtaque) {
		this.listaAtaque = listaAtaque;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Tipo_Pokemon getTipoPokemon() {
		return tipoPokemon;
	}

	public void setTipoPokemon(Tipo_Pokemon tipoPokemon) {
		this.tipoPokemon = tipoPokemon;
	}

	public ArrayList<String> getDebilidad() {
		return Debilidad;
	}

	public void setDebilidad(ArrayList<String> debilidad) {
		Debilidad = debilidad;
	}

	public ArrayList<String> getFortaleza() {
		return Fortaleza;
	}

	public void setFortaleza(ArrayList<String> fortaleza) {
		Fortaleza = fortaleza;
	}

	@Override
	public String toString() {
		return "Pokemon [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "hpPorcentaje=" + experiencia
				+ ", hpTotal=" + hpTotal + ", nivel=" + nivel + ", nivelEvolucion=" + nivelEvolucion + ", peso=" + peso
				+ ", altura=" + altura + ", " + (listaAtaque != null ? "listaAtaque=" + listaAtaque : "") + "]";
	}
}
