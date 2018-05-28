/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm2;

/**
 *
 * @author 
 */
public class Savings extends Account{

    public Savings(int bal, int num, String name, String PIN)
    {
        super(bal, num, name, PIN);
    }
    
    @Override
    protected void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .30/365;
        double ratetime = Math.pow(1+rate, datediff);
                     
        if(secondyear - firstyear > 0) //allows for different years to be input
        {
            int yeardiff = secondyear - firstyear;
            ratetime *= Math.pow(1.30, yeardiff);
        }
        balance *= ratetime;
        firstdate = seconddate;
        firstyear = secondyear;
    }
}