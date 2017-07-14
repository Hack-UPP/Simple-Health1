package com.example.simplehealth;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by JoséEduardo on 13/7/2017.
 */

public class Insertar {

    private String apPaterno, apMaterno, nombre, numeroSS, contrasena;
    private String sexo, fechaNacimiento, curp;
    private String frecuenciaRes, temperatura, frecuenciaCar, talla, peso, imc;

    public Insertar(String pApPaterno, String pApMaterno, String pNombre, String pNumeroSS, String pContrasena, String pSexo, String pFechaNacimiento,String pCurp, String pFrecuenciaRes, String pTemperatura, String pFrecuenciaCar, String pTalla, String pPeso, String pImc) {
        this.apPaterno = pApPaterno;
        this.apMaterno = pApMaterno;
        this.nombre = pNombre;
        this.numeroSS = pNumeroSS;
        this.contrasena = pContrasena;
        this.sexo = pSexo;
        this.fechaNacimiento = pFechaNacimiento;
        this.curp = pCurp;
        this.frecuenciaRes = pFrecuenciaRes;
        this.temperatura = pTemperatura;
        this.frecuenciaCar = pFrecuenciaCar;
        this.talla = pTalla;
        this.peso = pPeso;
        this.imc = pImc;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getFrecuenciaRes() {
        return frecuenciaRes;
    }

    public void setFrecuenciaRes(String frecuenciaRes) {
        this.frecuenciaRes = frecuenciaRes;
    }
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    public String getFrecuenciaCar() {
        return frecuenciaCar;
    }

    public void setFrecuenciaCar(String frecuenciaCar) {
        this.frecuenciaCar = frecuenciaCar;
    }
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }




    public String toJSON(){

        JSONObject jsonObject= new JSONObject();
        try {
            jsonObject.put("apPaterno", getApPaterno());
            jsonObject.put("apMaterno", getApMaterno());
            jsonObject.put("nombre", getNombre());
            jsonObject.put("numeroSS", getNumeroSS());
            jsonObject.put("contrasena", getContrasena());
            jsonObject.put("sexo", getSexo());
            jsonObject.put("fechaNacimiento", getFechaNacimiento());
            jsonObject.put("curp", getCurp());
            jsonObject.put("frecuenciaRes", getFrecuenciaRes());
            jsonObject.put("temperatura", getTemperatura());
            jsonObject.put("frecuenciaCar", getFrecuenciaCar());
            jsonObject.put("talla", getTalla());
            jsonObject.put("peso", getPeso());
            jsonObject.put("imc", getImc());

            return jsonObject.toString();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
