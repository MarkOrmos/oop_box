
public class WhiteBox extends BlackBox implements Box{
	
//	fuellzeichen gesetzt damit die methode print() vererbt werden kann
	protected char fz = ' ';
	
	
//	Konstruktor
	WhiteBox(int width, int height, char fc){
		
		super(width,height,fc);
		
	}
	
//	die print() methode wird veraendert 
//	die anderen methoden bleiben unveraendert, verden von BlackBox geerbt
	public void print(){
    
		for(int i=0; i<height;i++){
			
			for(int j=0; j<width;j++){
				if((i==0) || (i==height-1)){
				System.out.print(fc);
				}
				else if (j==0 || j==width-1){
						System.out.print(fc);
					}
				else System.out.print(fz);
			}
			System.out.println("");
			}
		}

	
	
}
