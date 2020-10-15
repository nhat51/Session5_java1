package ss5.ex2;

public class point {
    int x,y;
    public point(){
        x = 0;
        y = 0;
    }
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //the public getter and setter
    public int getX(){return this.x;}
    public int setX(int x){return this.x = x;}

    public int getY(){return  this.y;}
    public int setY(int y){return this.y = y;}

    public String toString() {
        return "point{" + "x=" + x + ", y=" + y + '}';
    }
    public int[] getXY(){
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
     }
     public void setXY(int x,int y){
        this.x = x;
        this.y = y;
     }
     public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
     }
     public double distance(point another){
         int xDiff = this.x - another.x;
         int yDiff = this.y - another.y;
         return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
     }
     public double distance(){return this.x*this.x+this.y*this.y;}
}
