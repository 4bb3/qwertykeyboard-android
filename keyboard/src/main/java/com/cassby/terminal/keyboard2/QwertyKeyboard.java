package com.cassby.terminal.keyboard2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class QwertyKeyboard extends LinearLayout {

    View rootView;

    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;

    Button q;
    Button w;
    Button e;
    Button r;
    Button t;
    Button y;
    Button u;
    Button i;
    Button o;
    Button p;
    Button a;
    Button s;
    Button d;
    Button f;
    Button g;
    Button h;
    Button j;
    Button k;
    Button l;
    Button z;
    Button x;
    Button c;
    Button v;
    Button b;
    Button n;
    Button m;
    Button dot;

    Button dash;
    Button dash_bottom;
    Button AT;
    ImageButton erase;

    QwertyKeyboardOutput output;

    public QwertyKeyboard(Context context) {
        super(context);
        init(context);
    }

    public QwertyKeyboard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public QwertyKeyboard(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    void init(Context context) {
        rootView = inflate(context, R.layout.keyboard, this);

        q = rootView.findViewById(R.id.Q_button);
        w = rootView.findViewById(R.id.W_button);
        e = rootView.findViewById(R.id.E_button);
        r = rootView.findViewById(R.id.R_button);
        t = rootView.findViewById(R.id.T_button);
        y = rootView.findViewById(R.id.Y_button);
        u = rootView.findViewById(R.id.U_button);
        i = rootView.findViewById(R.id.I_button);
        o = rootView.findViewById(R.id.O_button);
        p = rootView.findViewById(R.id.P_button);
        a = rootView.findViewById(R.id.A_button);
        s = rootView.findViewById(R.id.S_button);
        d = rootView.findViewById(R.id.D_button);
        f = rootView.findViewById(R.id.F_button);
        g = rootView.findViewById(R.id.G_button);
        h = rootView.findViewById(R.id.H_button);
        j = rootView.findViewById(R.id.J_button);
        k = rootView.findViewById(R.id.K_button);
        l = rootView.findViewById(R.id.L_button);
        z = rootView.findViewById(R.id.Z_button);
        x = rootView.findViewById(R.id.X_button);
        c = rootView.findViewById(R.id.C_button);
        v = rootView.findViewById(R.id.V_button);
        b = rootView.findViewById(R.id.B_button);
        n = rootView.findViewById(R.id.N_button);
        m = rootView.findViewById(R.id.M_button);
        dot = rootView.findViewById(R.id.DOT_button);
        dash = rootView.findViewById(R.id.DASH_button);
        dash_bottom = rootView.findViewById(R.id.DOWN_DASH_button);
        erase = rootView.findViewById(R.id.ERASE_button);
        AT = rootView.findViewById(R.id.AT_button);

        button_0 = rootView.findViewById(R.id.button_0);
        button_1 = rootView.findViewById(R.id.button_1);
        button_2 = rootView.findViewById(R.id.button_2);
        button_3 = rootView.findViewById(R.id.button_3);
        button_4 = rootView.findViewById(R.id.button_4);
        button_5 = rootView.findViewById(R.id.button_5);
        button_6 = rootView.findViewById(R.id.button_6);
        button_7 = rootView.findViewById(R.id.button_7);
        button_8 = rootView.findViewById(R.id.button_8);
        button_9 = rootView.findViewById(R.id.button_9);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("q");
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("w");
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("e");
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("r");
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("t");
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("y");
            }
        });


        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("u");
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("i");
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("o");
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("p");
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("a");
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("s");
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("d");
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("f");
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("g");
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("h");
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("j");
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("k");
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("l");
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("z");
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("x");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("c");
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("v");
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("b");
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("n");
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("m");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol(".");
            }
        });

        dash_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("_");
            }
        });

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("-");
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didPressErase();
            }
        });

        AT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.didEnterSymbol("@");
            }
        });
    }

    public void setOutput(QwertyKeyboardOutput output) {
        this.output = output;
    }
}
