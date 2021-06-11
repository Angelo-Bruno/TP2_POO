package app;

import java.time.LocalDate;

public class EpassFestival extends PassSazonal implements CartaoPagamento, TituloTransporte{
    private double saldoCartaoPgmt;
    private String nomeEvento;
    
    public EpassFestival(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            double saldoCartaoPgmt, String nomeEvento) {
        super(saldo, dataCarrega);
        this.saldoCartaoPgmt = saldoCartaoPgmt;
        this.nomeEvento = nomeEvento;
    }
    public EpassFestival(double saldo, LocalDate dataCarrega,
            String nomeEvento) {
        super(saldo, dataCarrega);
        this.nomeEvento = nomeEvento;
    }
    public EpassFestival(double saldo, LocalDate dataCarrega, EpassFestival outro) {
        super(saldo, dataCarrega);
    }

    
    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }
    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    @Override
    public boolean pagar(double valor) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void creditar(double valor) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void carregar(double epass) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void pagarViagem() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean checkValidade() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public  boolean passarSaldo(PassStandard epass, double saldo) {
        // TODO Auto-generated method stub
        return false;
    }
}
