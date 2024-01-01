package ec.edu.upse.tics.s2021_1.poo.pokemon.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class PokemonAgua extends Pokemon {
	
	public PokemonAgua(String nombre, int experiencia, int hpTotal, int nivel, int nivelEvolucion, double peso,
			double altura, ArrayList<String> listaAtaque, Tipo_Pokemon tipoPokemon, ArrayList<String> debilidad,
			ArrayList<String> fortaleza) {
		super(nombre, experiencia, hpTotal, nivel, nivelEvolucion, peso, altura, listaAtaque, tipoPokemon, debilidad,
				fortaleza);
	}
	
	public void atacar(Pokemon otroPokemon){
		int reducir = 0;
		int aleatorio;
		//25 al 30 Fortaleza
		//20 al 25 Debilidad
		if (otroPokemon.getTipoPokemon()==Tipo_Pokemon.Roca) {
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Fuego){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Tierra){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Dragón){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Agua){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Planta){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
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

	public static void dibujar() {
		String s = "           _,........__\r\n"
				+ "            ,-'            \"`-.\r\n"
				+ "          ,'                   `-.\r\n"
				+ "        ,'                        \\\r\n"
				+ "      ,'                           .\r\n"
				+ "      .'\\               ,\"\".       `\r\n"
				+ "     ._.'|             / |  `       \\\r\n"
				+ "     |   |            `-.'  ||       `.\r\n"
				+ "     |   |            '-._,'||       | \\\r\n"
				+ "     .`.,'             `..,'.'       , |`-.\r\n"
				+ "     l                       .'`.  _/  |   `.\r\n"
				+ "     `-.._'-   ,          _ _'   -\" \\  .     `\r\n"
				+ "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\r\n"
				+ ".'        `\"-..___      __,'\\          \\  \\     \\\r\n"
				+ "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\r\n"
				+ "  `.          |              `.          |  .     L\r\n"
				+ "    `.        |`--...________.'.        j   |     |\r\n"
				+ "      `._    .'      |          `.     .|   ,     |\r\n"
				+ "         `--,\\       .            `7\"\"' |  ,      |\r\n"
				+ "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\r\n"
				+ "             \\ `.     .          /      |  '      |  ,'          `.\r\n"
				+ "              \\  v.__  .        '       .   \\    /| /              \\\r\n"
				+ "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\r\n"
				+ "                `        .        `._ ___,j.  `/ .-       ,---.     |\r\n"
				+ "                ,`-.      \\         .\"     `.  |/        j     `    |\r\n"
				+ "               /    `.     \\       /         \\ /         |     /    j\r\n"
				+ "              |       `-.   7-.._ .          |\"          '         /\r\n"
				+ "              |          `./_    `|          |            .     _,'\r\n"
				+ "              `.           / `----|          |-............`---'\r\n"
				+ "                \\          \\      |          |\r\n"
				+ "               ,'           )     `.         |\r\n"
				+ "                7____,,..--'      /          |\r\n"
				+ "                                  `---.__,--.'mh";
		System.out.println(s);
	}
	
	public static void dibujarRepresentacion() {
		String s = "                r                \r\n"
				+ "               ain\r\n"
				+ "               rai\r\n"
				+ "              nrain\r\n"
				+ "             rainrai\r\n"
				+ "            nrainrain\r\n"
				+ "           ainrainrain\r\n"
				+ "          rainrainrainr\r\n"
				+ "         ainrainrainrain\r\n"
				+ "        rainrainrainrainr\r\n"
				+ "      ainrainrainrainrainra\r\n"
				+ "    inran rainrainrainrainrai\r\n"
				+ "   raini  nrainrainrainrainrai\r\n"
				+ "    ainn  nrainrainrainrainra\r\n"
				+ "      nra  inrainrainrainra\r\n"
				+ "        inrainrainrainrai\r\n";
		System.out.println(s);
	}
	
	public static void dibujarRepresentacionConEspacio() {
		String s = "\t\t\t\t\t\t\t\t\t                r                \r\n"
				+ "\t\t\t\t\t\t\t\t\t               ain\r\n"
				+ "\t\t\t\t\t\t\t\t\t               rai\r\n"
				+ "\t\t\t\t\t\t\t\t\t              nrain\r\n"
				+ "\t\t\t\t\t\t\t\t\t             rainrai\r\n"
				+ "\t\t\t\t\t\t\t\t\t            nrainrain\r\n"
				+ "\t\t\t\t\t\t\t\t\t           ainrainrain\r\n"
				+ "\t\t\t\t\t\t\t\t\t          rainrainrainr\r\n"
				+ "\t\t\t\t\t\t\t\t\t         ainrainrainrain\r\n"
				+ "\t\t\t\t\t\t\t\t\t        rainrainrainrainr\r\n"
				+ "\t\t\t\t\t\t\t\t\t      ainrainrainrainrainra\r\n"
				+ "\t\t\t\t\t\t\t\t\t    inran rainrainrainrainrai\r\n"
				+ "\t\t\t\t\t\t\t\t\t   raini  nrainrainrainrainrai\r\n"
				+ "\t\t\t\t\t\t\t\t\t    ainn  nrainrainrainrainra\r\n"
				+ "\t\t\t\t\t\t\t\t\t      nra  inrainrainrainra\r\n"
				+ "\t\t\t\t\t\t\t\t\t        inrainrainrainrai\r\n";
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "PokemonAgua [" + (tipoPokemon != null ? "tipoPokemon=" + tipoPokemon + ", " : "")
				+ (Debilidad != null ? "Debilidad=" + Debilidad + ", " : "")
				+ (Fortaleza != null ? "Fortaleza=" + Fortaleza : "") + "]";
	}

	
}
