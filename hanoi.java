import javax.swing.JOptionPane;

public class hanoi {
		static int compt;
	    public static void hanoi(int n, String from, String temp, String to) {
	        if (n == 0) return;
	        hanoi(n-1, from, to, temp);
	        compt++;
	        System.out.println("Bougez le disque " + n + " de " + from + " à " + to);
	        hanoi(n-1, temp, from, to);
	    }
	    public static void main(String[] args) {
	    	String a;
	    	int n;
	    	compt = 0;
	    	a = JOptionPane.showInputDialog("Combien de diques ?");
	    	n = Integer.parseInt(a);
	        hanoi(n, "A", "B", "C");
	        System.out.println("Le nombre de coup minimum est : "+compt);
	    }
}