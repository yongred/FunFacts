package com.yongding.funfacts;

import java.util.Random;

/**
 * Created by YongLiu on 6/25/2015.
 */
public class FactsStorage {
    private String [] facts;
    public FactsStorage(){
        facts = new String[11];
        factsSet();
    }

    private void factsSet(){
        facts[0] = "If you have 3 quarters, 4 dimes, and 4 pennies, you have $1.19. You also have the largest amount of money in coins without being able to make change for a dollar.";
        facts[1] = "The numbers '172' can be found on the back of the U.S. $5 dollar bill in the bushes at the base of the Lincoln Memorial.";
        facts[2] = "President Kennedy was the fastest random speaker in the world with upwards of 350 words per minute.";
        facts[3] = "In the average lifetime, a person will walk the equivalent of 5 times around the equator.";
        facts[4] = "Odontophobia is the fear of teeth.";
        facts[5] ="The 57 on Heinz ketchup bottles represents the number of varieties of pickles the company once had.";

        facts[6] =    " In the early days of the telephone, operators would pick up a call and use the phrase, 'Well, are you there?'. It wasn't until 1895 that someone suggested answering the phone with the phrase 'number please?' ";

        facts[7] ="The surface area of an average-sized brick is 79 cm squared.";

        facts[8] ="According to suicide statistics, Monday is the favored day for self-destruction.";

        facts[9] =    "Cats sleep 16 to 18 hours per day.";

        facts[10] =   "The most common name in the world is Mohammed.";
    }
    public String[] getFacts() {
        return facts;
    }

    public String getRandomFacts(){
        Random rand = new Random();
        int index = rand.nextInt(facts.length);
        return new String(facts[index]);
    }
}
