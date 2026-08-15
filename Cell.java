public class Cell{
    private boolean alive;
    private int x,y;

    public Cell(int precent, int x, int y){
        this.x = x;
        this.y = y;
        int rand = (int)(Math.random()*100);
        this.alive = rand<precent;
    }

    public int getX(){return this.x;}
    public int getY(){return this.y;}
    public boolean isAlive(){return alive;}
    public void setAlive(boolean alive){this.alive = alive;}
    public String toString(){
        if(isAlive()){
            return "X";
        }else{
            return " ";
        }
    }
    
}
