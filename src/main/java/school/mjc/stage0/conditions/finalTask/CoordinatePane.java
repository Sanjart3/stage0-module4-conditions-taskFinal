package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        int side;
        if (x==0&&y==0){
            System.out.println("zero");
        }else{
            if (x>=0){
                if (y>=0) side=1;
                else side = 2;
            }else {
                if (y>=0) side=3;
                else side = 4;
            }
            System.out.println(side);
        }
    }
}
