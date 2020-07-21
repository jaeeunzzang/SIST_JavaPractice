package practiceJava;

public class Tile {
	final static String tile[][] = new String[4][4];
	static {
		for (int i = 0; i < tile.length; i++) {
			if (i == 0)
				tile[i][0] = "* ";
			if (i == 1)
				tile[i][0] = "1 ";
			if (i == 2)
				tile[i][0] = "2 ";
			if (i == 3)
				tile[i][0] = "3 ";

			for (int j = 0; j < tile.length; j++) {
				if (i == 0) {
					{
						if (j == 1)
							tile[0][j] = "1 ";
						if (j == 2)
							tile[0][j] = "2 ";
						if (j == 3)
							tile[0][j] = "3 ";
					}
				}
				if (tile[i][j] == null)
					tile[i][j] = "0 ";
			}
		}
	}

	
}
