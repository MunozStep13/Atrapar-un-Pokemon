package ec.edu.upse.tics.s2021_1.poo.pokemon.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PokemonFuego extends Pokemon{
	
	public PokemonFuego(String nombre, int experiencia, int hpTotal, int nivel, int nivelEvolucion, double peso,
			double altura, ArrayList<String> listaAtaque, Tipo_Pokemon tipoPokemon, ArrayList<String> debilidad,
			ArrayList<String> fortaleza) {
		super(nombre, experiencia, hpTotal, nivel, nivelEvolucion, peso, altura, listaAtaque, tipoPokemon, debilidad,
				fortaleza);
	}

	public void atacar(Pokemon otroPokemon){
		int reducir=0;
		int aleatorio;
		//25 al 30 Fortaleza
		//20 al 25 Debilidad
		if (otroPokemon.getTipoPokemon()==Tipo_Pokemon.Acero) {
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Bicho){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Hielo){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Planta){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Dragón){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Agua){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Roca){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Planta){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=otroPokemon.hpTotal-aleatorio;
			otroPokemon.setHpTotal(reducir);
		}else {
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}
		
		if(reducir<0 && reducir>201) {
			System.out.println(otroPokemon.nombre+" se ha desmayado");
		}
	}
	
	public static void dibujarRepresentacion() {
		String s = "\t  ,    /),\r\n"
				+ "\t  (( -.((_))  _,)\r\n"
				+ "\t  ,\\`.'_  _`-','\r\n"
				+ "\t  `.> <> <>  (,-\r\n"
				+ "\t ,',    |     `._,)\r\n"
				+ "\t((  )   |,   (`--'\r\n"
				+ "\t `'( ) _--_,-.\\ SSt\r\n"
				+ "\t    /,' \\( )  `'\r\n"
				+ "\t   ((    `\\\r\n"
				+ "\t    `";
		System.out.println(s);
	}
	
	public static void dibujarRepresentacionConEspacio() {
		String s = "\t\t\t\t\t\t\t\t\t\t  ,    /),\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t  (( -.((_))  _,)\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t  ,\\`.'_  _`-','\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t  `.> <> <>  (,-\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t ,',    |     `._,)\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t((  )   |,   (`--'\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t `'( ) _--_,-.\\ SSt\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t    /,' \\( )  `'\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t   ((    `\\\r\n"
				+ "\t\t\t\t\t\t\t\t\t\t    `";
		System.out.println(s);
	}
	
	public static void dibujar() {
		String s = "              _.--\"\"`-..\r\n"
				+ "            ,'          `.\r\n"
				+ "          ,'          __  `.\r\n"
				+ "         /|          \" __   \\\r\n"
				+ "        , |           / |.   .\r\n"
				+ "        |,'          !_.'|   |\r\n"
				+ "      ,'             '   |   |\r\n"
				+ "     /              |`--'|   |\r\n"
				+ "    |                `---'   |\r\n"
				+ "     .   ,                   |                       ,\".\r\n"
				+ "      ._     '           _'  |                    , ' \\ `\r\n"
				+ "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\r\n"
				+ "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\r\n"
				+ "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\r\n"
				+ "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\r\n"
				+ "    `.      '            '            /          '    |'. |/\r\n"
				+ "      `.   |              \\       _,-'           |       ''\r\n"
				+ "        `._'               \\   '\"\\                .      |\r\n"
				+ "           |                '     \\                `._  ,'\r\n"
				+ "           |                 '     \\                 .'|\r\n"
				+ "           |                 .      \\                | |\r\n"
				+ "           |                 |       L              ,' |\r\n"
				+ "           `                 |       |             /   '\r\n"
				+ "            \\                |       |           ,'   /\r\n"
				+ "          ,' \\               |  _.._ ,-..___,..-'    ,'\r\n"
				+ "         /     .             .      `!             ,j'\r\n"
				+ "        /       `.          /        .           .'/\r\n"
				+ "       .          `.       /         |        _.'.'\r\n"
				+ "        `.          7`'---'          |------\"'_.'\r\n"
				+ "       _,.`,_     _'                ,''-----\"'\r\n"
				+ "   _,-_    '       `.     .'      ,\\\r\n"
				+ "   -\" /`.         _,'     | _  _  _.|\r\n"
				+ "    \"\"--'---\"\"\"\"\"'        `' '! |! /\r\n"
				+ "                            `\" \" -' mh";
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "PokemonFuego [" + (tipoPokemon != null ? "tipoPokemon=" + tipoPokemon + ", " : "")
				+ (Debilidad != null ? "Debilidad=" + Debilidad + ", " : "")
				+ (Fortaleza != null ? "Fortaleza=" + Fortaleza : "") + "]";
	}
}
