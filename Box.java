
public interface Box {
       // instances represent rectangular boxes
       //   consisting of printable characters
     void print();
       // writes several lines representing
       //   the box "this" to standard output
     void setSize(int width, int height);
       // 3 <= width <= 40; 3 <= height <= 10 (preconditions)
       // sets the size of the frame of the box
     void setFrameChar(char fc);
       // the frame of the box consists of fc
   }