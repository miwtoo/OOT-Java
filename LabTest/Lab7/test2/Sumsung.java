/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab7.test2;

/**
 *
 * @author All User
 */
public class Sumsung extends Mobile{
    private int simCount = 2;
    public Sumsung(String carrier){
        super(carrier);
    }
    public int getSimCount(){
        return simCount;
    }
}
