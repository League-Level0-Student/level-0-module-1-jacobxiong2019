import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
		String badgerLyrics = "";
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 12; i++)
			{
				badgerLyrics = badgerLyrics + "badger ";
			}
			for(int i = 0; i < 2; i++) 
			{
				badgerLyrics = badgerLyrics + "mushroom " ;
		
			}
			badgerLyrics = badgerLyrics + "\n";
		}
		for(int i = 0; i < 5; i++)
		{
			if(i == 0 || i == 1 || i == 3)
			{
				badgerLyrics = badgerLyrics + "A ";
			}
			else if(i == 4)
			{
				badgerLyrics = badgerLyrics + "Oooh, it's a ";
			}
			badgerLyrics = badgerLyrics + "snake! ";
		}
		JOptionPane.showMessageDialog(null, badgerLyrics);
	}
}

