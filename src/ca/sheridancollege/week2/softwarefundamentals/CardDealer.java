/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Camilo Plaza, 2022
 * Student ID: 991641007
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");

        Card spade1 = new Spade("Spades",4);
        System.out.println(spade1.getValue());

        Card spade2 = new Spade("Spades",2);
        
        
        
        
    }
    
}
