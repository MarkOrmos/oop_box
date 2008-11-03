
public class ColoredBox extends WhiteBox{

	private char fz;
	
	ColoredBox(char c, char fz) {
		super(c);
		this.fz=fz;
		
	}
	public void print(){
		   
		for(int i=0; i<height;i++){
			
			for(int j=0; j<width;j++){
				if ((i==0) || (i==height-1)){
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

	
	
	
	public void setFillChar(char fz){
		
		this.fz=fz;
		
	}
}
