package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String side;
        if (x==0&&y==0){
            System.out.println("zero");
        }else{
            if (y>=0){
                if (x>=0) side="first";
                else side = "second";
            }else {
                if (x>=0) side="third";
                else side = "fourth";
            }
            System.out.println(side);
        }
    }
}
