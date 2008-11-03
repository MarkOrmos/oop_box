
public class BlackBox implements Box{
	
	protected int height;				// protected damit in unterklassen sichtbar 
	protected int width;
	protected char fc;
	
	BlackBox(){}						// Defaultkonstruktor

	BlackBox(int width, int height,char c){	//hoehe, breite und framecharakter werden im konstruktor uebergeben
		
		setSize(width,height);			// mit setSize gesetzt damit vorbedingung ueberprueft wird
		setFrameChar(c);
	}

	
	public void print(){									//gibt box aus
    
		for(int i=0; i<height;i++){
			
			for(int j=0; j<width;j++){
				System.out.print(fc);
			}
			System.out.println("");
			}
		}

	public void setSize(int width, int height){					//setter
    
	if ((3<=width)&&(width<=40)&&(3<=height)&&(height<=10)){	//vorbedingung
		this.height=height;
		this.width=width;
	}
	else System.out.println("Frame-size invalid!");				//warnung falls bedingung nicht erfuellt
	}
	public void setFrameChar(char fc){							//setter
		this.fc=fc;
	}
}
	
