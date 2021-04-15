package nuce.cntt.oop.th1.bai1.accessory;

public class Lamp {
	private int chieucao;
	private String loai;
	private boolean trangthai;

	public Lamp() {
		this.chieucao = 0;
		this.loai = "Unknown";
		this.trangthai = false;
	}

	public Lamp(int chieucao, String loai, boolean trangthai) {
		this.chieucao = chieucao;
		this.loai = loai;
		this.trangthai = trangthai;
	}

	public int getChieucao() {
		return chieucao;
	}

	public void setChieucao(int chieucao) {
		this.chieucao = chieucao;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public void chuyentrangthai(boolean trangthai) {
		this.trangthai=!trangthai;
	}

}
