  
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
	 * ZooMAIN asks the user to input one of the listed animals gathering enclosure exhibit foodtype number of animals and food
	 * creating an object from StockRoom based off the user input
	 * the user is then asked to input whether they want to see related animals animals are related by enclosure
	 * program repeats 5 times or until an incorrect animal is input
	 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure TonyFarelli
	 *
	 */
	
	public class ZooMAIN {
		  
		public static void main(String [] args) {
			
			//local variables
			Scanner keyboard = new Scanner (System.in);
			String searchedanimal;
			String exhibit = null;
			String foodtype = null;
			char answer;
			int foodnumber=0;
			int numberofanimals = 0;
			boolean yn = false;
			String[] listofanimals = {"Cheetah","Lion","Black Bear","Polar Bear", "Brown Bear", "Flamingo", "Parrot",
					"Puffin", "Gorilla", "Chimpanzee", "Gorilla", "Baboon", "Whale", "Dolphin", "Penguin",
					"Snake", "Turtle", "Alligator", "Crocodile", "Jackal", "Hyena", "Rhino", "Hippo", "Tiger"};
			String[] bigCats = {"Cheetah","Lion","Tiger"};
			String[] africanBeasts = {"Hyena","Jackal","Hippo","Rhino"};
			String[] reptiles = {"Snake","Turtle","Crocodile","Alligator"};
			String[] monkeys = {"Baboon","Gorilla","Chimpanzee"};
			String[] fish = {"Dolphin","Whale","Penguin"};
			String[] bear = {"Black Bear","Polar Bear","Brown Bear"};
			String[] birds = {"Puffin","Parrot","Flamingo"};
			//start of the interface
			System.out.println("Welcome to Carbondale's Zoo.");
			System.out.println("Please enter an animal in the singualar form, capitalized.");
			System.out.println("If nothing pops up, we may have the animal under a slightly more specific or general name, or we don't have that animal.");
			System.out.println("You can search up to five animals before the program ends.");
			//takes input from user
			searchedanimal = keyboard.nextLine();
			int forswitch = 0 ;
			//checks to see if input is in available animals
			for (int count = 0; count < listofanimals.length; count++)
			{
			    if (searchedanimal.equals(listofanimals[count]))
			    {
			       
			        forswitch = 1;
			    	 
			    
			        }
			}
			// switch for comparing animals by enclosure and food type
			 switch (forswitch) {
			 case 0:
				 System.out.println("There is no such animal in the zoo. Restart the program.");
				 break;
			 
			 case 1:
				 // sets exhibit based on searched animal
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
	        		{
	        		exhibit = "Big Cats Enviornment";
	        		}
	        
				 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
 				{
	        		exhibit = "African Beasts Experience";
	        	
 				}
	        
				 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
					{
	        		exhibit = "Reptile House";
	        		
					}
				 
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
					{
	        		exhibit = "Monkey Place";
	        	
					}
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
					{
	        		exhibit = "Under the Sea";
	        	
					}
				 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
					{
	        		exhibit = "Bear Territory";
	   
					}
				 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
					{
	        		exhibit = "Birds of Paradise";
	        		
					}
				 //sets food type amount and number of animals by searched animal
	        
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
	        		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
	        		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
	        		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
	        		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
	        		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
	        	
	        	{foodtype = "meat";
	        	foodnumber = 106;
	        	numberofanimals = 3;
	        	}
				 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
	        	
	        	{foodtype = "grasses and fruit";
	        	foodnumber = 78;
	        	numberofanimals = 3;}
	        
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
	        	
     			{foodtype = "fish";
     			foodnumber = 95;
	        	numberofanimals = 5;}
	        
	        
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	        	
				 {foodtype = "insects, grasses and fruits";
				 foodnumber = 50;
		        	numberofanimals = 10;}
	        
				 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
	        	
				 {foodtype = "insects, nuts and seeds";
				 foodnumber = 30;
		        	numberofanimals = 15;}	
				 
				 //creates animal object based on input from user
				 StockRoom FirstAnimal =
						 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);

				 //output to the user
				 System.out.println("The animal you searched for is a " + FirstAnimal.getAnimal() + ". It can be found in the "
				 					+ FirstAnimal.getEnclosure() + " enclosure. There are currently " + FirstAnimal.getAnimalCount() +
				 					" animals. We feed " + FirstAnimal.getAnimal() + "s " + FirstAnimal.getFoodType() + ", with the amount of "
				 							+ FirstAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
			        System.out.println("Would you like to view related animals? (y/n)");
			        //displays related animals dependent on user input
			            answer = keyboard.next().charAt(0);
			            if(answer == 'y'||answer =='Y') {
			                yn = true;
			            }
			            else if (answer == 'n'|| answer =='N') {
			                yn = false;
			               
			            }
			            if(yn) {
			            	//sorts by enclosure to show related animals using their array
			            	if((searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))){
				                System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bigCats));}
			            	else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(africanBeasts));}
			            	
			            	else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(reptiles));}
			            	else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(monkeys));}
			            	else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(fish));}
			            	else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bear));}
			            	if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FirstAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(birds));}
			            	
			            }
		// catches spare input
		keyboard.nextLine();
	    System.out.println("Please search another animal.");
	    
	    searchedanimal = keyboard.nextLine();
	    forswitch = 0;
	  //checks to see if input is in available animals
	    for (int count = 0; count < listofanimals.length; count++)
		{
		    if (searchedanimal.equals(listofanimals[count]))
		    {
		        forswitch = 1;
		        }
		}
	 // sets exhibit based on searched animal
	    switch (forswitch) {
		 case 0:
			 System.out.println("There is no such animal in the zoo. Restart the program.");
			 break;
		 
		 case 1:
			 
			 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
       		{
       		exhibit = "Big Cats Enviornment";
       		}
       
			 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
			{
       		exhibit = "African Beasts Experience";
       	
			}
       
			 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
				{
       		exhibit = "Reptile House";
       		
				}
			 
			 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
				{
       		exhibit = "Monkey Place";
       	
				}
			 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
				{
       		exhibit = "Under the Sea";
       	
				}
			 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
				{
       		exhibit = "Bear Territory";
  
				}
			 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
				{
       		exhibit = "Birds of Paradise";
       		
				}
			//sets food type amount and number of animals by searched animal
			 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
       		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
       		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
       		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
       		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
       		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
       	
       	{foodtype = "meat";
       	foodnumber = 106;
       	numberofanimals = 3;
       	}
		
       
       
			 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
       	
       	{foodtype = "grasses and fruit";
       	foodnumber = 78;
       	numberofanimals = 3;}
       
			 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
       	
			{foodtype = "fish";
			foodnumber = 95;
       	numberofanimals = 5;}
       
       
			 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
       	
			 {foodtype = "insects, grasses and fruits";
			 foodnumber = 50;
	        	numberofanimals = 10;}
       
			 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
       	
			 {foodtype = "insects, nuts and seeds";
			 foodnumber = 30;
	        	numberofanimals = 15;}	
			 
			 //Creates object sorted from searched animal
			 StockRoom SecondAnimal =
					 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
			 //displays object to user
			 System.out.println("The animal you searched for is a " + SecondAnimal.getAnimal() + ". It can be found in the "
			 					+ SecondAnimal.getEnclosure() + " enclosure. There are currently " + SecondAnimal.getAnimalCount() +
			 					" animals. We feed " + SecondAnimal.getAnimal() + "s " + SecondAnimal.getFoodType() + ", with the amount of "
			 							+ SecondAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
			 //displays related animals based on user input
			 System.out.println("Would you like to view related animals? (y/n)");
		        answer = keyboard.next().charAt(0);
		        if(answer == 'y'||answer =='Y') {
		            yn = true;
		        }
		        else if(answer =='n'||answer=='N'){
		        	yn = false;
		        }
		        if(yn) {
		        	//sorts and displays related animals based on enclosure
		        	if((searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))){
		                System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bigCats));}
		        	else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(africanBeasts));}
		        	
		        	else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(reptiles));}
		        	else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(monkeys));}
		        	else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(fish));}
		        	else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bear));}
		        	else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo")){
		        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
		                        + SecondAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(birds));}
		        }
	    }
        keyboard.nextLine();
		  System.out.println("Please search another animal.");
		    
		    searchedanimal = keyboard.nextLine();
		    forswitch = 0;
		    // checks to see if input matches available animals
		    for (int count = 0; count < listofanimals.length; count++)
			{
			    if (searchedanimal.equals(listofanimals[count]))
			    {
			        forswitch = 1;
			        }
			}
		    
		    switch (forswitch) {
			 case 0:
				 System.out.println("There is no such animal in the zoo. Restart the program.");
				 break;
			 
			 case 1:
				 // gets exhibit based on animal choice
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
	       		{
	       		exhibit = "Big Cats Enviornment";
	       		}
	       
				 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
				{
	       		exhibit = "African Beasts Experience";
	       	
				}
	       
				 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
					{
	       		exhibit = "Reptile House";
	       		
					}
				 
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
					{
	       		exhibit = "Monkey Place";
	       	
					}
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
					{
	       		exhibit = "Under the Sea";
	       	
					}
				 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
					{
	       		exhibit = "Bear Territory";
	  
					}
				 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
					{
	       		exhibit = "Birds of Paradise";
	       		
					}
				 //gets food type animal amount based on animal choice
	       
				 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
	       		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
	       		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
	       		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
	       		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
	       		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
	       	
	       	{foodtype = "meat";
	       	foodnumber = 106;
	       	numberofanimals = 3;
	       	}
			
	       
	       
				 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
	       	
	       	{foodtype = "grasses and fruit";
	       	foodnumber = 78;
	       	numberofanimals = 3;}
	       
				 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
	       	
				{foodtype = "fish";
				foodnumber = 95;
	       	numberofanimals = 5;}
	       
	       
				 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
	       	
				 {foodtype = "insects, grasses and fruits";
				 foodnumber = 50;
		        	numberofanimals = 10;}
	       
				 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
	       	
				 {foodtype = "insects, nuts and seeds";
				 foodnumber = 30;
		        	numberofanimals = 15;}	
				 
				 // creates object based on animal
				 StockRoom ThirdAnimal =
						 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
				 System.out.println("The animal you searched for is a " + ThirdAnimal.getAnimal() + ". It can be found in the "
				 					+ ThirdAnimal.getEnclosure() + " enclosure. There are currently " + ThirdAnimal.getAnimalCount() +
				 					" animals. We feed " + ThirdAnimal.getAnimal() + "s " + ThirdAnimal.getFoodType() + ", with the amount of "
				 							+ ThirdAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
				 // displays related animals dependent on user input
				 System.out.println("Would you like to view related animals? (y/n)");
			        answer = keyboard.next().charAt(0);
			        if(answer == 'y'||answer =='Y') {
			            yn = true;
			        }
			        else if (answer == 'n'|| answer =='N') {
			            yn = false;
			           
			        }
			        if(yn) {// displays related animals sorted by enclosure
			        	if((searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))){
			                System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bigCats));}
			        	else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(africanBeasts));}
			        	
			        	else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(reptiles));}
			        	else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(monkeys));}
			        	else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(fish));}
			        	else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bear));}
			        	else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo")){
			        		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
			                        + ThirdAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(birds));}
			        	
			        } 
		    

		    
		    }
			keyboard.nextLine();
            System.out.println("Please search another animal.");
			    
			    searchedanimal = keyboard.nextLine();
			    forswitch = 0;
			    //checks if input matches available animal
			    for (int count = 0; count < listofanimals.length; count++)
				{
				    if (searchedanimal.equals(listofanimals[count]))
				    {
				        forswitch = 1;
				        }
				}
			    
			    switch (forswitch) {
				 case 0:
					 System.out.println("There is no such animal in the zoo. Restart the program.");
					 break;
				 
				 case 1:
					 //gets enclosure based on animal choice
					 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
		       		{
		       		exhibit = "Big Cats Enviornment";
		       		}
		       
					 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
					{
		       		exhibit = "African Beasts Experience";
		       	
					}
		       
					 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
						{
		       		exhibit = "Reptile House";
		       		
						}
					 
					 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
						{
		       		exhibit = "Monkey Place";
		       	
						}
					 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
						{
		       		exhibit = "Under the Sea";
		       	
						}
					 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
						{
		       		exhibit = "Bear Territory";
		  
						}
					 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
						{
		       		exhibit = "Birds of Paradise";
		       		
						}
					 // gets food type amount animal amount 
					 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
		       		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
		       		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
		       		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
		       		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
		       		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
		       	
		       	{foodtype = "meat";
		       	foodnumber = 106;
		       	numberofanimals = 3;
		       	}
				
		       
		       
					 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
		       	
		       	{foodtype = "grasses and fruit";
		       	foodnumber = 78;
		       	numberofanimals = 3;}
		       
					 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
		       	
					{foodtype = "fish";
					foodnumber = 95;
		       	numberofanimals = 5;}
		       
		       
					 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
		       	
					 {foodtype = "insects, grasses and fruits";
					 foodnumber = 50;
			        	numberofanimals = 10;}
		       
					 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
		       	
					 {foodtype = "insects, nuts and seeds";
					 foodnumber = 30;
			        	numberofanimals = 15;}	
					 
					 //create object based on user input
					 StockRoom FourthAnimal =
							 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
					 //displays object 
					 System.out.println("The animal you searched for is a " + FourthAnimal.getAnimal() + ". It can be found in the "
					 					+ FourthAnimal.getEnclosure() + " enclosure. There are currently " + FourthAnimal.getAnimalCount() +
					 					" animals. We feed " + FourthAnimal.getAnimal() + "s " + FourthAnimal.getFoodType() + ", with the amount of "
					 							+ FourthAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
					 	//display related animals dependent on user input
					    System.out.println("Would you like to view related animals? (y/n)");
			            answer = keyboard.next().charAt(0);
			            if(answer == 'y'||answer =='Y') {
			                yn = true;
			            }
			            else if (answer == 'n'|| answer =='N') {
			                yn = false;
			               
			            }
			            if(yn) { // displays related animals sorted by enclosure
			            	if((searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))){
				                System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bigCats));}
			            	else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(africanBeasts));}
			            	
			            	else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(reptiles));}
			            	else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(monkeys));}
			            	else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(fish));}
			            	else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bear));}
			            	else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo")){
			            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
				                        + FourthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(birds));}
			            	
			            }
			    
			    
			    }
			    //consumes empty input
	            keyboard.nextLine();
				  System.out.println("Please search another animal.");
				    
				    searchedanimal = keyboard.nextLine();
				    forswitch = 0;
				    // checks if input matches available animals
				    for (int count = 0; count < listofanimals.length; count++)
					{
					    if (searchedanimal.equals(listofanimals[count]))
					    {
					        forswitch = 1;
					        }
					}
				    
				    switch (forswitch) {
					 case 0:
						 System.out.println("There is no such animal in the zoo. Restart the program.");
						 break;
					 
					 case 1:
						 // gets exhibit based on animal input
						 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))
			       		{
			       		exhibit = "Big Cats Enviornment";
			       		}
			       
						 else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino"))
						{
			       		exhibit = "African Beasts Experience";
			       	
						}
			       
						 else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator"))
							{
			       		exhibit = "Reptile House";
			       		
							}
						 
						 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee"))
							{
			       		exhibit = "Monkey Place";
			       	
							}
						 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin"))
							{
			       		exhibit = "Under the Sea";
			       	
							}
						 else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear"))
							{
			       		exhibit = "Bear Territory";
			  
							}
						 else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo"))
							{
			       		exhibit = "Birds of Paradise";
			       		
							}
						 // gets food type amount and number of animals based on input
			       
						 if (searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") 
			       		|| searchedanimal.equals("Tiger") || searchedanimal.equals("Hyena") 
			       		|| searchedanimal.equals("Jackal") || searchedanimal.equals("Crocodile")
			       		|| searchedanimal.equals("Brown Bear") || searchedanimal.equals("Black Bear")
			       		|| searchedanimal.equals("Polar Bear") || searchedanimal.equals("Snake")
			       		|| searchedanimal.equals("Alligator") || searchedanimal.equals("Tiger"))
			       	
			       	{foodtype = "meat";
			       	foodnumber = 106;
			       	numberofanimals = 3;
			       	}
					
			       
			       
						 else if (searchedanimal.equals("Hippo") || searchedanimal.equals("Rhino"))
			       	
			       	{foodtype = "grasses and fruit";
			       	foodnumber = 78;
			       	numberofanimals = 3;}
			       
						 else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Penguin")|| searchedanimal.equals("Whale")|| searchedanimal.equals("Flamingo") || searchedanimal.equals("Puffin"))
			       	
						{foodtype = "fish";
						foodnumber = 95;
			       	numberofanimals = 5;}
			       
			       
						 else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Chimpanzee")|| searchedanimal.equals("Gorilla"))
			       	
						 {foodtype = "insects, grasses and fruits";
						 foodnumber = 50;
				        	numberofanimals = 10;}
			       
						 else if (searchedanimal.equals("Flamingo") || searchedanimal.equals("Parrot")|| searchedanimal.equals("Puffin"))
			       	
						 {foodtype = "insects, nuts and seeds";
						 foodnumber = 30;
				        	numberofanimals = 15;}	
						 
						 //creates object based on input
						 StockRoom FifthAnimal =
								 new StockRoom(searchedanimal, exhibit, numberofanimals, foodnumber, foodtype);
						 System.out.println("The animal you searched for is a " + FifthAnimal.getAnimal() + ". It can be found in the "
						 					+ FifthAnimal.getEnclosure() + " enclosure. There are currently " + FifthAnimal.getAnimalCount() +
						 					" animals. We feed " + FifthAnimal.getAnimal() + "s " + FifthAnimal.getFoodType() + ", with the amount of "
						 							+ FifthAnimal.getFoodCount() + " pounds to keep them happy and healthy." );
						 // displays related animals dependent on user input
						    System.out.println("Would you like to view related animals? (y/n)");
				            answer = keyboard.next().charAt(0);
				            if(answer == 'y'||answer =='Y') {
				                yn = true;
				            }
				            else if (answer == 'n'|| answer =='N') {
				                yn = false;
				               
				            }
				            if(yn) {// sorts animals based on enclosure
				            	if((searchedanimal.equals("Cheetah") || searchedanimal.equals("Lion") || searchedanimal.equals("Tiger"))){
					                System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bigCats));}
				            	else if (searchedanimal.equals("Hyena") || searchedanimal.equals("Jackal") || searchedanimal.equals("Hippo")|| searchedanimal.equals("Rhino")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(africanBeasts));}
				            	
				            	else if (searchedanimal.equals("Snake") || searchedanimal.equals("Turtle") || searchedanimal.equals("Crocodile")|| searchedanimal.equals("Alligator")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(reptiles));}
				            	else if (searchedanimal.equals("Baboon") || searchedanimal.equals("Gorilla") || searchedanimal.equals("Chimpanzee")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(monkeys));}
				            	else if (searchedanimal.equals("Dolphin") || searchedanimal.equals("Whale") || searchedanimal.equals("Penguin")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(fish));}
				            	else if (searchedanimal.equals("Black Bear") || searchedanimal.equals("Polar Bear") || searchedanimal.equals("Brown Bear")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(bear));}
				            	else if (searchedanimal.equals("Puffin") || searchedanimal.equals("Parrot") || searchedanimal.equals("Flamingo")){
				            		System.out.println("Based on the animal: " + searchedanimal + " That animal is part of the: "
					                        + FifthAnimal.getEnclosure() + "\nSimilar animals are: "+ Arrays.toString(birds));}
				            	
				            } 
				    
				    }

				 System.out.println("Thank you for running our zoo search program. Please begin again if you wish to search more animals. Have a nice day.");
				 
				 }
			
			}
	}

	
