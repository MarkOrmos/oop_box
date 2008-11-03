
public class Test {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		
			
				Box blackbox = new BlackBox(10,5,'*');
				blackbox.print();
				
				System.out.println("");
				
				Box whitebox = new WhiteBox(10,5,'*');
				whitebox.print();
				
				System.out.println("");
				
				Box greybox = new GreyBox(10,5,'*','|');
				greybox.print();
				
				System.out.println("");
				
				Box coloredbox = new ColoredBox(10,5,'*','&');
				coloredbox.print();
				
				System.out.println("");
				
				coloredbox.setFrameChar('/');
				((ColoredBox) coloredbox).setFillChar('@');
				coloredbox.print();
				
				
			
	}

}
