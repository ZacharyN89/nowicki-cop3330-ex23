/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner cursor = new Scanner(System.in);


        System.out.print("Is the car silent when you turn the key? ");
        String answer = cursor.nextLine();
        if (answer.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            answer = cursor.nextLine();
            if (answer.equals("y")){
                System.out.print("Clean terminals and try starting again. ");
            }
            else{
                System.out.print("Replace cables and try again. ");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            answer = cursor.nextLine();
            if (answer.equals("y")){
                System.out.print("Replace the battery. ");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                answer = cursor.nextLine();
                if (answer.equals("y")){
                    System.out.print("Check spark plug connections. ");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    answer = cursor.nextLine();
                    if (answer.equals("y")){
                        System.out.print("Does you car have fuel injection? ");
                        answer = cursor.nextLine();
                        if (answer.equals("y")){
                            System.out.print("Get it in for service. ");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else{
                        System.out.print("This should not be possible. ");
                    }
                }
            }
        }
    }

}
