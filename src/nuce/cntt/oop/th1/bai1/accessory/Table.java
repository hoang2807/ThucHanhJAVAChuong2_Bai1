package nuce.cntt.oop.th1.bai1.accessory;

import java.util.ArrayList;

public class Table {
	private int chieudai;
	private int chieurong;
	private int chieucao;
	private String chatlieu;
	private ArrayList<Book> books;
	private Lamp lamp;

	public Table(int chieudai, int chieurong, int chieucao, String chatlieu) {
		this.chieudai = chieudai;
		this.chieurong = chieurong;
		this.chieucao = chieucao;
		this.chatlieu = chatlieu;
		this.books = new ArrayList<Book>();

	}

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int chieurong) {
		this.chieurong = chieurong;
	}

	public int getChieucao() {
		return chieucao;
	}

	public void setChieucao(int chieucao) {
		this.chieucao = chieucao;
	}

	public String getChatlieu() {
		return chatlieu;
	}

	public void setChatlieu(String chatlieu) {
		this.chatlieu = chatlieu;
	}

	public void add(Book b) {
		this.books.add(b);
	}

	public void display() {
		for (int i = 0; i < books.size(); ++i) {
			books.get(i).output();
		}
	}

	public void addLamp(Lamp lamp) {
		this.lamp = lamp;
	}

	public void battatden() {
		String tt = lamp.isTrangthai() ? "bat" : "tat";
		System.out.println("Trang thai den hien tai: " + tt);
		lamp.chuyentrangthai(lamp.isTrangthai());
		tt = lamp.isTrangthai() ? "bat" : "tat";
		System.out.println("Sau khi chuyen trang thai: " + tt);

	}

}
