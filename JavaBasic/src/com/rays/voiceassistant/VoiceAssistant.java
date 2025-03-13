package com.rays.voiceassistant;

	import java.util.Scanner;

	public class VoiceAssistant {
	    public static void main(String[] args) {
	        System.out.println("Welcome! I'm your AI Voice Assistant.");
	        System.out.println("How can I assist you today?");
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.print("You: ");
	            String userInput = scanner.nextLine().toLowerCase();
	            
	            if (userInput.equals("exit")) {
	                System.out.println("Goodbye!");
	                break;
	            }
	            
	            String response = getResponse(userInput);
	            System.out.println("Assistant: " + response);
	        }
	        
	        scanner.close();
	    }
	    
	    public static String getResponse(String userInput) {
	        // Basic example of response generation based on user input
	        if (userInput.contains("hello") || userInput.contains("hi")) {
	            return "Hello! How can I help you?";
	        } else if (userInput.contains("how are you")) {
	            return "I'm just a program, so I don't have feelings, but thank you for asking!";
	        } else if (userInput.contains("thank you")) {
	            return "You're welcome!";
	        } else {
	            return "I'm sorry, I didn't understand that.";
	        }
	    }
	}



