package com.example.dchle.myapplic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
//  Context : 설정값, 메모리 상에 있는 위치
//  ctx를 position(latitude, longitude)의 개념으로 이해

        final EditText num1 = findViewById(R.id.num);

        //       final EditText num2 = findViewById(R.id.num2);
        final TextView result = findViewById(R.id.result);

        //  inner class
    class Calc  {
        private int num, res;  // 인스턴스 변수
        String op;
        /*public void exe()  {
            switch (op)  {
                case "+":res = num1 + num2; break;
                case "-":res = num1 - num2; break;
                case "*":res = num1 * num2; break;
                case "/":res = num1 / num2; break;
            }
        }*/
        public void setNum1(int num1) {this.num=num;}
        public int getNum1() {return this.num;}

     //   public void setNum2(int num2) {this.num2=num2;}
     //   public int getNum2() {return this.num2;}

        public void setRes(int res) {this.res=res;}
        public int getRes() {return this.res;}

        public void setOp(String op) {this.op=op;}
        public String getOp() {return this.op;}

    }

    final Calc calc = new Calc();

//  2018.11.14. 20:10

//        final int c = 0;

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a = Integer.parseInt(num1.getText().toString());
                Log.d("입력값 1", a + "");
                calc.setNum1(a);
//                int b = Integer.parseInt(num2.getText().toString());
                //Log.d("입력값 2", b + "");
//                calc.setNum2(b);
                calc.setOp("+");
//                calc.exe();
                int c = calc.getRes();
                Log.d("결과", c + "");
                Toast.makeText(ctx, "덧셈 결과: " + c, Toast.LENGTH_SHORT).show();
            //  Toast.makeText(ctx, text; "덧셈 결과: "+c.Toast.LENGTH_LONG).show();
        }
        });

        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                Log.d("입력값 1",a+"");
                calc.setNum1(a);
 //               int b = Integer.parseInt(num2.getText().toString());
               // Log.d("입력값 2",b+"");
//                calc.setNum2(b);
                calc.setOp("-");
//                calc.exe();
                int c = calc.getRes();
                Log.d("결과",c+"");

                Toast.makeText(ctx, "뺄셈 결과: "+c, Toast.LENGTH_SHORT).show();
                //Toast.makeText(ctx,"뺄셈클릭",Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                Log.d("입력값 1",a+"");
                calc.setNum1(a);
   //             int b = Integer.parseInt(num2.getText().toString());
               // Log.d("입력값 2",b+"");
//                calc.setNum2(b);
                calc.setOp("*");
//                calc.exe();
                int c = calc.getRes();
                Log.d("결과",c+"");

                Toast.makeText(ctx, "곱셈 결과: "+c, Toast.LENGTH_SHORT).show();
                //Toast.makeText(ctx,"곱셈클릭",Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.divideBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                Log.d("입력값 1",a+"");
                calc.setNum1(a);
//                int b = Integer.parseInt(num2.getText().toString());
             //   Log.d("입력값 2",b+"");
//                calc.setNum2(b);
                calc.setOp("/");
//                calc.exe();
                int c = calc.getRes();
                Log.d("결과",c+"");
                Toast.makeText(ctx, "나눗셈 결과: "+c, Toast.LENGTH_SHORT).show();
                //Toast.makeText(ctx,"나눗셈클릭",Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.equalBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx,"결과클릭",Toast.LENGTH_LONG).show();

                result.setText("결과 : " + calc.getRes());
            }
        });

    }
}