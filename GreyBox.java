
public class GreyBox extends WhiteBox implements Box{

	
	protected final char fz;
	
	GreyBox(char fz){
	
		this.fz=fz;
	}
	GreyBox(int width, int height, char c, char fz){
		
		super(width,height,c);
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

	
	
	
}
