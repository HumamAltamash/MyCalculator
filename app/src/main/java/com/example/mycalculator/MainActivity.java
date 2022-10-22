package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bs,bm,bd,beq,b_,bx,bc;
    TextView txt;
    double num=0;
    int dec=0,op=0,ind=0;
    boolean equalPressed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"1");
            }
        });


        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"2");
            }
        });


        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"3");
            }
        });


        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"4");
            }
        });


        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"5");
            }
        });


        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"6");
            }
        });


        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"7");
            }
        });


        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"8");
            }
        });


        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"9");
            }
        });


        b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                txt.setText(txt.getText()+"0");
            }
        });


        bx=(Button)findViewById(R.id.bx);
        bx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                String x=(String)txt.getText();
                int l=x.length();
                if(l==0) {
                }
                else
                    txt.setText(x.substring(0,l-1));
            }
        });

        bc=(Button)findViewById(R.id.bc);
        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txt.setText("");
                num=0;
                dec=0;op=0;
            }
        });


        bp=(Button)findViewById(R.id.bp);
        bp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if("".equals(txt.getText()+"")||"-".equals(txt.getText()+""))
                {}
                else {
                    double x = Double.parseDouble(txt.getText() + "");
                    num = num + x;
                    int inum=(int)(num);
                    if(num==inum)
                        txt.setText(inum + "");
                    else
                        txt.setText(num + "");
                    op = 1;
                    ind = 1;
                }
            }
        });


        bs=(Button)findViewById(R.id.bs);
        bs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(("".equals(txt.getText()+""))||ind==1)
                {
                    txt.setText("-");
                    ind=0;
                }
                else {
                    if("-".equals(txt.getText()+""))
                    {}
                    else {
                        float x = Float.parseFloat(txt.getText() + "");
                        num = x - num;
                        int inum=(int)(num);
                        if(num==inum)
                            txt.setText(inum + "");
                        else
                            txt.setText(num + "");
                        op = 2;
                        ind = 1;
                    }
                }
            }
        });


        bm=(Button)findViewById(R.id.bm);
        bm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if("".equals(txt.getText()+"")||"-".equals(txt.getText()+""))
                {}
                else {
                    float x = Float.parseFloat(txt.getText() + "");
                    if (num == 0)
                        num = x;
                    else
                        num = num * x;
                    int inum=(int)(num);
                    if(num==inum)
                        txt.setText(inum + "");
                    else
                        txt.setText(num + "");
                    op = 3;
                    ind = 1;
                }

            }
        });


        bd=(Button)findViewById(R.id.bd);
        bd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if("".equals(txt.getText()+"")||"-".equals(txt.getText()+""))
                {}
                else {
                    float x = Float.parseFloat(txt.getText() + "");
                    if (num == 0)
                        num = x;
                    else if (x == 0) {
                        txt.setText("Invalid");
                    } else {
                        num = num / x;
                        int inum=(int)(num);
                        if(num==inum)
                            txt.setText(inum + "");
                        else
                            txt.setText(num + "");
                    }
                    op = 4;
                    ind = 1;
                }

            }
        });

        beq=(Button)findViewById(R.id.beq);
        beq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                equalPressed=true;
                if("".equals(txt.getText()+"")||"-".equals(txt.getText()+""))
                {}
                else {
                    if (op == 1) {
                        float x = Float.parseFloat(txt.getText() + "");
                        num = num + x;
                        int inum=(int)(num);
                        if(num==inum)
                            txt.setText(inum + "");
                        else
                            txt.setText(num + "");
                    } else if (op == 2) {
                        float x = Float.parseFloat(txt.getText() + "");
                        num = num - x;
                        int inum=(int)(num);
                        if(num==inum)
                            txt.setText(inum + "");
                        else
                            txt.setText(num + "");
                    } else if (op == 3) {
                        float x = Float.parseFloat(txt.getText() + "");
                        num = num * x;
                        int inum=(int)(num);
                        if(num==inum)
                            txt.setText(inum + "");
                        else
                            txt.setText(num + "");
                    } else if (op == 4) {
                        float x = Float.parseFloat(txt.getText() + "");
                        if (x == 0)
                            txt.setText("Invalid");
                        else {
                            num = num / x;
                            int inum=(int)(num);
                            if(num==inum)
                                txt.setText(inum + "");
                            else
                                txt.setText(num + "");
                        }
                    }
                }
            }
        });

        b_=(Button)findViewById(R.id.b_);
        b_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(equalPressed) {
                    txt.setText("");
                    num=0;
                    dec=0;op=0;
                    equalPressed=false;
                }
                if(ind==1) {
                    txt.setText("");
                    ind=0;
                }
                if(dec==0)
                {
                    txt.setText(txt.getText()+".");
                    dec=1;
                }

            }
        });

        txt=(TextView)findViewById(R.id.txt);
    }



    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }
}
