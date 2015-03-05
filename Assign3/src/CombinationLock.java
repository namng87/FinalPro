public class CombinationLock {
    private int CombinationNumber_1;
    private int CombinationNumber_2;
    private int CombinationNumber_3;
    private int DialNumber = 0;
    private int  MAX = 40;
    
    public  CombinationLock() {
        CombinationNumber_1 = MAX;
        CombinationNumber_2 = MAX;
        CombinationNumber_3 = MAX;
        DialNumber = 0;
    }
    
    public  CombinationLock(int CN1,int CN2, int CN3) {
        CombinationNumber_1 = CN1;
        CombinationNumber_2 = CN2;
        CombinationNumber_3 = CN3;
    }


    public void setCombinationNumber_1(int CombinationNumber_1) {
        this.CombinationNumber_1 = CombinationNumber_1;
    }

    public int getCombinationNumber_1() {
        return CombinationNumber_1;
    }

    public void setCombinationNumber_2(int CombinationNumber_2) {
        this.CombinationNumber_2 = CombinationNumber_2;
    }

    public int getCombinationNumber_2() {
        return CombinationNumber_2;
    }

    public void setCombinationNumber_3(int CombinationNumber_3) {
        this.CombinationNumber_3 = CombinationNumber_3;
    }

    public int getCombinationNumber_3() {
        return CombinationNumber_3;
    }
    public void resetDial (){
        DialNumber = 0;
    }
    
    public void turnRight (int clicks){
        DialNumber = (DialNumber + clicks) % MAX;
    }
    
    public void turnLeft (int clicks){
        int moves = clicks % MAX;
        if (DialNumber >= moves)
            DialNumber = DialNumber - moves;
        else
            DialNumber = (DialNumber + MAX) - moves;
    }
    
    public boolean openLock (int CN1,int CN2, int CN3){
        return CombinationNumber_1 == CN1 && CombinationNumber_2 == CN2 && CombinationNumber_3 == CN3 ;
    }
    
    public String toString(){
        return "Combination Number:" + CombinationNumber_1 + CombinationNumber_2 + CombinationNumber_3;
    }
}
