public class ZombiePlant {

    private int max_potency;
    private int numSuccess_needed;

    public ZombiePlant(int mp, int ns){
        max_potency = mp;
        numSuccess_needed = ns;
    }

    public int getPotency(){
        return max_potency;
    }

    public int treatmentsNeeded(){
        return numSuccess_needed;
    }

    public boolean isDangerous(){
        if (numSuccess_needed>0) return true;
        return false;
    }

    public void treat(int p){
        if (p<=max_potency && p>0 && numSuccess_needed!=0){
            numSuccess_needed--;
        }
        else if (numSuccess_needed==0){
            if (p>max_potency || p<=0) numSuccess_needed++;
        }
        else{
            if (p>max_potency) numSuccess_needed++;

        }
    }

}
