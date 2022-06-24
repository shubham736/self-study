package com.big.oh;

public class PM  extends  Ministers{

    public String getAircraft(){
        return "Aircraft Name";
    }

    public boolean exceedsSpendingLimit(Double amount){
        if(amount > 10000000)
            return true;
        return false;
    }

    public boolean permissionToArrest(String reason){
        if(reason.equals("valid"))
            return true;
        return false;
    }
}
