package com.vti.entity.Inheritance;

public class KySu extends CanBo{
	String nganhDaoTao;

	public KySu(String hoTen, String tuoi, Gender gender, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gender, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Nganh daotao: " + nganhDaoTao;
	}

}
