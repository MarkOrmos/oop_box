
public class Test {

	/**
	 * main-Klasse zum testen 
	 * @author Ben, Mark, Matthias
	 */
	public static void main(String[] args) {
		
		
//			Test1:BlackBox mit Paramerteuebergabe im Konstruktor
				Box blackbox = new BlackBox(10,5,'*');
				blackbox.print();
				System.out.println("");
				
//			Test2:BlackBox mit Aenderung 
				blackbox.setSize(20,5);
				blackbox.setFrameChar('#');
				blackbox.print();
				System.out.println("");
				
//			Test3: WhiteBox mit Parameteruebergabe im Konstruktor
				Box whitebox = new WhiteBox(10,5,'*');
				whitebox.print();
				System.out.println("");
				
//			Test4: WhiteBox mit Aenderung
				whitebox.setSize(20, 5);
				whitebox.setFrameChar('#');
				whitebox.print();
				System.out.println(" ");
				
//			Test5: Greybox mit Parameteruebergabe im Konstruktor
				Box greybox = new GreyBox(10,5,'*','|');
				greybox.print();
				System.out.println("");

//			Test6: GreyBox mit Aenderung
				greybox.setSize(20, 5);
				greybox.setFrameChar('#');
				greybox.print();
				System.out.println(" ");
				
//			Test7: ColoredBox mit Parametreuebergabe im Konstruktor
				Box coloredbox = new ColoredBox(10,5,'*','&');
				coloredbox.print();
				System.out.println("");
				
//			Test8: ColoredBox mit Aenderung
				coloredbox.setSize(20, 5);
				coloredbox.setFrameChar('/');
				((ColoredBox) coloredbox).setFillChar('@');
				coloredbox.print();
				
				
			
	}

}
