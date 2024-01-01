package ec.edu.upse.tics.s2021_1.poo.pokemon.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PokemonElectrico extends Pokemon {
	
	public PokemonElectrico(String nombre, int experiencia, int hpTotal, int nivel, int nivelEvolucion, double peso,
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
		if (otroPokemon.getTipoPokemon()==Tipo_Pokemon.Agua) {
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Volador){
			aleatorio=ThreadLocalRandom.current().nextInt(25, 30 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Dragón){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Eléctrico){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Planta){
			aleatorio=ThreadLocalRandom.current().nextInt(20, 25 + 1);
			reducir=(otroPokemon.hpTotal-aleatorio);
			otroPokemon.setHpTotal(reducir);
		}else if(otroPokemon.getTipoPokemon()==Tipo_Pokemon.Tierra){
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
		String s = "quu..__\r\n"
				+ " $$$b  `---.__\r\n"
				+ "  \"$$b        `--.                          ___.---uuudP\r\n"
				+ "   `$$b           `.__.------.__     __.---'      $$$$\"              .\r\n"
				+ "     \"$b          -'            `-.-'            $$$\"              .'|\r\n"
				+ "       \".                                       d$\"             _.'  |\r\n"
				+ "         `.   /                              ...\"             .'     |\r\n"
				+ "           `./                           ..::-'            _.'       |\r\n"
				+ "            /                         .:::-'            .-'         .'\r\n"
				+ "           :                          ::''\\          _.'            |\r\n"
				+ "          .' .-.             .-.           `.      .'               |\r\n"
				+ "          : /'$$|           .@\"$\\           `.   .'              _.-'\r\n"
				+ "         .'|$u$$|          |$$,$$|           |  <            _.-'\r\n"
				+ "         | `:$$:'          :$$$$$:           `.  `.       .-'\r\n"
				+ "         :                  `\"--'             |    `-.     \\\r\n"
				+ "        :##.       ==             .###.       `.      `.    `\\\r\n"
				+ "        |##:                      :###:        |        >     >\r\n"
				+ "        |#'     `..'`..'          `###'        x:      /     /\r\n"
				+ "         \\                                   xXX|     /    ./\r\n"
				+ "          \\                                xXXX'|    /   ./\r\n"
				+ "          /`-.                                  `.  /   /\r\n"
				+ "         :    `-  ...........,                   | /  .'\r\n"
				+ "         |         ``:::::::'       .            |<    `.\r\n"
				+ "         |             ```          |           x| \\ `.:``.\r\n"
				+ "         |                         .'    /'   xXX|  `:`M`M':.\r\n"
				+ "         |    |                    ;    /:' xXXX'|  -'MMMMM:'\r\n"
				+ "         `.  .'                   :    /:'       |-'MMMM.-'\r\n"
				+ "          |  |                   .'   /'        .'MMM.-'\r\n"
				+ "          `'`'                   :  ,'          |MMM<\r\n"
				+ "            |                     `'            |tbap\\\r\n"
				+ "             \\                                  :MM.-'\r\n"
				+ "              \\                 |              .''\r\n"
				+ "               \\.               `.            /\r\n"
				+ "                /     .:::::::.. :           /\r\n"
				+ "               |     .:::::::::::`.         /\r\n"
				+ "               |   .:::------------\\       /\r\n"
				+ "              /   .''               >::'  /\r\n"
				+ "              `',:                 :    .'\r\n"
				+ "                                   `:.:' Tim Park";
		System.out.println(s);
	}
	
	public static void dibujarRepresentacion() {
		String s = "    4$$$$$$$$$$$$$\"\r\n"
				+ "   z$$$$$$$$$$$$$\"\r\n"
				+ "    \"\"\"\"\"\"3$$$$$\"\r\n"
				+ "         z$$$$P\r\n"
				+ "        z$$$$$\"\r\n"
				+ "       z$$$$P\r\n"
				+ "      d$$$$$$$$$$\"\r\n"
				+ "     ********$$$\"\r\n"
				+ "            4$P\"\r\n"
				+ "           z$\"\r\n"
				+ "          zP\r\n"
				+ "         z\"";
		System.out.println(s);
	}
	
	public static void dibujarRepresentacionConEspacio() {
		String s = "\t\t\t\t\t\t\t\t\t    4$$$$$$$$$$$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t   z$$$$$$$$$$$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t    \"\"\"\"\"\"3$$$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t         z$$$$P\r\n"
				+ "\t\t\t\t\t\t\t\t\t        z$$$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t       z$$$$P\r\n"
				+ "\t\t\t\t\t\t\t\t\t      d$$$$$$$$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t     ********$$$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t            4$P\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t           z$\"\r\n"
				+ "\t\t\t\t\t\t\t\t\t          zP\r\n"
				+ "\t\t\t\t\t\t\t\t\t         z\"";
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "PokemonElectrico [" + (tipoPokemon != null ? "tipoPokemon=" + tipoPokemon + ", " : "")
				+ (Debilidad != null ? "Debilidad=" + Debilidad + ", " : "")
				+ (Fortaleza != null ? "Fortaleza=" + Fortaleza : "") + "]";
	}
}
