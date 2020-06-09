package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


import model.Prosent;

public class Controller {
    public Button bol_ch;
    public Button sred_ch;
    public Button mal_pol;
    public TextField obichn;
    public TextField big;
    public TextField symma;
    public TextField mal;
Prosent prosent=new Prosent();

    public void bol_15(MouseEvent mouseEvent) {//большие чаевые
        int res=Integer.parseInt((symma.getText()));
        int pr1=15;
//prosent.countPr(res,pr1);
       // big.setText("СУММА"+prosent.getcountPr());
    }

    public void sred_10(MouseEvent mouseEvent) {//средние чаевые
        int res=Integer.parseInt((symma.getText()));
        int pr2=3;
      //  prosent.countPr(res,pr2);
       // obichn.setText("СУММА"+prosent.countSumTrunc(res,pr2));
    }

    public void mal_3(MouseEvent mouseEvent) {//малые чаевые
        int res=Integer.parseInt((symma.getText()));
        int pr3=3;
      //  prosent.countPr(res,pr3);
        //mal.setText("СУММА"+prosent.countSumTrunc(res,pr3));
    }
}
