
public class WhiteBox extends BlackBox implements Box{
	
	
	WhiteBox(){}
	
	WhiteBox(int width, int height){
		
		super(width,height);
		
	}
	WhiteBox(char c){
		super(c);
	}
	
	public void print(){
    
		for(int i=0; i<height;i++){
			
			for(int j=0; j<width;j++){
				if((i==0) || (i==height-1)){
				System.out.print(fc);
				}
				else if (j==0 || j==width-1){
						System.out.print(fc);
					}
				else System.out.print(" ");
			}
			System.out.println("");
			}
		}

	
	
}
