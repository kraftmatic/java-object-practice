package com.kraftmatic.objectPractice;

import com.kraftmatic.objectPractice.objects.Book;

public class ObjectPractice {

	public static void main(String args[]) {

		Book firstBook = new Book();
		
		// Create a default constructor in the Book object that sets the title of the book
		// to "Generic Book". Your title variable should be a private string with corresponding
		// getters and setters.
		
		System.out.println("The first book's title is" + firstBook.getTitle());
		
		// Use the title setter method to change the title to the title of your favorite book
		// and print the updated title.

		System.out.println("The first book's title is" + firstBook.getTitle());
		
		// Create a second book and use constructors to pre-populate a title field
		
		Book secondBook =
				
		// Now create an Author object with a first name, last name, and nationality.  You can
		// either use a constructor or individually populate fields.
				
		Author secondBookAuthor = 
				
		// Add the new Author object to the second book and then use the Author's getName method 
		// to print out their name
		
		System.out.println("The second book's author is " + secondBook.getAuthor().getName());
		
		// Finally make sure that trying to set a negative pagecount instead defaults it to 1 page
		secondBook.setPageCount(-123);
		System.out.println("The second book's page count is " + secondBook.getPageCount);
		
	}
}
