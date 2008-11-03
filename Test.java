
public class Test {

	/**
	 * @param args
	 * @author: Ormos Mark, 0626435
	 */
	public static void main(String[] args) {
		
		
			
				Box blackbox = new BlackBox();
				
				blackbox.setSize(10,5);
				blackbox.setFrameChar('*');
				blackbox.print();
				
				blackbox.setSize(2,11);
				
				
				System.out.println("");
				
				Box whitebox = new WhiteBox();
				
				whitebox.setSize(10,5);
				whitebox.setFrameChar('*');
				whitebox.print();
				
				System.out.println("");
				
				Box greybox = new GreyBox('|');
				
				greybox.setSize(10,5);
				greybox.setFrameChar('*');
				greybox.print();
				
				System.out.println("");
				
				Box coloredbox = new ColoredBox('*','&');
				
				coloredbox.setSize(10,5);
				coloredbox.print();
				coloredbox.setFrameChar('-');
				((ColoredBox) coloredbox).setFillChar('@');
				coloredbox.print();
				
				
			
	}

}
