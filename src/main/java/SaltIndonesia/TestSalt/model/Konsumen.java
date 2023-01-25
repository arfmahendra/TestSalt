package SaltIndonesia.TestSalt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Konsumen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer id;
	@Column
	private String nama;
	@Column
	private String alamat;
	@Column
	private String kota;
	@Column
	private String provinsi;
	@Column
	private Date tgl_registrasi;
	@Column
	private String	status;
	
	public Konsumen() {
		super();
	}
	
	public Konsumen(Integer id, String nama, String alamat, String kota, String provinsi, Date tgl_registrasi, String status) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.kota = kota;
		this.provinsi = provinsi;
		this.tgl_registrasi = tgl_registrasi;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public Date getTgl_registrasi() {
		return tgl_registrasi;
	}
	public void setTgl_registrasi(Date tgl_registrasi) {
		this.tgl_registrasi = tgl_registrasi;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//@Override
	//public String toString() {
	//	return "Konsumen [id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", kota=" + kota + ", provinsi="
	//			+ provinsi + ", tgl_registrasi=" + tgl_registrasi + ", status=" + status + "]";
	//}
	
}
