package nuce.cntt.oop.th1.bai1.accessory;

public class Book {
	private String tensach;
	private String tentacgia;
	private int sotrang;
	private String kichthuoc;

	public Book() {
		this.tensach = "Unknown";
		this.tentacgia = "Unknown";
		this.sotrang = 0;
		this.kichthuoc = "Unknown";
	}

	public Book(String tensach, String tentacgia, int sotrang, String kichthuoc) {
		this.tensach = tensach;
		this.tentacgia = tentacgia;
		this.sotrang = sotrang;
		this.kichthuoc = kichthuoc;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	public String getKichthuoc() {
		return kichthuoc;
	}

	public void setKichthuoc(String kichthuoc) {
		this.kichthuoc = kichthuoc;
	}

	public void output() {
		System.out.println("Ten sach:" + tensach);
		System.out.println("Ten tac gia: " + tentacgia);
		System.out.println("So trang: " + sotrang);
		System.out.println("Kich thuoc: " + kichthuoc);
	}

}
