
public class BlackBox implements Box{
	
	protected int height;
	protected int width;
	protected char fc;
	
	BlackBox(){}

	BlackBox(int width, int height){
		
		setSize(width,height);
		
	}
	BlackBox(char c){
			setFrameChar(c);
	}
	
	public void print(){
    
		for(int i=0; i<height;i++){
			
			for(int j=0; j<width;j++){
				System.out.print(this.fc);
			}
			System.out.println("");
			}
		}

	public void setSize(int width, int height){
    
	if ((3<=width)&&(width<=40)&&(3<=height)&&(height<=10)){
		this.height=height;
		this.width=width;
	}
	else System.out.println("Frame-size invalid!");
	}
	public void setFrameChar(char fc){
		this.fc=fc;
	}
}
	
