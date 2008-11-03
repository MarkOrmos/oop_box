/**
 * 
 * Interface Box
 * instances represent rectangular boxes consisting of printable characters
 * 
 */
public interface Box {
       
	/**
     * writes several lines representing the box "this" to standard output    
     */
     void print();
       
     /**
      * sets the size of the frame of the box
      * preconditions: 3 <= width <= 40; 3 <= height <= 10 
      * 
      * @param width width of the box
      * @param height height of the box
      */
     void setSize(int width, int height);
       
     /**
      * the frame of the box consists of fc
      * 
      * @param fc frametype 
      */
     void setFrameChar(char fc);
       
   }