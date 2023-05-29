/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter card suit (0-3): ");
        int suit = scanner.nextInt();
            
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);
            
        boolean foundUserCard = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                foundUserCard = true;
                break;
            }
        }

        if (foundUserCard) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }

        
    }
}