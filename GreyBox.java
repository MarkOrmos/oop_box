
public class GreyBox extends WhiteBox implements Box{

	
	
	
	GreyBox(char fz){
	
		this.fz=fz;
	}
	GreyBox(int width, int height, char c, char fz){
		
		super(width,height,c);
		this.fz=fz;
	}

	
	

	
	
	
}
