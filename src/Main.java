
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Main {

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox2;

    @FXML
    private CheckBox CheckBox3;

    @FXML
    private CheckBox CheckBox4;

    @FXML
    private CheckBox CheckBox5;

    @FXML
    private CheckBox CheckBox6;

    @FXML
    private Label Label1;
    
    public void change(ActionEvent event) {

        //DAFTAR HARGA SATUAN
        if(CheckBox1.isSelected()) {
            Label1.setText("Rp15.000");
        } else if(CheckBox2.isSelected()) {
            Label1.setText("Rp17.000");
        } else if(CheckBox3.isSelected()) {
            Label1.setText("Rp18.000");
        } else if(CheckBox4.isSelected()) {
            Label1.setText("Rp20.000");
        } else if(CheckBox5.isSelected()) {
            Label1.setText("Rp22.000");
        } else if(CheckBox6.isSelected()) {
            Label1.setText("Rp25.000");

        } else {
            Label1.setText("TOTAL HARGA");
        }

        //Daftar Harga Paket Hemat
        if(CheckBox1.isSelected() && CheckBox5.isSelected()) {
            Label1.setText("Rp32.000 (Hemat Rp5.000)");
        } else if(CheckBox3.isSelected() && CheckBox2.isSelected()) {
            Label1.setText("Rp30.000 (Hemat Rp5.000)");
        } else if(CheckBox4.isSelected() && CheckBox6.isSelected()) {
            Label1.setText("Rp45.000 (Hemat Rp10.000)");
        }

    }

} 