package CasioController;

import CasioView.CasioView;
import model.SimpleCasio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasioController implements ActionListener {
    private CasioView giaodienCasio;

    public CasioController(CasioView ct) {
        giaodienCasio = ct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nutnhan = e.getActionCommand();
        SimpleCasio d = giaodienCasio.getSimpleCasio();

        switch (nutnhan) {
            case "=":
                d.setPheptoancantinh(this.giaodienCasio.getNhapvao());
                giaodienCasio.inketqua();
                break;
            case "0":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "1":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "2":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "3":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "4":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "5":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "6":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "7":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "8":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "9":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "+":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "-":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "*":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "/":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "sin":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "cos":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "tan":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case ".":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "^":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "(":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case ")":
                d.them(nutnhan);
                giaodienCasio.setSimpleCasio(d.getPheptoancantinh());
                giaodienCasio.capNhatNhapVao();
                break;
            case "DEL":
                giaodienCasio.xoaKyTuCuoi();
                break;
            case "AC":
                giaodienCasio.xoaTatCa();
                break;
            case "Ans":
//                giaodienCasio.nhapKetQuaCu();
                break;

            default:
                System.out.println("Unknown button pressed");
                break;
        }
    }
}
