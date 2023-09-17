package com.fpoly.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "don_hang")
public class DonHang {
    @Id
    @Column(name = "id_don_hang", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_thong_tin_giao_hang")
    private ThongTinGiaoHang idThongTinGiaoHang;

    @Column(name = "ngay_dat")
    private Instant ngayDat;

    @Column(name = "ngay_thanh_toan")
    private Instant ngayThanhToan;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ThongTinGiaoHang getIdThongTinGiaoHang() {
        return idThongTinGiaoHang;
    }

    public void setIdThongTinGiaoHang(ThongTinGiaoHang idThongTinGiaoHang) {
        this.idThongTinGiaoHang = idThongTinGiaoHang;
    }

    public Instant getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Instant ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Instant getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Instant ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

}