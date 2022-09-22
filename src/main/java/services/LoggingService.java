package services;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LoggingService {
    public void printMessage(String message){
        System.out.println(message);
    }

    public int scanForAge(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        return age;
    }
}
