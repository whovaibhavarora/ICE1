/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @ModifiedBy vaibhava
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1);

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and suit: ");
        int input = in.nextInt();
        String suit;
        suit = in.next();
        Card userInput = new Card();
        userInput.setValue(input);
        userInput.setSuit(suit);
        // and search magicHand here
        boolean found = false;
        for (Card n : magicHand) {
            if (n.getSuit().equals(userInput.getSuit()) && n.getValue() == userInput.getValue()) {
                found = true;
            }
        }

        //Then report the result here
        if (found) {
            System.out.println("Your card was found");
        } else {
            System.out.println("Your card was not found");
        }
        // add one luckcard hard code 2,clubs

        Card luckyCard = new Card();

        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
        boolean luckyCardFound = false;
        for (Card e : magicHand) {
            if (e.getSuit().equals(luckyCard.getSuit()) && e.getValue() == luckyCard.getValue()) {
                luckyCardFound = true;
            }

        }

        if (luckyCardFound) {
            System.out.println("Yayyy!! Your lucky card was found");
        } else {
            System.out.println("Oops! Your lucky card was not found");
        }
    }

}
