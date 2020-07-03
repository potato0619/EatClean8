package com.example.eat_clean;

import java.io.Serializable;

public class thucdon implements Serializable {
    int idimgae;
    String tenthucdon;
    String motangan;
    String nguyenlieu;
    String cachnau;

    public thucdon(int idimgae, String tenthucdon, String motangan, String nguyenlieu, String cachnau) {
        this.idimgae = idimgae;
        this.tenthucdon = tenthucdon;
        this.motangan = motangan;
        this.nguyenlieu = nguyenlieu;
        this.cachnau = cachnau;
    }

    public int getIdimgae() {
        return idimgae;
    }

    public void setIdimgae(int idimgae) {
        this.idimgae = idimgae;
    }

    public String getTenthucdon() {
        return tenthucdon;
    }

    public void setTenthucdon(String tenthucdon) {
        this.tenthucdon = tenthucdon;
    }

    public String getMotangan() {
        return motangan;
    }

    public void setMotangan(String motangan) {
        this.motangan = motangan;
    }

    public String getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    public String getCachnau() {
        return cachnau;
    }

    public void setCachnau(String cachnau) {
        this.cachnau = cachnau;
    }
}
