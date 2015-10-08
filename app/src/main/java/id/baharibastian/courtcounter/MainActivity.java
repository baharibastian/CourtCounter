package id.baharibastian.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvsta;
    private TextView tvstb;
    private Button btn3a;
    private Button btn2a;
    private Button btnfta;
    private Button btn3b;
    private Button btn2b;
    private Button btnftb;
    private Button btnreset;
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        tvsta = (TextView) findViewById(R.id.tv_score_team_a);
        tvstb = (TextView) findViewById(R.id.tv_score_team_b);
        btn3a = (Button) findViewById(R.id.btn_3_a);
        btn2a = (Button) findViewById(R.id.btn_2_a);
        btnfta = (Button) findViewById(R.id.btn_ft_a);
        btn3b = (Button) findViewById(R.id.btn_3_b);
        btn2b = (Button) findViewById(R.id.btn_2_b);
        btnftb = (Button) findViewById(R.id.btn_ft_b);
        btnreset = (Button) findViewById(R.id.btn_reset);
        scoreTeamA = scoreTeamB = 0;

        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(3);
            }
        });

        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(2);
            }
        });

        btnfta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(1);
            }
        });

        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(3);
            }
        });

        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(2);
            }
        });

        btnftb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(1);
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamB = 0;
                tvsta.setText(scoreTeamA + "");
                tvstb.setText(scoreTeamB + "");
            }
        });
    }

        private void addPointToTeamA (int point) {
            scoreTeamA += point;
            tvstb.setText(scoreTeamA);
        }

        private void addPointToTeamB (int point) {
            scoreTeamB += point;
            tvstb.setText(scoreTeamB);
        }
    }
