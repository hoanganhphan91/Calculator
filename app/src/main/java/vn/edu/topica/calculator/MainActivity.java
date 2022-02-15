package vn.edu.topica.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import vn.edu.topica.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnCE, btnCong, btnTru, btnNhan, btnChia, btnCham, btnBang;
    private TextView mainScreen, secondSreen;
    private String calculation;
    private String operator;
    boolean checkDot = false, checkBang = false;
    double so1, so2, result;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toast.makeText(this, "Hello from Hoàng Anh.", Toast.LENGTH_SHORT).show();
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnC.setOnClickListener(v -> {
            secondSreen.setText("");
            mainScreen.setText("");
            calculation = "";
            operator = "";
            checkBang = false;
            checkDot = false;
        });
        btn0.setOnClickListener(v -> {
            if (!checkBang) {
                calculation = mainScreen.getText().toString();
                mainScreen.setText(calculation + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + "9");
                }
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainScreen.getText() == "") {
                    so1 = 0;
                    secondSreen.setText(("0+"));
                } else {
                    so1 = Double.parseDouble(mainScreen.getText().toString());
                    secondSreen.setText((so1) + "+ ");
                }
                mainScreen.setText("");
                calculation = "";
                operator = "+";
                checkDot = false;
                checkBang = false;
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainScreen.getText() == "") {
                    so1 = 0;
                    secondSreen.setText(("0-"));
                } else {
                    so1 = Float.parseFloat(mainScreen.getText().toString());
                    secondSreen.setText((so1) + " - ");
                }
                mainScreen.setText("");
                calculation = "";
                operator = "-";
                checkDot = false;
                checkBang = false;
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainScreen.getText() == "") {
                    so1 = 0;
                    secondSreen.setText(("0 x"));
                } else {
                    so1 = Double.parseDouble(mainScreen.getText().toString());
                    secondSreen.setText((so1) + " x ");
                }
                mainScreen.setText("");
                calculation = "";
                operator = "*";
                checkDot = false;
                checkBang = false;
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainScreen.getText() == "") {
                    so1 = 0;
                    secondSreen.setText(("0 /"));
                } else {
                    so1 = Double.parseDouble(mainScreen.getText().toString());
                    secondSreen.setText((so1) + " / ");
                }
                mainScreen.setText("");
                calculation = "";
                operator = "/";
                checkDot = false;
                checkBang = false;
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    checkDot = false;
                    calculation = mainScreen.getText().toString();
                    so2 = Double.parseDouble(mainScreen.getText() + "");
                    mainScreen.setText("");
                    if ((operator == "+"))
                        result = so1 + so2;
                    else if (operator == "-")
                        result = so1 - so2;
                    else if (operator == "*") {
                        result = so1 * so2;
                        operator = "x";
                    } else if (operator == "/")
                        result = so1 / so2;
                    checkBang = true;
                    mainScreen.setText(result + "");
                    secondSreen.setText(so1 + operator + so2);
                }
                operator = "";
            }
        });
        btnCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkDot) {
                    calculation = mainScreen.getText().toString();
                    mainScreen.setText(calculation + ".");

                } else {

                }
            }
        });
        btnCE.setOnClickListener(v -> {
            if (!checkBang) {
                String val = mainScreen.getText().toString();
                if (!val.isEmpty()) {
                    val = val.substring(0, val.length() - 1);
                    mainScreen.setText(val);
                }
            }
        });
    }

    private void addControl() {
        btn0 = binding.btnInclude.btn0;
        btn1 = binding.btnInclude.btn1;
        btn2 = binding.btnInclude.btn2;
        btn3 = binding.btnInclude.btn3;
        btn4 = binding.btnInclude.btn4;
        btn5 = binding.btnInclude.btn5;
        btn6 = binding.btnInclude.btn6;
        btn7 = binding.btnInclude.btn7;
        btn8 = binding.btnInclude.btn8;
        btn9 = binding.btnInclude.btn9;
        btnC = binding.btnInclude.btnC;
        btnCE = binding.btnInclude.btnCE;
        btnCong = binding.btnInclude.btnCong;
        btnTru = binding.btnInclude.btnTru;
        btnNhan = binding.btnInclude.btnNhan;
        btnChia = binding.btnInclude.btnChia;
        btnCham = binding.btnInclude.btnCham;
        mainScreen = binding.screenInclude.txtKetQua;
        secondSreen = binding.screenInclude.txtPhepTinh;
        btnBang = binding.btnInclude.BtnBang;

    }
}