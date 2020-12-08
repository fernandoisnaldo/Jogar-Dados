
import java.util.Random;

/*
 * Copyright (C) 2020 Fernando Isnaldo Silva de Faria
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Fernando Isnaldo Silva de Faria
 */
public class DispararDados {

    /**
     * Defina o número de lados e obtenha 1 face
     * @param args Insira o número de lados do dado ao invocar o programa por interface de linhas de comando.
     * Exemplo de comando: java DispararDados 6
     */
    public static void main(String[] args) {
        Random dado = new Random();
        float face = dado.nextFloat()*Short.parseShort(args[0]);
        System.out.println(1+(short)face);
        System.exit(0);
    }
    
}
