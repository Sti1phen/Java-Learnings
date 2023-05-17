package main.java.org.example.chapter5;

import java.util.Scanner;

/*
Multiple Choice Questions
1. What is the major claim of those in the mainstream of global warming idealist
a. Green-house gases is partly responsible for global warming
b. Human activities do not contribute to global warming
c. the earth did not warm even at the start of the industrial revolution
d. Global warming cannot be measured by natural forces

2. According to mainstream scientists "slightly less than hal of the global warming is caused by _____"
a. Carbon dioxide
b. Sulphur oxide
c. Ash
d. Chlorine

3. Global warming skeptics believes that except....
a. Natural forcings such as solar cycles impact negatively on the climate
b. Man-made activities such as industrial emissions of black soot contributes to Climate change
c. Land use change compound the effect of greenhouse gases on the global climate
d. Only greenhouses gases are responsible for global warming

4. Choose the most incorrect statement from the following:
a. Reducing the greenhouse emissions is the key to solving the global warming problems
b. Reducing greenhouse emissions would cost more trillions of dollars and inflict more harm to the environment
c. Collecting carbon tax from industries will fund alternative energy research
d. Both the mainstream and skeptics of global warming came to an agreement during last year's IPCC summit for a solution to global warming

5. Choose the most accurate statement from the following
a. Once an ocean ice retreats, it cannot come back again
b. Many glaciers are retreating
c. All glaciers are retreating
d. 15,000 Himalayan glaciers could melt by 2035

*********************
Initialize score = 0, number =1, answer;
Use for to prompt question 1 to 5
Use Switch to print question
 in each switch
    Print Question Number
    Print Question and option
    Prompt User Response
    Input user response
    Use switch to add 1 or zero to score
Repeat for all question
 */
public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        int score = 0, answer, question;
        Scanner input = new Scanner(System.in);
        System.out.println("\nGlobal Warming Facts Quiz\nPlease choose the correct option number 1 - 4\n");
        for (question =1; question <= 5; question++){
            switch (question){
                case 1:
                    System.out.print("Question 1\nWhat is the major claim of those in the mainstream of global warming idealist?\n" +
                            "1. Green-house gases is partly responsible for global warming\n" +
                            "2. Human activities do not contribute to global warming\n" +
                            "3. The earth did not warm even at the start of the industrial revolution\n" +
                            "4. Global warming cannot be measured by natural forces\nCorrect option: ");
                    answer = input.nextInt();
                    switch (answer){
                        case 1:
                            ++score;
                            break;
                        case 2: case 3: case 4:
                    }
                    break;
                case 2:
                    System.out.print("Question 2\nAccording to mainstream scientists 'slightly less than half of the global warming is caused by: '\n" +
                            "1. Carbon dioxide\n" +
                            "2. Sulphur oxide\n" +
                            "3. Ash\n" +
                            "4. Chlorine\nCorrect option: ");
                    answer = input.nextInt();
                    switch (answer){
                        case 1:
                            ++score;
                            break;
                        case 2: case 3: case 4:
                    }
                    break;
                case 3:
                    System.out.print("Question 3\nGlobal warming skeptics believes the following except:\n" +
                            "1. Natural forcings such as solar cycles impact negatively on the climate\n" +
                            "2. Man-made activities such as industrial emissions of black soot contributes to Climate change\n" +
                            "3. Land use change compound the effect of greenhouse gases on the global climate\n" +
                            "4. Only greenhouses gases are responsible for global warming\nCorrect option: ");
                    answer = input.nextInt();
                    switch (answer){
                        case 1: case 2: case 3:
                            break;
                        case 4:
                            ++score;
                    }
                    break;
                case 4:
                    System.out.print("Question 4\nChoose the most incorrect statement from the following:\n" +
                            "1. Reducing the greenhouse emissions is the key to solving the global warming problems\n" +
                            "2. Reducing greenhouse emissions would cost more trillions of dollars and inflict more harm to the environment\n" +
                            "3. Collecting carbon tax from industries will fund alternative energy research\n" +
                            "4. Both the mainstream and skeptics of global warming came to an agreement during last year's IPCC summit for a solution to global warming\n" +
                            "Correct option: ");
                    answer = input.nextInt();
                    switch (answer){
                        case 1: case 2: case 3:
                            break;
                        case 4:
                            ++score;
                    }
                    break;
                case 5:
                    System.out.print("Question 5\nChoose the most accurate statement from the following\n" +
                            "1. Once an ocean ice retreats, it cannot come back again\n" +
                            "2. Many glaciers are retreating\n" +
                            "3. All glaciers are retreating\n" +
                            "4. 15,000 Himalayan glaciers could melt by 2035\nCorrect Option: ");
                    answer = input.nextInt();
                    switch (answer){
                        case 1: case 3: case 4:
                            break;
                        case 2:
                            ++score;
                    }

            }
            System.out.println();
        }
        if (score == 5)
            System.out.print("Excellent\n");
        else if (score==4) {
            System.out.println("Very good\n");
        } else if (score <=3) {
            System.out.println("Time to brush up on your knowledge of global warning\nUse can visit " +
                    "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3002211/ and/or \nhttps://en.wikipedia.o" +
                    "rg/wiki/Climate_change_denial#:~:text=17%20Further%20reading-,Terminology,in%20whole%20or%20in%20part.\n");
        }
    }
}
