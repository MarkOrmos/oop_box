
public class ColoredBox extends WhiteBox{

	
	
	ColoredBox(int width, int height,char c, char fz) {
		super(width,height,c);
		this.fz=fz;
		
	}
	
	
	public void setFillChar(char fz){
		
		this.fz=fz;
		
	}
}
