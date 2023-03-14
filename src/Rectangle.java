public class Rectangle {
    int sideA;
    int sideB;
    int sideC;
    int sideD;

    public Rectangle(int sideA,int sideB,int sideC,int sideD){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    public Rectangle(){

    }

    @Override
    public String toString() {
        return "Rectangle: \n" +
                "sideA: " + sideA +"\n"+
                "sideB:" + sideB +"\n"+
                "sideC: " + sideC +"\n"+
                "sideD: " + sideD;
    }
}

