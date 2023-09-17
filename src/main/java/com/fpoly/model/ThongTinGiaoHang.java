package com.fpoly.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "thong_tin_giao_hang")
public class ThongTinGiaoHang {
    @Id
    @Column(name = "id_giao_hang", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "ho_ten", length = 100)
    private String hoTen;

    @Size(max = 10)
    @Nationalized
    @Column(name = "so_dien_thoai", length = 10)
    private String soDienThoai;

    @Column(name = "id_tinh")
    private Integer idTinh;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_tinh", length = 50)
    private String tenTinh;

    @Column(name = "id_quan")
    private Integer idQuan;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_quan", length = 50)
    private String tenQuan;

    @Column(name = "id_phuong")
    private Integer idPhuong;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_phuong", length = 50)
    private String tenPhuong;

    @Size(max = 200)
    @Nationalized
    @Column(name = "dia_chi_chi_tiet", length = 200)
    private String diaChiChiTiet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Integer getIdTinh() {
        return idTinh;
    }

    public void setIdTinh(Integer idTinh) {
        this.idTinh = idTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    public Integer getIdQuan() {
        return idQuan;
    }

    public void setIdQuan(Integer idQuan) {
        this.idQuan = idQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public Integer getIdPhuong() {
        return idPhuong;
    }

    public void setIdPhuong(Integer idPhuong) {
        this.idPhuong = idPhuong;
    }

    public String getTenPhuong() {
        return tenPhuong;
    }

    public void setTenPhuong(String tenPhuong) {
        this.tenPhuong = tenPhuong;
    }

    public String getDiaChiChiTiet() {
        return diaChiChiTiet;
    }

    public void setDiaChiChiTiet(String diaChiChiTiet) {
        this.diaChiChiTiet = diaChiChiTiet;
    }

}