package com.example.mocktests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity4 extends AppCompatActivity {
    ProgressBar pb;
    Button nxt_btn,clr_btn;
    int counter = 0;
    int index = 0;
    private TextView question, optionA, optionB, optionC, optionD, ic_exit;
    private CardView cardA, cardB, cardC, cardD;
    //ImageView ic_back;
    private List<Question> questionList = new ArrayList<>();
    int correctcount = 0;
    int wrongcount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Hooks();
        prolog();
        String url1111;
        url1111 = getIntent().getStringExtra("pdf_urls1");

        //physics set1
        if (url1111.contentEquals("phy_set1")) {
            questionList.add(new Question("question1234 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //chemistry set1
        else if (url1111.contentEquals("chem_set1")) {
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //maths set1
        else if (url1111.contentEquals("mat_set1")) {
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //biology set1
        else if (url1111.contentEquals("bio_set1")) {
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ", "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ", "A", "B", "C", "D", "A"));
            setQuestion();
        }

        ic_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 100;
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //ic_back.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view) {
          //      if (index > 0) {
          //          index--;
         //           getQuestionsList();
         //           setQuestion();
         //       }
          //  }
        //});

        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    enablebutton();
                    resetcolour();
            }
        });

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    setQuestion();
                }
                else {
                    counter = 100;
                    gamewon();
                }

                if(index == questionList.size() - 1){
                    nxt_btn.setText("Submit");
                    nxt_btn.setBackgroundColor(getResources().getColor(R.color.Green));
                }

            }
        });

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionA().equals(questionList.get(index).getAnswer())) {
                    Correct(cardA);

                } else {
                    Wrong(cardA);
                }

            }
        });
        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionB().equals(questionList.get(index).getAnswer())) {
                    Correct(cardB);
                } else {
                    Wrong(cardB);
                }

            }
        });
        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionC().equals(questionList.get(index).getAnswer())) {
                    Correct(cardC);

                } else {
                    Wrong(cardC);
                }

            }
        });
        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionD().equals(questionList.get(index).getAnswer())) {
                    Correct(cardD);
                } else {
                    Wrong(cardD);
                }

            }
        });
    }

    public void prolog() {
        pb = (ProgressBar) findViewById(R.id.pb);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                counter++;
                pb.setProgress(counter);


                if (counter == 100) {
                    t.cancel();
                    gamewon();

                }
            }
        };

        t.schedule(tt, 0, 100);
    }

    public void tryagain() {
        Intent intent = new Intent(this, tryagainpage.class);
        startActivity(intent);
    }

    public void Hooks() {
        question = findViewById(R.id.card_quetion);
        optionA = findViewById(R.id.card_optiona);
        optionB = findViewById(R.id.card_optionb);
        optionC = findViewById(R.id.card_optionc);
        optionD = findViewById(R.id.card_optiond);
        cardA = findViewById(R.id.cardA);
        cardB = findViewById(R.id.cardB);
        cardC = findViewById(R.id.cardC);
        cardD = findViewById(R.id.cardD);
        nxt_btn = findViewById(R.id.nxt_btn);
        ic_exit = findViewById(R.id.ic_exit);
        //ic_back = findViewById(R.id.ic_back);
        clr_btn=findViewById(R.id.clr_btn);

    }

    private void getQuestionsList() {

        setQuestion();

    }

    private void setQuestion() {
        question.setText(questionList.get(index).getQuestion());
        optionA.setText(questionList.get(index).getOptionA());
        optionB.setText(questionList.get(index).getOptionB());
        optionC.setText(questionList.get(index).getOptionC());
        optionD.setText(questionList.get(index).getOptionD());
    }


    public void Correct(CardView cardView) {
        cardView.setBackgroundColor(getResources().getColor(R.color.Green));

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctcount++;
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    resetcolour();
                    setQuestion();
                    enablebutton();
                } else {
                    counter = 100;
                    gamewon();
                }

            }
        });
    }

    public void Wrong(CardView cardView) {
        cardView.setBackgroundColor(getResources().getColor(R.color.Red));

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongcount++;
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    resetcolour();
                    setQuestion();
                    enablebutton();

                } else {
                    counter = 100;
                    gamewon();
                }
            }
        });


    }

    private void gamewon() {
        Intent intent = new Intent(MainActivity4.this, wonactivity.class);
        intent.putExtra("Correct", correctcount);
        intent.putExtra("Wrong", wrongcount);
        startActivity(intent);
    }

    public void enablebutton() {
        cardA.setClickable(true);
        cardB.setClickable(true);
        cardC.setClickable(true);
        cardD.setClickable(true);
    }

    public void disablebutton() {
        cardA.setClickable(false);
        cardB.setClickable(false);
        cardC.setClickable(false);
        cardD.setClickable(false);
    }

    public void resetcolour() {
        cardA.setBackgroundColor(getResources().getColor(R.color.white));
        cardB.setBackgroundColor(getResources().getColor(R.color.white));
        cardC.setBackgroundColor(getResources().getColor(R.color.white));
        cardD.setBackgroundColor(getResources().getColor(R.color.white));
    }
}







