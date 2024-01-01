package ec.edu.upse.tics.s2021_1.poo.pokemon.model;

import java.util.ArrayList;

public class PokemonFactoryMethod {
	
	public Pokemon getTipoP(String nombre, int experiencia, int hpTotal, int nivel, int nivelEvolucion, double peso,
			double altura, ArrayList<String> listaAtaque, Tipo_Pokemon tipoPokemon, ArrayList<String> debilidad,
			ArrayList<String> fortaleza) {
		if(tipoPokemon==Tipo_Pokemon.Agua) {
			return new PokemonAgua(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,
					altura,listaAtaque,tipoPokemon,debilidad,fortaleza);
		}
		
		if(tipoPokemon==Tipo_Pokemon.Eléctrico) {
			return new PokemonAgua(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,
					altura,listaAtaque,tipoPokemon,debilidad,fortaleza);
		}
		
		if(tipoPokemon==Tipo_Pokemon.Fuego) {
			return new PokemonAgua(nombre,experiencia,hpTotal,nivel,nivelEvolucion,peso,
					altura,listaAtaque,tipoPokemon,debilidad,fortaleza);
		}
		
		return null;
	}
	
}
