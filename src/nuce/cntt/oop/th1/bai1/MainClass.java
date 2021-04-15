package nuce.cntt.oop.th1.bai1;

import nuce.cntt.oop.th1.bai1.accessory.*;

public class MainClass {

	public static void main(String[] args) {
		Book book1 = new Book("cau long", "vinh", 50, "100x100");
		Book book2 = new Book("giai tich", "hoang anh", 100, "200x200");
		Lamp lamp = new Lamp(100, "de ban", false);
		Table table = new Table(100, 150, 200, "go");
		table.add(book1);
		table.add(book2);
		table.display();
		table.addLamp(lamp);
		table.battatden();
	}

}
