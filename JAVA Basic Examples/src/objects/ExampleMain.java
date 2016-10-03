package objects;

public class ExampleMain {

	public static void main(String[] args) {
		// Make a few Person objects
		Person p1 = new Person(120154, "John", "Doe");
		Person p2 = new Person(148515, "Jim", "Deer");
		Person p3 = p1; // p3 points to p1
		
		// Print every person
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println();
		
		// Change name of p1
		p1.setFirstName("Kevin"); // Changes BOTH p1 and p3
		
		// Print every person
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println();
		
		// Do p1 and p3 have the same reference? They should, because p3 = p1 in line 8.
		System.out.println("Same reference? " + (p1 == p3));
		
		// Make a NEW Person object that is identical to p1!
		Person p4 = new Person(120154, "Kevin", "Doe");
		
		// Do p1 and p4 have the same reference? No, because p4 is a newly created object.
		System.out.println("Same reference? " + (p1 == p4));
		
		// Are p1 and p4 equal? Yes, because they have the same content!
		System.out.println("Equal? " + p1.equals(p4));
	}

}
